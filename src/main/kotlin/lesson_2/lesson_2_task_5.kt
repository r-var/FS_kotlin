package lesson_2

import kotlin.math.pow
import kotlin.math.roundToInt


fun main() {
    val money = 70_000
    val percent = 16.7
    val depositTime = 20
    val compoundInterest: Double = money * (1 + percent / 100).pow(depositTime)

    print((compoundInterest * 1000.0).roundToInt() / 1000.0)

}