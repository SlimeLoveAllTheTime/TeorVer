package `7`

fun main() {
    var fifthShot = 0
    var firstIsShooter1 = 0
    while (fifthShot < 10000000) {
        val first = (1..2).random()
        var shooter1 = 40
        var shooter2 = 50
        for (j in 0..4) {
            val shot = (1..100).random()
            if (first == 1) {
                if (j in 0..4 step 2) {
                    if (shot in (1..shooter1)) {
                        if (j == 4) {
                            fifthShot++
                            firstIsShooter1++
                        }
                        break
                    }
                }
                if (j in 1..4 step 2 && shot in (1..shooter2)) break
            }
            if (first == 2) {
                if (j in 0..4 step 2) {
                    if (shot in (1..shooter2)) {
                        if (j == 4) fifthShot++
                        break
                    }
                }
                if (j in 1..4 step 2 && shot in (1..shooter1)) break
            }
            if (first == 1) {
                when (j) {
                    0 -> shooter1 += 5
                    1 -> shooter2 += 5
                    2 -> shooter1 += 5
                    3 -> shooter2 += 5
                    4 -> shooter1 += 5
                }
            }
            if (first == 2) {
                when (j) {
                    0 -> shooter2 += 5
                    1 -> shooter1 += 5
                    2 -> shooter2 += 5
                    3 -> shooter1 += 5
                    4 -> shooter2 += 5
                }
            }
        }
    }
    val result = firstIsShooter1.toDouble() / fifthShot
    println(fifthShot)
    println(firstIsShooter1)
    println("Вероятность равна $result")
}