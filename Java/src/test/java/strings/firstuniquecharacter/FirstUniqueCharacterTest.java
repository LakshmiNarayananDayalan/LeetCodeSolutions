package strings.firstuniquecharacter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FirstUniqueCharacterTest {

	Solution instance=new Solution();
	
	@Test
	public void testFindUniqueCharacter() {
		String strToCheck = "LeetCodeLove";
		int indexOfUniqChar = instance.findUniqueCharacter(strToCheck);
		System.out.println("First Unique char is " + strToCheck.charAt(indexOfUniqChar));
		assertEquals('t', strToCheck.charAt(indexOfUniqChar));
	}

}
