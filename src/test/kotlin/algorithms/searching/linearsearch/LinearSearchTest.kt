package algorithms.searching.linearsearch

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNull
import kotlin.test.Test
import kotlin.test.assertContentEquals

class LinearSearchTest {

    @Test
    fun `returns correct index when element exists`() {
        val array = intArrayOf(4, 8, 15, 16, 23, 42)

        assertThat(linearSearch(array, 15)).isEqualTo(2)
    }

    @Test
    fun `returns null when element does not exist`() {
        val array = intArrayOf(4, 8, 15, 16, 23, 42)

        assertThat(linearSearch(array, 0)).isNull()
    }

    @Test
    fun `finds first element`() {
        val array = intArrayOf(4, 8, 15, 16, 23, 42)

        assertThat(linearSearch(array, 4)).isEqualTo(0)
    }

    @Test
    fun `finds last element`() {
        val array = intArrayOf(4, 8, 15, 16, 23, 42)

        assertThat(linearSearch(array, 42)).isEqualTo(5)
    }

    @Test
    fun `returns first occurrence when duplicates exist`() {
        val array = intArrayOf(5, 3, 7, 3, 9)

        assertThat(linearSearch(array, 3)).isEqualTo(1)
    }

    @Test
    fun `finds element in single element array`() {
        val array = intArrayOf(42)

        assertThat(linearSearch(array, 42)).isEqualTo(0)
    }

    @Test
    fun `returns null for missing element in single element array`() {
        val array = intArrayOf(42)

        assertThat(linearSearch(array, 0)).isNull()
    }

    @Test
    fun `returns null for empty array`() {
        val array = intArrayOf()

        assertThat(linearSearch(array, 0)).isNull()
    }

    @Test
    fun `finds negative numbers`() {
        val array = intArrayOf(-10, -5, 0, 5, 10)

        assertThat(linearSearch(array, -10)).isEqualTo(0)
    }

    @Test
    fun `finds zero`() {
        val array = intArrayOf(-10, -5, 0, 5, 10)

        assertThat(linearSearch(array, 0)).isEqualTo(2)
    }

    @Test
    fun `does not modify input array`() {
        val array = intArrayOf(4, 8, 15, 16, 23, 42)
        val original = array.copyOf()

        linearSearch(original, 15)
        assertContentEquals(array, original)
    }

}