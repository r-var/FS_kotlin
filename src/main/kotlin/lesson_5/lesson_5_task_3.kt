package lesson_5

const val SECRET_NUMBER_FIRST = 10
const val SECRET_NUMBER_SECOND = 20
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
        if (((numberFirst in MIN_NUMBER..MAX_NUMBER) == (numberFirst == SECRET_NUMBER_FIRST)) and
            ((numberSecond in MIN_NUMBER..MAX_NUMBER) == (numberSecond == SECRET_NUMBER_SECOND))
        )
            "Поздравляем! Вы выиграли главный приз!"
        else if (((numberFirst in MIN_NUMBER..MAX_NUMBER) or (numberFirst == SECRET_NUMBER_FIRST)) or
            ((numberSecond in MIN_NUMBER..MAX_NUMBER) or (numberSecond == SECRET_NUMBER_SECOND))
        )
            "Вы выиграли утешительный приз!"
        else "Неудача! Крутите барабан!"

    val message = if (result == "Неудача! Крутите барабан!") """
        Вы ввели $numberFirst, $numberSecond
        Нужно ввести два числа от 1 до 100.
    """.trimIndent()
    else ""

    println(result)
    println(message)

}

