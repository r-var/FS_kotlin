package lesson_4

const val ALLOWABLE_SUNNY_WEATHER: Boolean = true
const val ALLOWABLE_OPEN_TENT: Boolean = true
const val ALLOWABLE_HUMIDITY: Int = 20
const val ALLOWABLE_SEASON: String = "не зима"

fun main() {
    val sunnyWeather: Boolean = true
    val openTent: Boolean = true
    val humidity: Int = 20
    val season: String = "Зима"

    println(
        """Благоприятные ли условия сейчас для роста бобовых?: ${
            ((ALLOWABLE_SEASON == season)
                    and (ALLOWABLE_HUMIDITY == humidity)) and ((ALLOWABLE_OPEN_TENT == openTent)
                    and (ALLOWABLE_SUNNY_WEATHER == sunnyWeather))
        }"""
    )


}