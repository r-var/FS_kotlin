package lesson_5

const val PASSWORD = "PanGalactic"
const val LOGIN = "Zaphod"


fun main() {

    println("Введите имя пользователя для входа на корабль:")

    val enterLogin = readln()

    println("Введите пароль пользователя для входа на корабль:")

    val enterPassword = readln()

    val enterSpaceShip = if ((enterLogin == LOGIN) and (enterPassword == PASSWORD)) "Добро пожаловать"
    else if ((enterLogin == LOGIN) or (enterPassword == PASSWORD)) "Возможно вы ввели не верно логин или пароль"
    else "Вы $enterLogin не зарегистрированы, пожалуйста зарегистрируйтесь"

    println(enterSpaceShip)


}