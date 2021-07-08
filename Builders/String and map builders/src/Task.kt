import java.util.HashMap

fun <N, S> buildMap(build: HashMap<N, S>.() -> Unit): Map<N, S> {
    var map = HashMap<N, S>()
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
