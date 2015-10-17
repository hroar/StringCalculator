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
		return Integer.parseInt(numbers);
	}

	private static int sumArray(String[] numbers)
	{
		String negative = "";
		for(String number : numbers)
		{
			if(toInt(number)< 0)
				negative += "," + number;
		}
		if(negative.length()>0)
			throw new RuntimeException(negative.substring(1));
		int total = 0;
		for(String number : numbers)
		{
			if(toInt(number) > 1000)
			{
				continue;
			}
			total += toInt(number);
		}
		return total;
	}
}															