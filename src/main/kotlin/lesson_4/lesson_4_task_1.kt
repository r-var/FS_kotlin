package lesson_4

const val TABLE_COUNT = 13

fun main() {
    val todayReserved = 13
    val tomorrowReserved = 4

    println("Доступность столиков на сегодня:${TABLE_COUNT != todayReserved}")
    println("Доступность столиков на завтра:${TABLE_COUNT != tomorrowReserved}")

}