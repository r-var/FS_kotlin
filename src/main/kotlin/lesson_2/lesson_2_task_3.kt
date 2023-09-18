package lesson_2

const val PART_TIME: Int = 60
fun main() {
    val minDeparture = 39
    val hourDeparture = 9
    val arrival = 457
    var minArrival = (arrival % PART_TIME) + minDeparture
    val hourArrival = (arrival / PART_TIME) + hourDeparture + (minArrival / PART_TIME)
    minArrival %= PART_TIME

    println("$hourArrival:$minArrival")

}
