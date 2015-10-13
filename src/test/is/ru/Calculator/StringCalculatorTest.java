package is.ru.Calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest 
{
	private StringCalculator calculator = new StringCalculator();
	public static void main(String args[])
	{
		org.junit.runner.JUnitCore.main("is.ru.Calculator");
	}

	@Test
	public void testEmptyString()
	{
		assertEquals(0, calculator.add(""));
	}
}