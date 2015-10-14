package is.ru.Calculator;

public class StringCalculator
{
	public static int add(String text)
	{
		if (text.isEmpty())
			return 0;
		else if(text.contains(","))
		{
			return sum(splitNumbers(text));
		}
			
			
		else
			return Integer.parseInt(text); // This method is used to get the primitive data type of a certain String

	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",");
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }
}
