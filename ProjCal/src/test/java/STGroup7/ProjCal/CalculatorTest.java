package STGroup7.ProjCal;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private static Calculator calc;
	
	@BeforeClass
	public static void setup() {
		calc =new Calculator();
	}
		
	@Test
	public void testadd() {
		assertEquals(8,calc.add(3, 5));
	}
	@Test
	public void testadd1() {
		assertEquals(10,calc.add(5, 5));
	}
	@Test
	public void testsub() {
		assertEquals(4,calc.sub(8,4));
	}
	@Test
	public void testsub1() {
		assertEquals(5,calc.sub(8,3));
	}
	@Test
	public void testmul() {
		assertEquals(36,calc.mul(4,9));
	}
	@Test
	public void testdiv() {
		assertEquals(2,calc.div(10,5));
	}
	
}
