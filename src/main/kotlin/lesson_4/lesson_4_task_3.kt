package lesson_4

const val IS_SUNNY_WEATHER: Boolean = true
const val IS_AWNING_OPEN: Boolean = true
const val HUMIDITY: Int = 20
const val SEASON: String = "не зима"

fun main() {
    val isSunnyWeather: Boolean = true
    val isAwningOpen: Boolean = true
    val humidity: Int = 20
    val season: String = "Зима"

    println(
        """Благоприятные ли условия сейчас для роста бобовых?: ${
            ((SEASON == season)
                    and (HUMIDITY == humidity)) and ((IS_AWNING_OPEN == isAwningOpen)
                    and (IS_SUNNY_WEATHER == isSunnyWeather))
        }"""
    )


}