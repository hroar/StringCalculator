package is.ru.Calculator;


public class StringCalculator
{
	public static int add(String text)
	{
		if(text.isEmpty())
		{
			return 0;
		}
		String delimiter = delimiter(text);
		String numbers = numbers(text);
			return sumArray(values(text));
	}
	
	private static String[] values(String text)
	{
		return numbers(text).split(delimiter(text));
	}
	private static String delimiter(String text)
	{
		String delimiter = ",|\n";
		if(text.startsWith("//"))
			delimiter = text.substring(2,3);
		return delimiter;
	}
	private static String numbers(String text)
	{
		String values = text;
		if(text.startsWith("//"))
			values = text.substring(3);
		return values;
	}
	
	private static int toInt(String numbers)
	{
		Integer number = Integer.parseInt(numbers);
		if(number < 0)
			throw new RuntimeException(numbers);
		return number;
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