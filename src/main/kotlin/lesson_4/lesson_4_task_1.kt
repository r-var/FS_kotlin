package lesson_4

const val FREE_TABLE = 13

fun main() {
    val todayTable = 13
    val tomorrowTable = 4

    println("Доступность столиков на сегодня:${FREE_TABLE != todayTable}")
    println("Доступность столиков на завтра:${FREE_TABLE != tomorrowTable}")

}