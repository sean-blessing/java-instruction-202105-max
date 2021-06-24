package business;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAndAfterTest {

	@Test
	public void test1() {
		System.out.println("test 1");
		assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("test 2");
		assertTrue(true);
	}

	@Test
	public void test3() {
		System.out.println("test 3");
		assertTrue(true);
	}
	
	@Before
	public void beforeTest() {
		System.out.println("before");
		assertTrue(true);
	}
	
	@After
	public void afterTest() {
		System.out.println("after");
		assertTrue(true);
	}
	
	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("before class");
		assertTrue(true);
	}
	
	@AfterClass
	public static void afterClassTest() {
		System.out.println("after class");
		assertTrue(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
