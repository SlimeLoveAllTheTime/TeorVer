package `2`

fun main() {
    val deck = Deck()
    deck.createDeck()
    deck.deck36.shuffle()
    val n = 100000000
    var m = 0
    for (i in 1..n) {
        deck.deck36.shuffle()
        val firstTry = deck.deck36.random()
        deck.deck36.shuffle()
        val secondTry = deck.deck36.random()
        if (firstTry.cardSuit == secondTry.cardSuit) m++
    }
    val result = m.toDouble() / n
    println("количество попыток: $n")
    println("количество выпадения карт одномастных подряд: $m")
    print("вероятность равна: $result")
}

class Deck {

    val deck36 = mutableListOf<Card>()

    fun createDeck() {
        var count = 0
        var cardType = ""
        while (count < 9) {
            when (count) {
                0 -> cardType = "6"
                1 -> cardType = "7"
                2 -> cardType = "8"
                3 -> cardType = "9"
                4 -> cardType = "10"
                5 -> cardType = "Валет"
                6 -> cardType = "Дама"
                7 -> cardType = "Король"
                8 -> cardType = "Туз"
            }
            deck36.add(Card(cardType, "Пик"))
            deck36.add(Card(cardType, "Черв"))
            deck36.add(Card(cardType, "Крест"))
            deck36.add(Card(cardType, "Бубна"))
            count++
        }
    }
}