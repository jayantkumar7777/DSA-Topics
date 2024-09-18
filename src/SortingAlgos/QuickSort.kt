package SortingAlgos

fun quickSort(arr: IntArray, low: Int, high: Int) {
    if (low < high) {
        val pi = partition(arr, low, high)
        quickSort(arr, low, pi - 1)
        quickSort(arr, pi + 1, high)
    }
}

fun partition(arr: IntArray, low: Int, high: Int): Int {
    val pivot = arr[high]
    var i = low - 1
    for (j in low until high) {
        if (arr[j] <= pivot) {
            i++
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
        }
    }
    val temp = arr[i + 1]
    arr[i + 1] = arr[high]
    arr[high] = temp
    return i + 1
}

fun main() {
    val array = intArrayOf(10, 7, 8, 9, 1, 5)
    quickSort(array, 0, array.size - 1)
    println("Sorted array:")
    for (element in array) {
        print("$element ")
    }
}