package org.example.AddToArrayFormOfInteger_989;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int [] arr = {6};
        int k = 809;
        java.util.List<Integer> list = addToArrayForm(arr, k);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            list.add(num[i]);
        }
        int balance;
        int index = list.size()-1;
        while (k != 0){
            if (index < 0) list.add(0, k % 10);
            else {
                balance = list.get(index) + k % 10;
                int index2 = index;
                while (balance != 0) {
                    if (index2 < 0) {
                        list.add(0, balance % 10);
                        index++;
                    }
                    else list.set(index2, balance % 10);
                    balance /= 10;
                    index2--;
                    if (balance > 0 && index2 >= 0) balance += list.get(index2);

                }
            }
            k /= 10;
            index--;
        }
        return list;
    }
}
