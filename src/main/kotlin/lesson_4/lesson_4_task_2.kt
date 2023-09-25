package lesson_4

const val MAX_WEIGHT_AVERAGE = 100
const val MIN_WEIGHT_AVERAGE = 35
const val VOLUME_AVERAGE = 100
fun main() {

    val cargoWeightFirst = 20
    val cargoVolumeFirst = 80
    val cargoWeightSecond = 50
    val cargoVolumeSecond = 100

    println("Average:${((cargoWeightFirst >= MIN_WEIGHT_AVERAGE) and 
            (cargoWeightFirst <= MAX_WEIGHT_AVERAGE)) and (VOLUME_AVERAGE != cargoVolumeFirst)}")
    println("Average:${((cargoWeightSecond >= MIN_WEIGHT_AVERAGE) and 
            (cargoWeightSecond <= MAX_WEIGHT_AVERAGE)) and (VOLUME_AVERAGE != cargoVolumeSecond)}")



}
