package com.itrexgroup.wf;

import java.util.Arrays;

public class SortedSearch {

    public static int countNumbers(int[] sortedArray, int lessThan) {
        if (sortedArray.length == 0) {
            return 0;
        }
        if (sortedArray[0] >= lessThan) {
            return 0;
        }
        int countNums = Arrays.binarySearch(sortedArray, lessThan);
        if (countNums >= 0) {
            return countNums;
        }
        //Arrays.binarySearch(int[] array, int key) returns (-(insertion point)-1) when doesn't find key in array
        return (-countNums) - 1;
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}, 0));
    }
}