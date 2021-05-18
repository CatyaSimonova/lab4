package com.company;

import java.util.Stack;

public class task10 {

    public static void compute(String expr, Stack<Integer> st, int deep) {
        int idx;
        // String d = "  ".repeat(deep);
        // System.out.println(d + "EXPR: " + expr);
        int num = -1;
        boolean isNumber = true;
        try {
            num = Integer.parseInt(expr);
        } catch (Exception e) {
            isNumber = false;
        }

        if (isNumber) {
            st.push(num);
        } else if (isInBrackets(expr)) {
            compute(expr.substring(1, expr.length() - 1), st, deep + 1);
        } else if (expr.startsWith("M(") && expr.endsWith(")")) {
            compute(expr.substring(2, expr.length() - 1), st, deep + 1);
            st.push(Math.max(st.pop(), st.pop()));
        } else if (expr.startsWith("N(") && expr.endsWith(")")) {
            compute(expr.substring(2, expr.length() - 1), st, deep + 1);
            st.push(Math.min(st.pop(), st.pop()));
        } else if ((idx = indexWithBrackets(expr,',')) != -1) {
            compute(expr.substring(0, idx), st, deep + 1);
            compute(expr.substring(idx + 1), st, deep + 1);
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

    public static void mtask10(String expr) {
        Stack<Integer> st = new Stack<>();
        compute(expr, st, 0);
        int result = st.pop();
        System.out.println("task 10: " + result);
    }
}
