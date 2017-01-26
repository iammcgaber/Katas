import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void returnsZeroWhenPassingZero() {
		FizzBuzz test =  new FizzBuzz();
		assertEquals(test.getFizzBuzz(0), "0");
	}
	
	@Test
	public void returnsFizzWhenPassingThree() {
		FizzBuzz test =  new FizzBuzz();
		assertEquals(test.getFizzBuzz(3), "Fizz");
	}
	
	@Test
	public void returnsBuzzWhenPassingFive() {
		FizzBuzz test =  new FizzBuzz();
		assertEquals(test.getFizzBuzz(5), "Buzz");
	}

}
