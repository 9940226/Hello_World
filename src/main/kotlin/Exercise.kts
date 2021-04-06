java.util

fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood : String = getMood(), weather : String = "sunny", temperature : Int = 24) : String {
    return when {
        isHappyAndSunny(mood, weather)-> "go for a walk"
        isSadAndRainnyandCold(mood, weather, temperature) -> "stay in bed"
        isHot(temperature) -> "go swimming"
        else -> "Stay home and read."
    }

}

fun isHappyAndSunny(mood : String, weather : String = "sunny") = mood == "happy" && weather == "sunny"

fun isSadAndRainnyandCold(mood : String, weather : String = "sunny", temperature : Int = 24) = mood == "sad" && weather == "rainy" && temperature == 0

fun isHot (temperature : Int = 24) = temperature > 35

fun getMood(): String {
    print("\nEnter your mood: ")
    return readLine()!!
}

val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
println(spices.filter { it.contains("curry")}.sortedBy { it.length })
println(spices.filter { it.startsWith('c') }.filter { it.endsWith('e') })
println(spices.filter { it.startsWith('c') && it.endsWith('e') })
println(spices.take(3)filter { it.startsWith('c') && it.endsWith('e') })

 val rollDice = { Random().nextInt(12) + 1 }
val rollDice = { sides : Int -> Random().nextInt(sides) + 1 }
val rollDice = { sides : Int -> if (sides == 0) 0 else Random().nextInt(sides) + 1 }
val rollDice2 : (Int) -> Int = { sides -> if (sides == 0) 0 else Random().nextInt(sides) + 1 }

fun gamePlay(rollDice : Int) = println(rollDice)