package lesson_3

const val PATRONYMIC = "Сергеевна"
const val NAME = "Татьяна"

fun main () {

    val surnameMarriage = "Андреева"
    val ageMarriage = 22
    val surnameSingle = "Сидорова"
    val ageSingle = 20
    println("""
   До замужества $surnameSingle $NAME $PATRONYMIC $ageSingle лет
   После замужества $surnameMarriage $NAME $PATRONYMIC $ageMarriage года
   """)


}