import org.junit.Assert
import org.junit.Test

class FizzBuzzTest {
    @Test
    fun returnsFizzWhenNumberThree() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.convert(3)
        Assert.assertEquals("fizz", actual)
    }

    @Test
    fun returnsBuzzWhenNumberFive() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.convert(5)
        Assert.assertEquals("buzz", actual)
    }

    @Test
    fun returnsOneWhenNumberOne() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.convert(1)
        Assert.assertEquals("1", actual)
    }

    @Test
    fun returnsFizzBuzzWhenNumberFifteen() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.convert(15)
        Assert.assertEquals("fizzbuzz", actual)
    }

    @Test
    fun returnsFizzWhenNumberSix() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.convert(6)
        Assert.assertEquals("fizz", actual)
    }

    @Test
    fun returnsBuzzWhenNumberTen() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.convert(10)
        Assert.assertEquals("buzz", actual)
    }

    @Test
    fun returnsFizzBuzzWhenNumberThirty() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.convert(30)
        Assert.assertEquals("fizzbuzz", actual)
    }

    @Test
    fun returnsAListOfFizzBuzzOutputs() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.listFizzBuzz(5)
        Assert.assertEquals(listOf("1", "2", "fizz", "4", "buzz"), actual)
    }
}