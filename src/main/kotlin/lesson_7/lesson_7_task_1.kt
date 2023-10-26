package lesson_7

fun main() {

    val range1: IntRange = 1..9
    val range2: CharRange = 'a'..'z'


    for (i in range1) {
        for (j in range2) {
            print("$j$i")
            if (i==6)
                break
        }
    }


}





