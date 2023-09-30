package lesson_5

const val AGE_OF_MAJORITY = 18
fun main() {

    val userYear = readln().toInt()

    val userAge = 2023 - userYear

    val result = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else if (userYear == 16 || userYear == 17) "Показать экран с огранисением контентом"
    else "Вернуться на главный экран"

    println(result)

}
