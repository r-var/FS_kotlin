package lesson_5

const val MAX_NUMBER = 100
const val MIN_NUMBER = 1

fun main() {

    println(
        """Введите два числа от 1 до 100.
        |Введите первое число:
    """.trimMargin()
    )

    val numberFirst = readln().toInt()

    println("Введите второе число:")

    val numberSecond = readln().toInt()

    val result =
        if ((numberFirst in MIN_NUMBER..MAX_NUMBER) and (numberSecond in MIN_NUMBER..MAX_NUMBER))
            "Поздравляем! Вы выиграли главный приз!"
        else if ((numberFirst in MIN_NUMBER..MAX_NUMBER) or (numberSecond in MIN_NUMBER..MAX_NUMBER))
            "“Вы выиграли утешительный приз!"
        else "Неудача! Крутите барабан!"

    val message = if (result == "Неудача! Крутите барабан!") """
        Вы ввели $numberFirst, $numberSecond
        Нужно ввести два числа от 1 до 100.
    """.trimIndent()
    else ""

    println(result)
    println(message)

}

