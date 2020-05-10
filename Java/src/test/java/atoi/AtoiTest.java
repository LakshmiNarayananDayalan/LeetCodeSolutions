package atoi;

import org.junit.Test;

import org.junit.*;

public class AtoiTest {

	@Test
	public void testMyAtoi() {
		Solution instance = new Solution();
		Assert.assertEquals(225,instance.myAtoi("225"));
	}
	
	@Test
	public void testMyAtoiNegative() {
		Solution instance = new Solution();
		Assert.assertEquals(-225,instance.myAtoi("-225"));
	}

}
