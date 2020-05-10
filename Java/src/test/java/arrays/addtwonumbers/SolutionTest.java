package arrays.addtwonumbers;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
	
	@Test
	public void test() {
		
		Solution instance = new Solution();
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;
		int[] result = instance.twoSum(nums, target);
		assertArrayEquals(new int[] {0,1}, result);
	}

	
}
