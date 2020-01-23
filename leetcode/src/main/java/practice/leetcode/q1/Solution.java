package practice.leetcode.q1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexes = new HashMap<>(nums.length, 1);

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int findNum = target - num;
            if (numIndexes.containsKey(findNum)) {
                Integer firstIndex = numIndexes.get(findNum);
                return new int[] {firstIndex.intValue(), i};
            }
            numIndexes.put(num, i);
        }

        return null;
    }
}
