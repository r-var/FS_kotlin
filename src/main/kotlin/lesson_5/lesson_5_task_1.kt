package lesson_5

fun main() {

    println("Что бы пройти дальше, решите пример 5+2")

    val number = readln().toInt()

    val wall = if (number == 7) "Добро пожаловать!" else "Доступ запрещен."

    println(wall)


}





