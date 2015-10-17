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
		assertEquals(StringCalculator.add("1,2,3,4,5,6,7,8,9"),45);
	}

	@Test 
	public void testNewlineBetweenNumbersWithComma()
	{
		assertEquals(StringCalculator.add("1\n2,3"),6);
	}
	
	@Test
	public void testDifferentDelimiter()
	{
		assertEquals(StringCalculator.add("//;1;2;3"),6);
	}

	@Test
	public void testNegativeNotAllowed()
	{
		try{
			StringCalculator.add("-1,2,-2,3,-3");
		}
		catch (Exception e)
		{
			assertEquals("-1,-2,-3", e.getMessage());
		}
	}
	/*@Test
	public void testMultipleDelimiters()
	{
		assertEquals(StringCalculator.add("//[%]2***3"),6);
	}*/
	
	@Test
	public void testIfNumberisBiggerThan1000()
	{
		assertEquals(StringCalculator.add("1001,2"),2);
	}
}	
