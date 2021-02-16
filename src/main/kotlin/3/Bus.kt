package `3`

import kotlin.random.Random.Default.nextDouble

fun main() {
    val n = 1000000

    var busA = 0
    var overTwo = 0

    for (i in 1..n) {

        val period = nextDouble(0.0, 12.0)
        val busTime = nextDouble(0.0, 4.0)



        if ((period in busTime..4.0) || (period in 4.0..8.0 && busTime > 2)
                || (period > 6 && period - 6 > busTime)) busA++

        if ((period >= 10) || (period in 6.0..8.0) || (period in 2.0..4.0)
                || (period in busTime - 2..busTime) || (period in busTime + 4..busTime + 6)) overTwo++
    }

    val resultA = busA.toDouble() / n
    val resultB = overTwo.toDouble() / n

    println("Вероятность приезда автобуса линии A: $resultA")
    println("Вероятность ожидания не больше двух минут: $resultB")

}