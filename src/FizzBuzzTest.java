import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void returnsZeroWhenPassingZero() {
		FizzBuzz test =  new FizzBuzz();
		assertEquals(test.getFizzBuzz(0), "0");
	}

}
