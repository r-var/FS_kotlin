package lesson_2

const val MAX_PERCENT_BUFF = 100
fun main() {

    val iron = 11
    val crystal = 7
    val percentBuff = 20

    println("бонус железа = " + (iron * percentBuff) / MAX_PERCENT_BUFF)
    println("бонус кристалов = " + (crystal * percentBuff) / MAX_PERCENT_BUFF)

}