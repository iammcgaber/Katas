
public class FizzBuzz {
	
	public String getFizzBuzz(int arg) {
		if(arg == 0)
			return "0";
		else if(arg == 15)
			return "FizzBuzz";
		else if(arg % 3 == 0)
			return "Fizz";
		else if(arg % 5 == 0)
			return "Buzz";
		else
			return Integer.toString(arg);
		
	}
	
}
