package lesson_5

fun main() {

    val numberFirst = 5
    val numberSecond = 2

    println("Что бы пройти дальше, решите пример $numberFirst+$numberSecond:")

    val number = readln().toInt()

    val wall = if (number == (numberFirst+numberSecond)) "Добро пожаловать!" else "Доступ запрещен."

    println(wall)


}





