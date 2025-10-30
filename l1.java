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

// Palindrome Number

class SolutionFour {
    public boolean isPalindromeNum(int num4) {
        if (num4 < 0) return false;
        int original = num4, reversed = 0;
        while (num4 != 0) {
            int digit = num4 % 10;
            reversed = reversed * 10 + digit;
            num4 /= 10;
        }
        return original == reversed;
    }
}

// -------------------------------------------------------------------------------------

// Valid Palindrome

class SolutionFive {
    public boolean isPalindromeStr(String text5) {
        StringBuilder clean = new StringBuilder();
        for (char c : text5.toCharArray()) {
            if (Character.isLetterOrDigit(c)) clean.append(Character.toLowerCase(c));
        }
        String s = clean.toString();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}

// -------------------------------------------------------------------------------------

// Fizz Buzz

import java.util.*;

class SolutionSix {
    public List<String> fizzBuzzSeq(int n6) {
        List<String> res6 = new ArrayList<>();
        for (int i = 1; i <= n6; i++) {
            if (i % 3 == 0 && i % 5 == 0) res6.add("FizzBuzz");
            else if (i % 3 == 0) res6.add("Fizz");
            else if (i % 5 == 0) res6.add("Buzz");
            else res6.add(String.valueOf(i));
        }
        return res6;
    }
}

// -------------------------------------------------------------------------------------

// Contains Duplicate

import java.util.*;

class SolutionSeven {
    public boolean hasDuplicate(int[] nums7) {
        Set<Integer> seen7 = new HashSet<>();
        for (int val : nums7) {
            if (!seen7.add(val)) return true;
        }
        return false;
    }
}

// -------------------------------------------------------------------------------------

// Plus One

class SolutionEight {
    public int[] addOne(int[] digits8) {
        for (int i = digits8.length - 1; i >= 0; i--) {
            if (digits8[i] < 9) {
                digits8[i]++;
                return digits8;
            }
            digits8[i] = 0;
        }
        int[] result8 = new int[digits8.length + 1];
        result8[0] = 1;
        return result8;
    }
}

// -------------------------------------------------------------------------------------

// Reverse String

class SolutionTen {
    public void reverseText(char[] letters10) {
        int left10 = 0, right10 = letters10.length - 1;
        while (left10 < right10) {
            char temp10 = letters10[left10];
            letters10[left10++] = letters10[right10];
            letters10[right10--] = temp10;
        }
    }
}

// -------------------------------------------------------------------------------------
