package lesson_5

const val PASSWORD = "PanGalactic"


fun main() {

    println("Введите имя пользователя для входа на корабль:")

    val enterToSpaceShip = when (val name = readln()) {
        "Zaphod" -> {
            println("Введите пароль")
            val enterPass = readln()
            if (enterPass == PASSWORD) "Добро пожаловать на карабль $name" else "Не верный пароль"
        }

        else -> "Вы не зарегистрированы пользователь $name, зарегиструйтесь"
    }

    println(enterToSpaceShip)


}