package NewGrad;

import static org.junit.Assert.*;

import org.junit.Test;

public class simpleInterestTest {

	@Test
	public void testSi() {
		simpleInterest o=new simpleInterest();
		float e=o.si(1000, 10, 10);
		float a=1000;
		assertEquals(e,a,0.0);
	}

	
}
