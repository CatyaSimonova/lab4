package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class task1 {
    public static boolean lt(String str1, String str2) {
        return str1.compareTo(str2) < 0;
    }

    public task1(String Str) {
        String[] words = Str.split(" ");
        Deque<String> a = new LinkedList<>();
        Deque<String> b = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            a.push(words[i]);
        }
        String str = "";
        while (!a.isEmpty()) {
            for (int i = 0; i < a.size(); i++) {
                if (lt(str, a.peekFirst())) {
                    str = a.peekFirst();
                }
                a.addLast(a.removeFirst());
            }
            for (int i = 0; i < a.size(); i++) {
                if (str.equals(a.peekFirst())) {
                    a.removeFirst();
                    break;
                }
                a.addLast(a.removeFirst());
            }
            b.addFirst(str);
            str="";
        }
        System.out.print("task 1: ");
        while (!b.isEmpty()){
            System.out.print(b.removeFirst()+" ");
        }
    }
}
