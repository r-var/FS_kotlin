package lesson_3


fun main() {

    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var surname = "Сидорова"
    var age = 20
    var fullName = "$surname $name $patronymic $age"

    println(fullName)

    surname = "Андреева"
    age = 22
    fullName = "$surname $name $patronymic $age"

    println(fullName)


}