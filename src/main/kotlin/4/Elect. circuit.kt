package `4`

import java.lang.Math.random

fun main() {

    val n = 10000000
    var count = 0

    for (i in 1..n) {
        val k = random()
        val k1 = random()
        val k2 = random()

        if (k <= 0.3 || (k1 <= 0.2 && k2 <= 0.2)) count++

    }

    val result = count.toDouble() / n

    println("Вероятность разрыва цепи: $result")

}