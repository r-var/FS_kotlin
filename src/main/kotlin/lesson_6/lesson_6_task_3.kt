package lesson_6

fun main() {
    println("Введите число для таймера:")

    val timerSecond = readln().toInt()
    var second = 0
    var last = timerSecond

    while (timerSecond >= second) {
        println("Прошло ${second++}, осталось секунд ${last--} ")
        Thread.sleep(1000)
    }

    println("Время вышло")

}