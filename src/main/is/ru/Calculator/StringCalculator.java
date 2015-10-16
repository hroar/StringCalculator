package is.ru.Calculator;


public class StringCalculator
{
	public static int add(String text)
	{
		if(text.isEmpty())
			return 0;
		
		if(text.contains(","))
		{
			String[] temp = text.split(",");
			return toInt(temp[0]) + toInt(temp[1]); 
		}
		else
			return Integer.parseInt(text);
	}

	private static int toInt(String temp)
	{
		return Integer.parseInt(temp);
	}
				
}															