package com.company;

import java.lang.reflect.Array;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class task7 {
    public task7(int[] arr) {
        Deque<Integer> pos = new LinkedList<>();
        Deque<Integer> neg = new LinkedList<>();
        for (int i=0; i<arr.length; i++){
            if(arr[i]<0)
                neg.addLast(arr[i]);
            else
                pos.addFirst(arr[i]);
        }
        System.out.print("task 7: ");
        for (int x : neg){
            System.out.print(" " + x);
        }
        for (int x : pos){
            System.out.print(" " + x);
        }
    }
}
