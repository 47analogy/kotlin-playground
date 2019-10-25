import java.util.*


fun randomDay(): String {
    val week = arrayOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")
    return week[Random().nextInt(week.size)]
}

fun weatherType (day: String): String {
    var weatherOutside = ""
    when (day) {
        "Mon" -> weatherOutside = "sunny"
        "Tues" -> weatherOutside = "rainy"
        "Wed" -> weatherOutside = "windy"
        "Thur" -> weatherOutside = "cloudy"
        "Fri" -> weatherOutside = "snowing"
        "Sat" -> weatherOutside = "stormy"
        "Sun" -> weatherOutside = "misty"
    }
    return weatherOutside
}

fun dayOfWeek() {
    val day = randomDay()
    val weather = weatherType(day)
    displayDayInfo("Today is ${day} and it is $weather")
}

fun displayDayInfo(result: String) {
    println(result)
}

fun main(args: Array<String>) {
    dayOfWeek()
}