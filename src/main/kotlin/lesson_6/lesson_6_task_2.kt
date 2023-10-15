package lesson_6

fun main() {

    println("Введите число для таймера:")

    val timerSecond = readln().toInt()
    var second = 0

    do {
        println("Прошло ${second++} секунд")
        Thread.sleep(1000)

    } while (timerSecond >= second)


}