package lesson_6


const val SECRET_NUMBER = 7
const val TRY = 5

fun main() {

    var gameTry = TRY

    println("угадайте число от 1 до 9:")

    do {
        val number = readln().toInt()
        gameTry--

        if (number == SECRET_NUMBER) {
            println("Это была великолепная игра!")
        } else println("вы не угадали, осталось попыток $gameTry")

    } while (gameTry > 0)

    val attention = if (gameTry == 0) "Правильное число $SECRET_NUMBER" else " "

    println(attention)


}