package practice.leetcode.q1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = null;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void shouldCreateSolution() {
        assertNotNull(solution);
    }

    @Test
    public void shouldOutputArrayWithIndexWhenCallTwoSum() {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[] {0, 1};

        int[] result = solution.twoSum(nums, target);
        validateResult(expected, result);
    }

    @Test
    public void shouldOutputArrayWithIndexWhenCallTwoSumWhenNull() {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 1;

        int[] result = solution.twoSum(nums, target);
        assertNull(result);
    }

    private void validateResult(int[] expected, int[] result) {
        assertEquals(expected.length, result.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }
}
