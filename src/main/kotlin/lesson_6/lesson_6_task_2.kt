package lesson_6

fun main() {

    println("Введите число для таймера:")

    val timeSecond = readln().toInt()
    val sleepTimer = timeSecond * 1000

    Thread.sleep(sleepTimer.toLong())
    println("Прошло $timeSecond секунд")

}