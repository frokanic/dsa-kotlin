package algorithms.searching.linearsearch

fun linearSearch(array: IntArray, value: Int): Int? {

    for (i in 0..<array.size) {
        if (array[i] == value) {
            return i
        }
    }

    return null
}