package lesson_8

fun main() {
    var viewsArray = emptyArray<Int>()
    var sum = 0


    for (i in 0..6) {
        println("количество в ${i+1}:")
        val number = readln().toInt()
        viewsArray += number
        sum += viewsArray[i]

    }
    println("Просмотров за неделю $sum")
}