// -------------------------------------------------------------------------------------

// Two Sum

import java.util.*;

class SolutionOne {
    public int[] findPair(int[] arr1, int tgt1) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            int need = tgt1 - arr1[i];
            if (map1.containsKey(need)) return new int[] { map1.get(need), i };
            map1.put(arr1[i], i);
        }
        return new int[0];
    }
}

// -------------------------------------------------------------------------------------

// Richest Customer Wealth

class SolutionTwo {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int currentWealth = 0;
            for (int money : customer) {
                currentWealth += money;
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        return maxWealth;
    }
}

// -------------------------------------------------------------------------------------

// Running Sum of 1D Array

class SolutionThree {
    public int[] prefixSum(int[] nums3) {
        for (int i = 1; i < nums3.length; i++) {
            nums3[i] += nums3[i - 1];
        }
        return nums3;
    }
}

// -------------------------------------------------------------------------------------
