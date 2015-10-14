package is.ru.Calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest 
{
	public static void main(String args[])
	{
		org.junit.runner.JUnitCore.main("is.ru.Calculator.StringCalculatorTest");
	}

	@Test
	public void testEmptyString()
	{
		assertEquals(StringCalculator.add(""),0);
	}
	@Test
	public void testOneNumber()
	{
		assertEquals(StringCalculator.add("3"),3);
		assertEquals(StringCalculator.add("23"),23);
	}
	@Test
	public void testTwoNumbers()
	{
		assertEquals(StringCalculator.add("1,2"),3);
	}
	@Test
	public void testMultipleNumbers()
	{
		assertEquals(StringCalculator.add("1,2,3"),6);
	}
}