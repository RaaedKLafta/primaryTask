import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Task1stweekKtTest {
    @Test
    fun should_ReturnCorrectPercentage_When_HaveCorrectInputList() {
        // given list with elements a and b only
        val inputList: List<String> = listOf("a", "b", "b")
        // when calculate the percentage
        val percentage = percentageA(inputList)
        // then check the result
        assertEquals(33.0, percentage)
    }

    @Test
    fun should_ReturnMinus1_When_HaveStringMoreOneCharacter() {
        // given list with one element or more is a string has more one character
        val inputList: List<String> = listOf("ab", "bb", "b")
        // when calculate the percentage
        val percentage = percentageA(inputList)
        // then check the result
        assertEquals(-1.0, percentage)
    }

    @Test
    fun should_ReturnMinus1_When_HaveStringAnotherCharacter() {
        // given list with one element with character not a or b
        val inputList: List<String> = listOf("c", "r", "1", "=")
        // when calculate the percentage
        val percentage = percentageA(inputList)
        // then check the result
        assertEquals(-1.0, percentage)
    }
}