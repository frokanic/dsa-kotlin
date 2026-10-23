package algorithms.sorting.insertionsort

fun insertionSort(array: IntArray): IntArray {

    for (i in 1 until array.size) {
        for (j in i - 1 downTo 0) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            } else {
                break
            }
        }
    }

    return array
}