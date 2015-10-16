package is.ru.Calculator;


public class StringCalculator
{
	public static int add(String text)
	{
		if(text.isEmpty())
			return 0;
		
		if(text.contains(","))
		{
			return sum(splitNumbers(text));
		}
		else
			return Integer.parseInt(text);
	}

	private static int toInt(String numbers)
	{
		return Integer.parseInt(numbers);
	}

	private static int sum(String[] numbers)
	{
		int total = 0;
		for(String number : numbers)
		{
			total += toInt(number);
		}
		return total;
	}

	private static String[] splitNumbers(String numbers)
	{
		return numbers.split(",");
	}
				
}															