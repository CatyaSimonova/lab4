//package com.company;
//
//public class Deque {
//    int size;
//    int head;
//    int tail;
//    int[] data;
//
//    Deque(int size){
//        data = new int [this.size = size];
//    }
//    void pushBack(String value){
//        if (++tail == size)
//            tail = 0;
//        data[tail] = value;
//    }
//    String popBack(){
//        int ret = data[tail];
//        if (--tail < 0)
//            tail = size - 1;
//        return ret;
//    }
//    void pushFront(String value){
//        data[head] = value;
//        if (--head < 0)
//            head = size - 1;
//    }
//    int popFront(){
//        if (++head == size)
//            head = 0;
//        return data[head];
//    }
//    boolean isEmpty(){
//        return head == tail;
//    }
//
//    public char peekBack() {
//    }
//}
