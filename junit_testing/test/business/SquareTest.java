package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		int n = 6;
		assertEquals(36,BasicCalculations.square(n));
	}

	@Test
	public void testA() {
		String str = "What day is today?";
		assertEquals(3,BasicCalculations.countA(str));
	}
}
