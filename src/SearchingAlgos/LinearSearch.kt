package SearchingAlgos

fun linearSearch(arr: IntArray, x: Int): Int {
    for (i in arr.indices) {
        if (arr[i] == x) {
            return i
        }
    }
    return -1
}

fun main() {
    val arr = intArrayOf(2, 3, 4, 10, 40)
    val x = 10
    val result = linearSearch(arr, x)
    if (result == -1) {
        println("Element not present in array")
    } else {
        println("Element found at index $result")
    }
}