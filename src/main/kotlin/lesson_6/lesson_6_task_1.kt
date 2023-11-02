package lesson_6

fun main(){
    println("Введите логин, для регистрации:")
    val login = readln()
    println("введите пароль, для регистрации:")
    val password = readln()
    println("вы зарегистрированы")

    do{
        println("ведите логин:")
        val enterLogin = readln()
        println("введите пароль:")
        val enterPassword = readln()

        if((enterPassword == password) and (enterLogin == login))
            println("Добро пожаловать")
        else println("Введите еще раз")

    }while ((enterPassword != password) or (enterLogin != login ))

}