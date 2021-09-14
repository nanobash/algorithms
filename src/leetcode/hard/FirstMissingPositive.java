package leetcode.hard;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(solutionOne(new int[] {1, 2, 0}) == 3);
        System.out.println(solutionOne(new int[] {3, 4, -1, 1}) == 2);
        System.out.println(solutionOne(new int[] {7, 8, 9, 11, 12}) == 1);
        // -------------------------------------------------------------------------------------------------------------
        System.out.println(solutionTwo(new int[] {1, 2, 0}) == 3);
        System.out.println(solutionTwo(new int[] {3, 4, -1, 1}) == 2);
        System.out.println(solutionTwo(new int[] {7, 8, 9, 11, 12}) == 1);
    }

    /**
     * @param numbers array of numbers.
     *
     * @return the smallest missing positive integer.
     */
    public static int solutionOne(int[] numbers) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int num: numbers) {
            priorityQueue.add(num);
        }

        int result = 1;

        while (!priorityQueue.isEmpty()) {
            int tmp = priorityQueue.poll();

            if (result == tmp) {
                result++;
            }
        }

        return result;
    }

    /**
     * @param numbers array of numbers.
     *
     * @return the smallest missing positive integer.
     */
    public static int solutionTwo(int[] numbers) {
        Set<Integer> mySet = new HashSet<>();

        for (int num: numbers) {
            if (num > 0 && num < numbers.length + 1) {
                mySet.add(num);
            }
        }

        for (int i = 1; i <= numbers.length; ++i) {
            if (!mySet.contains(i)) {
                return i;
            }
        }

        return numbers.length + 1;
    }
}
