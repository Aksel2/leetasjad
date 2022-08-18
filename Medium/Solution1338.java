package Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution1338 {

    public static int minSetSize(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : arr)
            count.put(num, count.getOrDefault(num, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> pQue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<Integer, Integer> insNum : count.entrySet())
            pQue.offer(insNum);

        int removed = 0;
        int sum = 0;
        for (int i = 0; i < pQue.size(); i++) {
            removed += pQue.poll().getValue();
            sum++;
            if (removed >= arr.length / 2)
                break;
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};

        System.out.println(minSetSize(arr));
    }
}
