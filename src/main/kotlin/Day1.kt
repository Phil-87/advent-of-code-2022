import java.io.File

fun day1() {
    println("Day 1:")

    val foods = File("src/main/kotlin/day1-input.txt").readLines()

    val elves = mutableListOf<Int>()
    var calories = 0

    foods.forEach {
        if (it.isNotEmpty())
            calories += it.toInt()
        else {
            elves.add(calories)
            calories = 0
        }
    }

    // Add last one
    if (calories > 0)
        elves.add(calories)

    val max = elves.maxOrNull() ?: 0

    println("Max calories: $max")
}