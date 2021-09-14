package leetcode.hard;

import java.util.PriorityQueue;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[] {1, 2, 0}) == 3);
        System.out.println(firstMissingPositive(new int[] {3, 4, -1, 1}) == 2);
        System.out.println(firstMissingPositive(new int[] {7, 8, 9, 11, 12}) == 1);
    }

    /**
     * @param numbers array of numbers.
     *
     * @return the smallest missing positive integer.
     */
    public static int firstMissingPositive(int[] numbers) {
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
}
