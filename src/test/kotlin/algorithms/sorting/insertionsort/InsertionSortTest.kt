package algorithms.sorting.insertionsort

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class InsertionSortTest {

    @Test
    fun `sorts the original array in place`() {
        val input = intArrayOf(4, 5, 3, 1, 2)
        val expected = intArrayOf(1, 2, 3, 4, 5)

        insertionSort(input)

        assertThat(input).isEqualTo(expected)
    }
}