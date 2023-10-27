package lesson_8

fun main(){
    val arrayOfIngredients: Array<String> = arrayOf("яйца","сахар","соль","молоко","масло","мука")

    println("Назовите ингредиент")

    val enterIngredient = readln()


    for(i in arrayOfIngredients){
        if (i == enterIngredient) {
            println("Ингредиент $enterIngredient в рецепте есть")
            break
        }
    }

    println ("$enterIngredient не найден")





}
