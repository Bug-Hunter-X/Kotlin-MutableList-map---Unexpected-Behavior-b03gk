# Kotlin MutableList map() Unexpected Behavior

This repository demonstrates a common misconception when using the `map()` function with mutable lists in Kotlin.  The `map()` function in Kotlin returns a *new* list, leaving the original list unchanged. This can be confusing for developers expecting in-place modification.

The `bug.kt` file shows the incorrect usage, while `bugSolution.kt` demonstrates the correct approach using `mapTo()` to modify the mutable list in place.

## How to Reproduce

1. Clone this repository.
2. Open `bug.kt` and run the code. Observe the unexpected output.
3. Open `bugSolution.kt` and run the code. Observe the correct output.

## Solution

To modify a mutable list in place, use the `mapTo()` function.  `mapTo()` takes a destination collection as an argument, and appends the transformed elements to that collection.