package com.itrexgroup.workfusion;

public class TwoSumSlowly {
    public static int[] findTwoSum(int[] list, int sum) {
        int length = list.length;
        for (int i = 0; i < length; i++) {
            if (list[i] > sum) {
                continue;
            }
            for (int j = i + 1; j < length; j++) {
                if (list[j] > sum) {
                    continue;
                }
                if (list[j] == sum - list[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[]{3, 1, 5, 7, 5, 9}, 10);
        if (indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
