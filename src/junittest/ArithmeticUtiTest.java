package junittest;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sourcecode.ArithmeticUtil;

public class ArithmeticUtiTest {
	public ArithmeticUtil au = new ArithmeticUtil();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddDoubleDouble() {
		double result = au.add(1, 2);
		assertEquals(3.0, result, 0);
	}

	@Test
	public void testAddStringString() {
		BigDecimal result = au.add("1", "2");
		assertEquals(3.0, result.doubleValue(), 0);
	}

	@Test
	public void testSubDoubleDouble() {
		double result = au.sub(2, 1);
		assertEquals(1.0, result, 0);
	}

	@Test
	public void testSubStringString() {
		BigDecimal result = au.sub("3", "1");
		assertEquals(2.0, result.doubleValue(), 0);
	}

	@Test
	public void testMulDoubleDouble() {
		double result = au.mul(2, 0);
		assertEquals(0.0, result, 0);
	}

	@Test
	public void testMulStringString() {
		BigDecimal result = au.mul("3", "1");
		assertEquals(3.0, result.doubleValue(), 0);
	}

	@Test
	public void testDivStringString() {
		BigDecimal result = au.div("1", "2");
		assertEquals(0.5, result.doubleValue(), 0);
	}

	@Test
	public void testDivDoubleDouble() {
		double result = au.div(1, 0);
		assertEquals(Double.POSITIVE_INFINITY, result, 0);
	}

	@Test
	public void testStrRemainder() {
		BigDecimal result = au.strRemainder("6", "4", 3);
		assertEquals(2.0, result.doubleValue(), 0);
	}

	@Test
	public void testStrcompareTo() {
		boolean tf = au.strcompareTo("6.8", "6.6");
		assertEquals(true, tf);
	}

}
