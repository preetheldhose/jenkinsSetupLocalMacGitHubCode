package test.interview;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testClassTestNGAnnotations {

	
	/*
	 * 
	 * 
	 * @BeforeTest
	   public void firstTest()
	   
	   @BeforeMethod
	   public void firstMethod()
	   
	   @Test
	    public void test2()
	    
		@Test
		public void test1()
		
		@BeforeTest
		@Test
		
	 * 
	 * 
	 */
	
	
	@BeforeTest
	public void setUp() {
		
		System.out.println("Before Test");
		
	}
	
	@Test
	public void testAll() {
		
		System.out.println("testAll");
		
		
	}
}
