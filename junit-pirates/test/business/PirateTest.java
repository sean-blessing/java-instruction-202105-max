package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {

	@Test
	public void pirateCreateTest() {
		Pirate p1 = new Pirate("Blackbeard");
		// expect p1 to have 4 limbs and name is 'Blackbeard'
		// and isAlive == true
		assertEquals(4,p1.getLimbsRemaining());
		assertEquals("Blackbeard", p1.getName());
		assertFalse(p1.isDead());
	}
	
	@Test
	public void octoPirateTest() {
		Pirate p = new Pirate("Octo Pete", 8);
		assertEquals(8,p.getLimbsRemaining());
	}
	
	@Test(timeout=1000)
	public void timeoutTest() {
		while (true) {
			//infinit loop - on purpose!
		}
	}

}
