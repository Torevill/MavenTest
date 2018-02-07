package com.sources;

public class Solution {


    public static int Fibonacci(int n){
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else if (n == 2) return 1;
        int answ = 2;
        int temp1 = 1;
        int temp2 = 1;

        for (int i = 3; i < n; i++) {
            answ+=(temp1+temp2);
            temp1 = temp2;
            temp2 = i;
        }
        return answ;
    }
}