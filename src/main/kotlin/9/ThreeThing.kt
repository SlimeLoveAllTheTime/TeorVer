package `9`

fun main() {
    val n = 10000000    
    var m = 0
    for (i in 1..n) {
        val quality1 = (1..100).random()
        val quality2 = (1..100).random()
        val quality3 = (1..100).random()
        if ((quality1 in (1..90) && (quality2 in (91..99) || quality3 in (91..99)))
                || (quality2 in (1..90) && (quality1 in (91..99) || quality3 in (91..99)))
                || (quality3 in (1..90) && (quality1 in (91..99) || quality2 in (91..99)))) m++
    }
    val result = m.toDouble() / n
    println("вероятность равна $result")
}