package com.itrexgroup.wf;

import java.util.*;

public class Sequence {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(1);
        list.add(4);

        System.out.println(doSearch(list));
    }

    //This method returns the number which means max count of same number
    public static int doSearch(List<Integer> list) {
        int maxCount;
        int number = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : list) {
            if (map.containsKey(i)) {
                map.merge(i, 1, Integer::sum);
            } else {
                map.put(i, 1);
            }
        }
        ArrayList<Integer> values = new ArrayList<>(map.values());
        maxCount = Collections.max(values);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (Objects.equals(maxCount, entry.getValue())) {
                System.out.println(entry.getKey());
                break;
            }
        }
        return maxCount;
    }
}
