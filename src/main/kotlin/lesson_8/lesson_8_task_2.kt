package lesson_8

fun main() {
    val arrayOfIngredients: Array<String> = arrayOf("яйца", "сахар", "соль", "молоко", "масло", "мука")

    println("Назовите ингредиент")

    val enterIngredient = readln()

    for (i in arrayOfIngredients) {
        if (enterIngredient == i){
            println("В списке есть $arrayOfIngredients")
        }
        else {
            println("В списке нет $arrayOfIngredients")

        }

    }





}


