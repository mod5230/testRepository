package ua.com.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ua.com.lesson.Calculator;

public class TestCalculator {
	
	private static Calculator calculator;
	
	@BeforeClass
	public static void init(){
		calculator = new Calculator();
	}
	
	@AfterClass
	public static void destroy(){
		calculator = null;
	}
	
	@Test
	public void testAdd(){
		int expected = calculator.add(5, 5);
		int real = 10;
		
//		Assert.assertEquals(expected, real);
		
		if(expected != real){
			Assert.fail("ahahahah");
		}
		
	}
//	@Ignore
	@Test
	public void testSustruct(){
		Assert.assertEquals(calculator.substruc(5, 2), 3, 0.000000001);
	}
	
	
//	@Ignore
	@Test
	public void testDevide(){
		Assert.assertEquals(calculator.substruc(3, 2), 1, 0.1);
	}
	
	@Before
	public void before(){
		System.out.println("before");
	}
	

	
	
	
	
	
	
	
	
	
}
