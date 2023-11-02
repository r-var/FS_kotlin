package lesson_7

fun main() {

    first@ for (i in 1..4) {
        for (j in 'a'..'z' step 2) {
            println("${i + 2}$j$i$j$i$j")
            break

        }

    }


}