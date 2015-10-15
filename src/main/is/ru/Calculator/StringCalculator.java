package is.ru.Calculator;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculator
{
	public static int add(String text)
	{
		if (text.isEmpty())
			return 0;

		Stream<String> numbers = Arrays.stream(text.split(",|\n"));
		return numbers.mapToInt(Integer::parseInt).sum();

		/*else if(text.contains(","))
		{
			return sum(splitNumbers(text));
		}
		else
			return Integer.parseInt(text); // This method is used to get the primitive data type of a certain String
		*/
	}

	/*private static int toInt(String number){ //Copied from Hap GitHub
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",|\n");
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }*/
}
