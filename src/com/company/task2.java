package com.company;

import java.util.Deque;

public class task2 {

    public task2(Deque<Character> dec, String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            while (str1.length() < i + 1) {
                if (str.charAt(i) == dec.peekLast()) {
                    dec.add(dec.pop());
                    dec.add(dec.pop());

                    str1 += dec.peekLast();
                }
                dec.add(dec.pop());
            }
        }
        System.out.println("task 2: " + str1);
    }

}
