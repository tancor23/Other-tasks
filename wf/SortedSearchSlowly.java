package com.itrexgroup.wf;

public class SortedSearchSlowly {
    public static int countNumbers(int[] sortedArray, int lessThan) {

        if (sortedArray.length == 0) {
            return 0;
        }
        if (sortedArray[0] >= lessThan) {
            return 0;
        }
        int countNums = 0;
        for (int i = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] >= lessThan) {
                break;
            } else {
                countNums++;
            }
        }
        return countNums;
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}, 0));
    }
}
