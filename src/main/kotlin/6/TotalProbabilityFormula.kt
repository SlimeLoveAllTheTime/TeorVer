package `6`

fun main() {
    val n = 1000000000
    var m = 0
    for (i in 1..n) {
        val batchOfProducts1 = listOf('Н', 'Н', 'Н', 'Н', 'Н', 'Н', 'Н', 'Н', 'Н', 'Н', 'Н', 'Б')
        val batchOfProducts2 = mutableListOf('Н', 'Н', 'Н', 'Н', 'Н', 'Н', 'Н', 'Н', 'Н', 'Б')
        val elem = batchOfProducts1.random()
        batchOfProducts2.add(elem)
        if (batchOfProducts2.random() == 'Б') m++
    }
    val result = m.toDouble() / n
    println("Вероятность равна $result")
}