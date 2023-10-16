package lesson_6

fun main() {

    println("Введите число для таймера:")

    val timerSecond = readln().toInt()
    var second = 0


    while (timerSecond >= second) {
        println("Прошло ${second++} секунд")
        Thread.sleep(1000)
    }


}