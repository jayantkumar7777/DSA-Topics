package SearchingAlgos

fun binarySearch(arr: IntArray, x: Int): Int {
    var left = 0
    var right = arr.size - 1
    while (left <= right) {
        val mid = left + (right - left) / 2
        if (arr[mid] == x) {
            return mid
        }
        if (arr[mid] < x) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    return -1
}

fun main() {
    val arr = intArrayOf(2, 3, 4, 10, 40)
    val x = 10
    val result = binarySearch(arr, x)
    if (result == -1) {
        println("Element not present")
    } else {
        println("Element found at index $result")
    }
}