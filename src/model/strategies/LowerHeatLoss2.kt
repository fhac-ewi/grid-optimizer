package de.fhac.ewi.model.strategies

import de.fhac.ewi.model.Optimizer
import de.fhac.ewi.util.maxOrElse

/**
 * Wärmeverluste pro Meter im kritischen Pfad bestimmen, dann gucken welche Rohre da drüber liegen -> Diese müssen vergrößert werden.
 */
object LowerHeatLoss2 : Strategy {
    override fun apply(optimizer: Optimizer): Unit = with(optimizer) {
        val ns = listOf(10)
        for (n in ns) {
            val criticalHeatLoss = grid.criticalPath.sumOf { it.heatLoss.sum() } / grid.criticalPath.sumOf { it.length }
            var lowerHeatLossFound: Boolean
            do {
                val pipes = grid.pipes
                    .sortedByDescending { it.heatLoss.sum() / it.length / criticalHeatLoss }
                    .take(n)
                    .sortedByDescending { it.source.pathToSource.size }
                lowerHeatLossFound = optimizePipes(pipes, skipBiggerThenCurrent = true, maxDifferenceToCurrent = 1)
            } while (lowerHeatLossFound)
        }
    }
}