package is.ru.Calculator;


public class StringCalculator
{
	public static int add(String text)
	{
		if(text.isEmpty())
			return 0;
		
		String[] numbers = text.split(",|\n");
		if(text.contains(","))
		{
			return sumArray(numbers);
		}
		else
			return toInt(text);

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