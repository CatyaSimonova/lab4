package com.company;

import java.util.Stack;

public class task6 {
    public task6(String str) {
        Stack num = new Stack();
        Stack sim = new Stack();
        Stack buk = new Stack();
        Stack per = new Stack();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '9' && '0' < str.charAt(i))
                num.push(str.charAt(i));
            else if ((str.charAt(i) < 'Z' && 'A' < str.charAt(i)) || (str.charAt(i) < 'z' && 'a' < str.charAt(i)))
                buk.push(str.charAt(i));
            else
                sim.push(str.charAt(i));
        }
        System.out.print("task 6: ");
        while (!num.empty()) {
            per.push(num.pop());
        }
        while (!per.empty()) {
            System.out.print(per.pop());
        }while (!buk.empty()) {
            per.push(buk.pop());
        }
        while (!per.empty()) {
            System.out.print(per.pop());
        }
        while (!sim.empty()) {
            per.push(sim.pop());
        }
        while (!per.empty()) {
            System.out.print(per.pop());
        }

    }
}
