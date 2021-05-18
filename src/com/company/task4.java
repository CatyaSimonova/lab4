package com.company;

import java.util.Deque;
import java.util.Stack;

public class task4 {
    public task4(String str) {
        Stack stc = new Stack();
        Stack stc1 = new Stack();
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == '(')
                stc.push(str.charAt(i));
            else if(str.charAt(i) == ')')
                stc1.push(str.charAt(i));
        }
        if(stc.size() == stc1.size())
            System.out.println("task 4: true");
        else
            System.out.println("task 4: false");
    }
}
