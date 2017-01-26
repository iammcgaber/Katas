import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz test;
	
	@Before
	public void setup() {
		test = new FizzBuzz();
	}
	
	@Test
	public void returnsZeroWhenPassingZero() {
		assertEquals("0", test.getFizzBuzz(0));
	}
	
	@Test
	public void returnsFizzWhenPassingThree() {
		assertEquals("Fizz", test.getFizzBuzz(3));
	}
	
	@Test
	public void returnsBuzzWhenPassingFive() {
		assertEquals("Buzz", test.getFizzBuzz(5));
	}
	
	@Test
	public void returnsFizzBuzzWhenPassingFifteen() {
		assertEquals("FizzBuzz", test.getFizzBuzz(15));
	}
	
	@Test
	public void returnsFizzWhenPassingSix() {
		assertEquals("Fizz", test.getFizzBuzz(6));
	}
}
