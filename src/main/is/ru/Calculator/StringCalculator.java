package is.ru.Calculator;


public class StringCalculator
{
	public static int add(String text)
	{
		if(text.isEmpty())
		{
			return 0;
		}
		
		String delimiter = ",|\n";
		if(text.startsWith("//"))
			delimiter = text.substring(2,3);
		String values = text;
		if(text.startsWith("//"))
			values = text.substring(3);
			return sumArray(values.split(delimiter));
	}
	/*private static String delimiter(String text)
	{
		String delimiter = ",|\n";
		if(text.startsWith("//"))
			delimiter = text.substring(2,3);
		return delimiter;
	}*/
	private String[] numbers(String text)
	{
		String[] numbers = text.split(",|\n");
		return numbers;
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