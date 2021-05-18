package com.company;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Stack;

public class task11 {
    public static void compute(String expr, Stack<Integer> st, int deep) throws Exception {
//        String d = "  ".repeat(deep);
//        System.out.println(d + "EXPR: " + expr);
        if (expr.equals("x")) {
            st.push(1);
        } else if (expr.equals("y")) {
            st.push(2);
        } else if (expr.equals("z")) {
            st.push(3);
        } else if (isInBrackets(expr)) {
            compute(expr.substring(1, expr.length() - 1), st, deep + 1);
        } else if ((indexWithBrackets(expr, '+') != -1) || (indexWithBrackets(expr, '-') != -1)) {
            int idx = Math.min(
                    maxIfM1(indexWithBrackets(expr, '+')),
                    maxIfM1(indexWithBrackets(expr, '-'))
            );
            compute(expr.substring(0, idx), st, deep + 1);
            compute(expr.substring(idx + 1), st, deep + 1);
            if (expr.charAt(idx) == '+') {
                st.push(st.pop() + st.pop());
            } else {
                st.push(- st.pop() + st.pop());
            }

        } else {
            throw new Exception("Illegar expression");
        }
    }

    public static int maxIfM1(int x) {
        if (x == -1) { return Integer.MAX_VALUE; }
        else { return x; }
    }

    public static int indexWithBrackets(String s, char ch) {
        int bracket = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') { bracket += 1;}
            else if (s.charAt(i) == ')') { bracket -= 1; }
            else if (bracket == 0) { // not in brackets
                if (s.charAt(i) == ch) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean isInBrackets(String s) throws Exception{
        if (!(s.startsWith("(") && s.endsWith(")"))) {
            return false;
        }
        s = s.substring(1);
        int bracket = 1;
        for (int i = 0; i < s.length(); i++) {
            if (bracket == 0) { return false; }
            if (s.charAt(i) == '(') { bracket += 1;}
            else if (s.charAt(i) == ')') { bracket -= 1; }
            if (bracket < 0) { throw new Exception("Illegal expression"); }
        }
        return bracket == 0;
    }

    public static void mtask11(String expr) {
        Stack<Integer> st = new Stack<>();
        try {
            compute(expr, st, 0);
            System.out.println("Task 11: Correct expression. When x = 1; y = 2; z = 3,\n\texpr = " + st.pop());
            //System.out.println("Task 11: Correct expression.");
        } catch (Exception e) {
            System.out.println("Task 11: Illegal expression.");
        }
    }
}
