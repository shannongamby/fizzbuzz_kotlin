import org.junit.Assert
import org.junit.Test

class FizzBuzzTest {
    @Test
    fun returnsFizzWhenNumberThree() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.convert(3)
        Assert.assertEquals("fizz", actual)
    }

}