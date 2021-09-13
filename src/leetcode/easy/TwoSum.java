package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }

    /**
     * @param numbers array of integers.
     * @param target integer target number.
     *
     * @return indices of the two numbers such that they add up to target.
     */
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < numbers.length; ++i) {
            if (myMap.containsKey(numbers[i])) {
                return new int[] {myMap.get(numbers[i]), i};
            }

            myMap.put(target - numbers[i], i);
        }

        throw new IllegalArgumentException("Invalid arguments provided");
    }
}
