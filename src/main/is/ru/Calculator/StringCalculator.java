package is.ru.Calculator;


public class StringCalculator
{
	public static int add(String text)
	{
		if(text.isEmpty())
			return 0;
		
		if(text.contains(","))
		{
			String[] numbers = text.split(",");
			int total = 0;
			for(String number : numbers)
			{
				total += toInt(number);
			}
			return total;
		}
		else
			return Integer.parseInt(text);
	}

	private static int toInt(String numbers)
	{
		return Integer.parseInt(numbers);
	}
				
}															