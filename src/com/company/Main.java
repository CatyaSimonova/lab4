package com.company;


import javax.script.ScriptException;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws ScriptException {
        //task1
        String str1="A C B D D D SD ";
        new task1(str1);
        System.out.println();

        //task2
        String str = "12315";
        Deque<Character> dec = new LinkedList<>();
        String code = ")а12ко39ш(5";
        for (int i = 0; i < code.length(); i++) {
            dec.addLast(code.charAt(i));
        }
        new task2(dec, str);

        //task3
        System.out.print("task 3: \n");
        new task3(4, 'A','B','C');
        //task4
        String str4 = "((((1151()))()))";
        new task4(str4);
        //task 5
        String str5 = "[]";
        new task5(str5);
        //task6
        String str6 = "111qqqwww111--1q-_+";
        new task6(str6);
        System.out.println();
        //task7
        int[] arr7 = {1, -15, 16, 71, -3};
        new task7(arr7);
        System.out.println();
        //task8
        String str8 = "15 q1 1521 qwt";
        new task8(str8);
        System.out.println();
        //task9
        String str9= "FO(TAFO(FOT))X(NT)"; // "T"
        //new task9(str9);
        task9.mtask9(str9);
        //task10
        String str10="N(9,(M(3,N(1,2))))"; // 3
        task10.mtask10(str10);
        //task11
        String str11="x-((y+z)+(z-y))"; // 1-((2+3)+(3-2)) = -5
        task11.mtask11(str11);
        String str11b="x-((+z)+(z-y))"; 
        task11.mtask11(str11b);
    }
}

