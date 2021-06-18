package de.fhac.ewi.routes

import de.fhac.ewi.module
import io.ktor.http.*
import io.ktor.server.testing.*
import org.junit.Test
import kotlin.test.assertEquals

class OptimizationRouteTest {
    @Test
    fun optimizeGridGroupA4() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Post, "/api/optimize") {
                addHeader("content-type", "application/json")
                setBody("{\"grid\":{\"pipes\":[{\"source\":\"v1-1621177974627-4475240057456\",\"sourceHandle\":\"a\",\"target\":\"v1-1621186044694-1690334569077\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623948434502-6584421336014\",\"length\":226.3,\"coverageHeight\":0.6,\"data\":{\"length\":226.3,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186044694-1690334569077\",\"sourceHandle\":\"b\",\"target\":\"v1-1621185871251-9919604707138\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623948458559-3139937849080\",\"length\":166.4,\"coverageHeight\":0.6,\"data\":{\"length\":166.4,\"coverageHeight\":0.6}},{\"source\":\"v1-1621185871251-9919604707138\",\"sourceHandle\":\"a\",\"target\":\"v1-1621185898211-7831046798307\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623948615596-9013208595355\",\"length\":59.8,\"coverageHeight\":0.6,\"data\":{\"length\":59.8,\"coverageHeight\":0.6}},{\"source\":\"v1-1621185871251-9919604707138\",\"sourceHandle\":\"b\",\"target\":\"v1-1621185911440-4962016131877\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623948781959-6461274424182\",\"length\":201.75,\"coverageHeight\":0.6,\"data\":{\"length\":201.75,\"coverageHeight\":0.6}},{\"source\":\"v1-1621185911440-4962016131877\",\"sourceHandle\":\"a\",\"target\":\"v1-1621185949072-5762848366935\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623948850503-7199906600014\",\"length\":156.09,\"coverageHeight\":0.6,\"data\":{\"length\":156.09,\"coverageHeight\":0.6}},{\"source\":\"v1-1621185911440-4962016131877\",\"sourceHandle\":\"b\",\"target\":\"v1-1621185960881-2278928340772\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623948888657-1255433869119\",\"length\":130.5,\"coverageHeight\":0.6,\"data\":{\"length\":130.5,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186044694-1690334569077\",\"sourceHandle\":\"a\",\"target\":\"v1-1621185980565-8743695485867\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623948916232-9530535697017\",\"length\":56.89,\"coverageHeight\":0.6,\"data\":{\"length\":56.89,\"coverageHeight\":0.6}},{\"source\":\"v1-1621185980565-8743695485867\",\"sourceHandle\":\"b\",\"target\":\"v1-1621185993404-8663399000808\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623948933229-3445270086926\",\"length\":102.1,\"coverageHeight\":0.6,\"data\":{\"length\":102.1,\"coverageHeight\":0.6}},{\"source\":\"v1-1621185993404-8663399000808\",\"sourceHandle\":\"a\",\"target\":\"v1-1621186006012-3164455616714\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623948948357-5792158181489\",\"length\":84.81,\"coverageHeight\":0.6,\"data\":{\"length\":84.81,\"coverageHeight\":0.6}},{\"source\":\"v1-1621185993404-8663399000808\",\"sourceHandle\":\"b\",\"target\":\"v1-1621186022327-2899379456646\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623948979515-7440844588284\",\"length\":112.6,\"coverageHeight\":0.6,\"data\":{\"length\":112.6,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186022327-2899379456646\",\"sourceHandle\":\"a\",\"target\":\"v1-1621186037332-6365011053297\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949007333-3890636504980\",\"length\":112.6,\"coverageHeight\":0.6,\"data\":{\"length\":112.6,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186022327-2899379456646\",\"sourceHandle\":\"b\",\"target\":\"v1-1621186682472-9169377069812\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949020704-1888345307649\",\"length\":74.42,\"coverageHeight\":0.6,\"data\":{\"length\":74.42,\"coverageHeight\":0.6}},{\"source\":\"v1-1621185980565-8743695485867\",\"sourceHandle\":\"a\",\"target\":\"v1-1621186098528-4388784622092\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949040469-7981701803438\",\"length\":76.44,\"coverageHeight\":0.6,\"data\":{\"length\":76.44,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186098528-4388784622092\",\"sourceHandle\":\"b\",\"target\":\"v1-1621186594588-2147702602155\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949064745-3144362560075\",\"length\":66.97,\"coverageHeight\":0.6,\"data\":{\"length\":66.97,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186594588-2147702602155\",\"sourceHandle\":\"b\",\"target\":\"v1-1621186629583-9384125582204\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949166001-5868623589475\",\"length\":88.37,\"coverageHeight\":0.6,\"data\":{\"length\":88.37,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186629583-9384125582204\",\"sourceHandle\":\"a\",\"target\":\"v1-1621186652759-4960965729761\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949185608-4284341811845\",\"length\":74.58,\"coverageHeight\":0.6,\"data\":{\"length\":74.58,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186629583-9384125582204\",\"sourceHandle\":\"b\",\"target\":\"v1-1621186812935-9961997802525\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949203223-7316174764911\",\"length\":96.04,\"coverageHeight\":0.6,\"data\":{\"length\":96.04,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186812935-9961997802525\",\"sourceHandle\":\"a\",\"target\":\"v1-1621186851560-6291085778803\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949218134-8718118142529\",\"length\":144.4,\"coverageHeight\":0.6,\"data\":{\"length\":144.4,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186851560-6291085778803\",\"sourceHandle\":\"b\",\"target\":\"v1-1621186913293-8028595782128\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949273234-4405752756939\",\"length\":184.14,\"coverageHeight\":0.6,\"data\":{\"length\":184.14,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186812935-9961997802525\",\"sourceHandle\":\"b\",\"target\":\"v1-1621186926888-1586477936382\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949304200-7885690605181\",\"length\":148.7,\"coverageHeight\":0.6,\"data\":{\"length\":148.7,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186926888-1586477936382\",\"sourceHandle\":\"b\",\"target\":\"v1-1621186938005-8206520472260\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949319586-9883630363592\",\"length\":196.38,\"coverageHeight\":0.6,\"data\":{\"length\":196.38,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186594588-2147702602155\",\"sourceHandle\":\"a\",\"target\":\"v1-1621186954765-7676883760911\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949353412-8681006918965\",\"length\":94.27,\"coverageHeight\":0.6,\"data\":{\"length\":94.27,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186954765-7676883760911\",\"sourceHandle\":\"b\",\"target\":\"v1-1621187146185-4822434399630\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949375570-2446857374757\",\"length\":95.41,\"coverageHeight\":0.6,\"data\":{\"length\":95.41,\"coverageHeight\":0.6}},{\"source\":\"v1-1621187146185-4822434399630\",\"sourceHandle\":\"a\",\"target\":\"v1-1621187165108-3673108523208\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949393378-4928790744688\",\"length\":68.95,\"coverageHeight\":0.6,\"data\":{\"length\":68.95,\"coverageHeight\":0.6}},{\"source\":\"v1-1621187146185-4822434399630\",\"sourceHandle\":\"b\",\"target\":\"v1-1621187186495-8646703581612\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949418756-1510550035278\",\"length\":52.34,\"coverageHeight\":0.6,\"data\":{\"length\":52.34,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186954765-7676883760911\",\"sourceHandle\":\"a\",\"target\":\"v1-1621187204200-7802240284225\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949435568-3329269489872\",\"length\":109.61,\"coverageHeight\":0.6,\"data\":{\"length\":109.61,\"coverageHeight\":0.6}},{\"source\":\"v1-1621187204200-7802240284225\",\"sourceHandle\":\"b\",\"target\":\"v1-1621187356851-6725650088354\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949446737-1302856814999\",\"length\":85.67,\"coverageHeight\":0.6,\"data\":{\"length\":85.67,\"coverageHeight\":0.6}},{\"source\":\"v1-1621187356851-6725650088354\",\"sourceHandle\":\"b\",\"target\":\"v1-1621187373900-1465702534212\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623949456551-3978600665438\",\"length\":142,\"coverageHeight\":0.6,\"data\":{\"length\":142,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186851560-6291085778803\",\"sourceHandle\":\"a\",\"target\":\"v1-1621186901941-8243265721583\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1623959200709-5126784923270\",\"length\":28.42,\"coverageHeight\":0.6,\"data\":{\"length\":28.42,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186851560-6291085778803\",\"sourceHandle\":\"c\",\"target\":\"v2-1624028723438-1052911824249\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1624032999182-8606647119451\",\"length\":1,\"coverageHeight\":0.6,\"data\":{\"length\":1,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186901941-8243265721583\",\"sourceHandle\":\"c\",\"target\":\"v2-1624028850197-5135908916415\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1624033074556-8367533534563\",\"length\":1,\"coverageHeight\":0.6,\"data\":{\"length\":1,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186913293-8028595782128\",\"sourceHandle\":\"b\",\"target\":\"v2-1624028894414-8835314531313\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1624033184126-2884962682452\",\"length\":1,\"coverageHeight\":0.6,\"data\":{\"length\":1,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186926888-1586477936382\",\"sourceHandle\":\"c\",\"target\":\"v2-1624028989153-7927415501096\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1624033275621-4532491335244\",\"length\":1,\"coverageHeight\":0.6,\"data\":{\"length\":1,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186938005-8206520472260\",\"sourceHandle\":\"b\",\"target\":\"v2-1624029039132-2100682776398\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1624033334996-4992586427114\",\"length\":1,\"coverageHeight\":0.6,\"data\":{\"length\":1,\"coverageHeight\":0.6}},{\"source\":\"v1-1621186954765-7676883760911\",\"sourceHandle\":\"c\",\"target\":\"v2-1624029085817-2614682412225\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1624033401580-7642227530902\",\"length\":1,\"coverageHeight\":0.6,\"data\":{\"length\":1,\"coverageHeight\":0.6}},{\"source\":\"v1-1621187146185-4822434399630\",\"sourceHandle\":\"c\",\"target\":\"v2-1624029152833-3376842151807\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1624033519190-2193329642998\",\"length\":1,\"coverageHeight\":0.6,\"data\":{\"length\":1,\"coverageHeight\":0.6}},{\"source\":\"v1-1621187165108-3673108523208\",\"sourceHandle\":\"b\",\"target\":\"v2-1624029299000-1129314521372\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1624033602226-4861509157972\",\"length\":1,\"coverageHeight\":0.6,\"data\":{\"length\":1,\"coverageHeight\":0.6}},{\"source\":\"v1-1621187186495-8646703581612\",\"sourceHandle\":\"b\",\"target\":\"v2-1624029381883-6388877206641\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1624033700237-5375027903875\",\"length\":1,\"coverageHeight\":0.6,\"data\":{\"length\":1,\"coverageHeight\":0.6}},{\"source\":\"v1-1621187204200-7802240284225\",\"sourceHandle\":\"a\",\"target\":\"v2-1624029489658-8727896907510\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1624033716344-4101127446334\",\"length\":1,\"coverageHeight\":0.6,\"data\":{\"length\":1,\"coverageHeight\":0.6}},{\"source\":\"v1-1621187356851-6725650088354\",\"sourceHandle\":\"a\",\"target\":\"v2-1624029544074-7147490112091\",\"targetHandle\":null,\"animated\":true,\"type\":\"DEFAULT_EDGE\",\"arrowHeadType\":\"arrowclosed\",\"style\":{\"stroke\":\"rgb(253 126 20)\",\"strokeWidth\":\"3px\"},\"id\":\"v2-1624033757712-1040632974841\",\"length\":1,\"coverageHeight\":0.6,\"data\":{\"length\":1,\"coverageHeight\":0.6}}],\"inputNodes\":[{\"flowTemperatureTemplate\":\"x+70\",\"returnTemperatureTemplate\":\"x+60\",\"data\":{\"label\":\"Erzeuger\"},\"position\":{\"x\":-390,\"y\":84},\"type\":\"INPUT_NODE\",\"id\":\"v1-1621177974627-4475240057456\"}],\"intermediateNodes\":[{\"label\":\"Schuetzenstr. (bis 15/26)\",\"id\":\"v1-1621185871251-9919604707138\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":-262,\"y\":302},\"data\":{\"label\":\"Schuetzenstr. (bis 15/26)\"}},{\"label\":\"Gerberstr.\",\"id\":\"v1-1621185898211-7831046798307\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":-15,\"y\":304},\"data\":{\"label\":\"Gerberstr.\"}},{\"label\":\"Schuetzenstr. (bis Kleine Rurstr.)\",\"id\":\"v1-1621185911440-4962016131877\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":-287,\"y\":542},\"data\":{\"label\":\"Schuetzenstr. (bis Kleine Rurstr.)\"}},{\"label\":\"Kleine Rurstr.\",\"id\":\"v1-1621185949072-5762848366935\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":-33,\"y\":649},\"data\":{\"label\":\"Kleine Rurstr.\"}},{\"label\":\"Grosserurstr. (Block 10)\",\"id\":\"v1-1621185960881-2278928340772\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":-263,\"y\":771},\"data\":{\"label\":\"Grosserurstr. (Block 10)\"}},{\"id\":\"v1-1621185980565-8743695485867\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":153,\"y\":132},\"data\":{\"label\":\"Schirmerstr.\"}},{\"id\":\"v1-1621185993404-8663399000808\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":134,\"y\":223},\"data\":{\"label\":\"An der Synagoge\"}},{\"id\":\"v1-1621186006012-3164455616714\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":315,\"y\":226},\"data\":{\"label\":\"Bocksgasse\"}},{\"id\":\"v1-1621186022327-2899379456646\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":161,\"y\":406.00000000000006},\"data\":{\"label\":\"Gruenstr.\"}},{\"id\":\"v1-1621186037332-6365011053297\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":297,\"y\":408},\"data\":{\"label\":\"Raderstr.\"}},{\"label\":\"Zuleitung\",\"id\":\"v1-1621186044694-1690334569077\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":-202,\"y\":128},\"data\":{\"label\":\"Zuleitung\"}},{\"id\":\"v1-1621186098528-4388784622092\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":473,\"y\":135},\"data\":{\"label\":\"Schirmerstr. 1a-9\"}},{\"label\":\"Duesseldorferstr. 23-31 (Block 3)\",\"id\":\"v1-1621186594588-2147702602155\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":420,\"y\":271},\"data\":{\"label\":\"Duesseldorferstr. 23-31 (Block 3)\"}},{\"label\":\"Duesseldorferstr. 8-21 (Block 4+6)\",\"id\":\"v1-1621186629583-9384125582204\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":416,\"y\":366},\"data\":{\"label\":\"Duesseldorferstr. 8-21 (Block 4+6)\"}},{\"label\":\"Kapuzinerstr. 1-9 (Block 4)\",\"id\":\"v1-1621186652759-4960965729761\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":775,\"y\":365},\"data\":{\"label\":\"Kapuzinerstr. 1-9 (Block 4)\"}},{\"label\":\"2-6\",\"id\":\"v1-1621186682472-9169377069812\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":177,\"y\":498},\"data\":{\"label\":\"2-6\"}},{\"label\":\"3-4\",\"id\":\"v1-1621186812935-9961997802525\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":523,\"y\":468},\"data\":{\"label\":\"3-4\"}},{\"label\":\"Koelnstr. 1-13\",\"id\":\"v1-1621186851560-6291085778803\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":701,\"y\":468},\"data\":{\"label\":\"Koelnstr. 1-13\"}},{\"label\":\"Koelnstr. 14-19\",\"id\":\"v1-1621186901941-8243265721583\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":854,\"y\":557},\"data\":{\"label\":\"Koelnstr. 14-19\"}},{\"label\":\"Stiftherrenstr.\",\"id\":\"v1-1621186913293-8028595782128\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":707,\"y\":696},\"data\":{\"label\":\"Stiftherrenstr.\"}},{\"label\":\"Marktstr.\",\"id\":\"v1-1621186926888-1586477936382\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":506,\"y\":629},\"data\":{\"label\":\"Marktstr.\"}},{\"label\":\"Grosse Rurstr. (Block 8+11)\",\"id\":\"v1-1621186938005-8206520472260\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":445,\"y\":791},\"data\":{\"label\":\"Grosse Rurstr. (Block 8+11)\"}},{\"label\":\"Schossstr. 2-8 (Block 4)\",\"id\":\"v1-1621186954765-7676883760911\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":1044,\"y\":335},\"data\":{\"label\":\"Schossstr. 2-8 (Block 4)\"}},{\"label\":\"Baierstr. 6-15\",\"id\":\"v1-1621187146185-4822434399630\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":1079,\"y\":428},\"data\":{\"label\":\"Baierstr. 6-15\"}},{\"label\":\"Kapuzinerstr. 10-17 (Block 5+9)\",\"id\":\"v1-1621187165108-3673108523208\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":1233,\"y\":421},\"data\":{\"label\":\"Kapuzinerstr. 10-17 (Block 5+9)\"}},{\"label\":\"Baierstr. 2-4\",\"id\":\"v1-1621187186495-8646703581612\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":1089,\"y\":614},\"data\":{\"label\":\"Baierstr. 2-4\"}},{\"label\":\"Schlossstr. 10-16 (Block 5)\",\"id\":\"v1-1621187204200-7802240284225\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":1441,\"y\":189},\"data\":{\"label\":\"Schlossstr. 10-16 (Block 5)\"}},{\"label\":\"Schlossstr. 18-22 (Block 9)\",\"id\":\"v1-1621187356851-6725650088354\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":1459,\"y\":481},\"data\":{\"label\":\"Schlossstr. 18-22 (Block 9)\"}},{\"label\":\"Poststr.\",\"id\":\"v1-1621187373900-1465702534212\",\"type\":\"INTERMEDIATE_NODE\",\"position\":{\"x\":1542,\"y\":659},\"data\":{\"label\":\"Poststr.\"}}],\"outputNodes\":[{\"label\":\"Koelnstr. 1-13 Entnahmestelle\",\"thermalEnergyDemand\":98700,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":12,\"id\":\"v2-1624028723438-1052911824249\",\"type\":\"OUTPUT_NODE\",\"position\":{\"x\":577,\"y\":544},\"data\":{\"label\":\"Koelnstr. 1-13 Entnahmestelle\",\"thermalEnergyDemand\":98700,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":12}},{\"label\":\"Koelnstr. 14-19 Entnahmestelle\",\"thermalEnergyDemand\":78090,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":7,\"id\":\"v2-1624028850197-5135908916415\",\"type\":\"OUTPUT_NODE\",\"position\":{\"x\":798,\"y\":638},\"data\":{\"label\":\"Koelnstr. 14-19 Entnahmestelle\",\"thermalEnergyDemand\":78090,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":7}},{\"label\":\"Stiftherrenstr. Entnahmestelle\",\"thermalEnergyDemand\":2503400,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":15,\"id\":\"v2-1624028894414-8835314531313\",\"type\":\"OUTPUT_NODE\",\"position\":{\"x\":721,\"y\":793},\"data\":{\"label\":\"Stiftherrenstr. Entnahmestelle\",\"thermalEnergyDemand\":2503400,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":15}},{\"label\":\"Marktstr. Entnahmestelle\",\"thermalEnergyDemand\":144030,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":12,\"id\":\"v2-1624028989153-7927415501096\",\"type\":\"OUTPUT_NODE\",\"position\":{\"x\":309,\"y\":669},\"data\":{\"label\":\"Marktstr. Entnahmestelle\",\"thermalEnergyDemand\":144030,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":12}},{\"label\":\"GroÃ\u009Fe Rurstr. Entnahmestelle\",\"thermalEnergyDemand\":142140,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":9,\"id\":\"v2-1624029039132-2100682776398\",\"type\":\"OUTPUT_NODE\",\"position\":{\"x\":443,\"y\":907},\"data\":{\"label\":\"GroÃ\u009Fe Rurstr. Entnahmestelle\",\"thermalEnergyDemand\":142140,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":9}},{\"label\":\"Schlossstr. 2-8 Entnahmestelle\",\"thermalEnergyDemand\":109930,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":6,\"id\":\"v2-1624029085817-2614682412225\",\"type\":\"OUTPUT_NODE\",\"position\":{\"x\":1156,\"y\":269},\"data\":{\"label\":\"Schlossstr. 2-8 Entnahmestelle\",\"thermalEnergyDemand\":109930,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":6}},{\"label\":\"Baierstr. 6-15 Entnahmestelle\",\"thermalEnergyDemand\":101410,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":9,\"id\":\"v2-1624029152833-3376842151807\",\"type\":\"OUTPUT_NODE\",\"position\":{\"x\":959,\"y\":489},\"data\":{\"label\":\"Baierstr. 6-15 Entnahmestelle\",\"thermalEnergyDemand\":101410,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":9}},{\"label\":\"Kapuzinestr. Entnahmestelle\",\"thermalEnergyDemand\":235520,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":5,\"id\":\"v2-1624029299000-1129314521372\",\"type\":\"OUTPUT_NODE\",\"position\":{\"x\":1250,\"y\":546},\"data\":{\"label\":\"Kapuzinestr. Entnahmestelle\",\"thermalEnergyDemand\":235520,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":5}},{\"label\":\"Baierstr. 2-4 Entnahmestelle\",\"thermalEnergyDemand\":68450,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":4,\"id\":\"v2-1624029381883-6388877206641\",\"type\":\"OUTPUT_NODE\",\"position\":{\"x\":1032,\"y\":733},\"data\":{\"label\":\"Baierstr. 2-4 Entnahmestelle\",\"thermalEnergyDemand\":68450,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":4}},{\"label\":\"Schlossstr. 10-16 Entnahmestelle\",\"thermalEnergyDemand\":122140,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":4,\"id\":\"v2-1624029489658-8727896907510\",\"type\":\"OUTPUT_NODE\",\"position\":{\"x\":1630,\"y\":241},\"data\":{\"label\":\"Schlossstr. 10-16 Entnahmestelle\",\"thermalEnergyDemand\":122140,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":4}},{\"label\":\"Schlossstr. 18-22 Entnahmestelle\",\"thermalEnergyDemand\":87830,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":4,\"id\":\"v2-1624029544074-7147490112091\",\"type\":\"OUTPUT_NODE\",\"position\":{\"x\":1680,\"y\":530},\"data\":{\"label\":\"Schlossstr. 18-22 Entnahmestelle\",\"thermalEnergyDemand\":87830,\"pressureLoss\":0.56,\"loadProfileName\":\"EFH\",\"replicas\":4}}],\"temperatureSeries\":\"Schemm 2018\"},\"pipeTypes\":[{\"diameter\":20,\"costPerMeter\":391,\"isolationThickness\":40,\"distanceBetweenPipes\":200},{\"diameter\":25,\"costPerMeter\":396,\"isolationThickness\":40,\"distanceBetweenPipes\":200},{\"diameter\":32,\"costPerMeter\":422,\"isolationThickness\":40,\"distanceBetweenPipes\":200},{\"diameter\":40,\"costPerMeter\":437,\"isolationThickness\":40,\"distanceBetweenPipes\":200},{\"diameter\":50,\"costPerMeter\":495,\"isolationThickness\":40,\"distanceBetweenPipes\":200},{\"diameter\":65,\"costPerMeter\":537,\"isolationThickness\":40,\"distanceBetweenPipes\":200},{\"diameter\":80,\"costPerMeter\":616,\"isolationThickness\":40,\"distanceBetweenPipes\":200},{\"diameter\":100,\"costPerMeter\":790,\"isolationThickness\":40,\"distanceBetweenPipes\":200},{\"diameter\":125,\"costPerMeter\":912,\"isolationThickness\":40,\"distanceBetweenPipes\":200},{\"diameter\":150,\"costPerMeter\":1101,\"isolationThickness\":40,\"distanceBetweenPipes\":200},{\"diameter\":200,\"costPerMeter\":1311,\"isolationThickness\":40,\"distanceBetweenPipes\":200},{\"diameter\":250,\"costPerMeter\":1755,\"isolationThickness\":40,\"distanceBetweenPipes\":200}],\"gridOperatingCostTemplate\":\"x*0.001\",\"pumpInvestCostTemplate\":\"500+x/1000*500\",\"heatGenerationCost\":0.3,\"lifespanOfGrid\":25,\"lifespanOfPump\":10,\"wacc\":12,\"electricityCost\":0.3,\"electricalEfficiency\":0.9,\"hydraulicEfficiency\":0.75}")
            }.apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }

        }
    }
}