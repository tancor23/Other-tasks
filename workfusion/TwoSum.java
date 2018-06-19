package com.itrexgroup.workfusion;

import java.util.HashMap;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            if (map.containsKey(list[i])) {
                return new int[]{map.get(list[i]), i};
            } else {
                map.put(sum - list[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[]{9, 1, 5, 7, 5, 9}, 10);
        if (indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
