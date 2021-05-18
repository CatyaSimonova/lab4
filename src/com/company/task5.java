package com.company;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class task5  {
    public task5 (String str) {
        Deque stc = new LinkedList();
        Deque stc1 = new LinkedList();
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i)=='[')
                stc.push(str.charAt(i));
            else if(str.charAt(i)==']')
                stc1.push(str.charAt(i));
        }
        if(stc.size()==stc1.size())
            System.out.println("task 5: true");
        else
            System.out.println("task 5: false");
    }
}
