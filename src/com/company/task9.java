package com.company;

import java.util.Stack;

public class task9 {

    public static void compute(String expr, Stack<Boolean> st, int deep) {
        int idx;
        // String d = "  ".repeat(deep);
        // System.out.println(d + "EXPR: " + expr);
        if (expr.equals("T")) {
            st.push(true);
        } else if (expr.equals("F")) {
            st.push(false);
        } else if (isInBrackets(expr)) {
            compute(expr.substring(1, expr.length() - 1), st, deep + 1);
        } else if (expr.startsWith("N")) {
            compute(expr.substring(1), st, deep + 1);
            st.push(!st.pop());
        } else if ((idx = indexWithBrackets(expr,'O')) != -1) {
            compute(expr.substring(0, idx), st, deep + 1);
            compute(expr.substring(idx + 1), st, deep + 1);
            st.push(st.pop() || st.pop());
        } else if ((idx = indexWithBrackets(expr, 'X')) != -1) {
            compute(expr.substring(0, idx), st, deep + 1);
            compute(expr.substring(idx + 1), st, deep + 1);
            st.push(st.pop() ^ st.pop());
        } else if ((idx = indexWithBrackets(expr, 'A')) != -1) {
            compute(expr.substring(0, idx), st, deep + 1);
            compute(expr.substring(idx + 1), st, deep + 1);
            st.push(st.pop() && st.pop());
        } else {
            throw new Error("Illegar expression");
        }
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

    public static boolean isInBrackets(String s) {
        if (!(s.startsWith("(") && s.endsWith(")"))) {
            return false;
        }
        s = s.substring(1);
        int bracket = 1;
        for (int i = 0; i < s.length(); i++) {
            if (bracket == 0) { return false; }
            if (s.charAt(i) == '(') { bracket += 1;}
            else if (s.charAt(i) == ')') { bracket -= 1; }

            if (bracket < 0) { throw new Error("Illegar expression"); }
        }
        return bracket == 0;
    }

    public static void mtask9(String expr) {
        Stack<Boolean> st = new Stack<>();
        compute(expr, st, 0);
        Boolean result = st.pop();
        if (result == null) {
            throw new Error("Illegar expression");
        } else {
            System.out.println("task 9: " + result);
        }
    }
}
