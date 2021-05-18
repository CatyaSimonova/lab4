package com.company;

import java.util.Deque;
import java.util.Stack;

public class task3 {
    public task3(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.println("  Диск 1 из " + from + " на " + to);
        } else {
            new task3(topN - 1, from, to, inter);
            System.out.println("  Диск " + topN + " из " + from + " на " + to);
            new task3(topN - 1, inter, from, to);
        }
    }
}
