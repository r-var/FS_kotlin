package lesson_8

fun main() {
    var dayArray = emptyArray<Int>()
    var sum = 0


    for (i in 0..6) {
        println("количество в ${i+1}:")
        val number = readln().toInt()
        dayArray += number
        sum += dayArray[i]

    }
    println(sum)
}