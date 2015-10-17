package is.ru.Calculator;


public class StringCalculator
{
	public static int add(String text)
	{
		if(text.isEmpty())
		{
			return 0;
		}
		String[] numbers = text.split(delimiter(text));
			return sumArray(numbers);
	}
	private static String delimiter(String text)
	{
		String delimiter = ",|\n";
		if(text.startsWith("//"))
			delimiter = text.substring(2,3);
		return delimiter;
	}
	
	private static int toInt(String numbers)
	{
		return Integer.parseInt(numbers);
	}

	private static int sumArray(String[] numbers)
	{
		int total = 0;
		for(String number : numbers)
		{
			total += toInt(number);
		}
		return total;
	}

	/*private static String[] splitNumbers(String numbers)
	{
		String delimiter = ",|\n";
		return numbers.split(delimiter);
	}*/
}															