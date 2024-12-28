fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)

    // Correct way to modify the mutable list in place:
    mutableList.mapTo(mutableList) { it * 2 }
    println(mutableList) // Output: [2, 4, 6, 8, 10]

    //Alternative using `map` and assignment
    mutableList.clear()
    mutableList.addAll(mutableList.map {it * 2})
    println(mutableList) // Output: [4, 8, 12, 16, 20]
} 