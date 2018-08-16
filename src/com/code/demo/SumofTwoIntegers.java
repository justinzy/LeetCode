package com.code.demo;

public class SumofTwoIntegers {

    public int getSum(int a, int b){
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        while(b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args){
        SumofTwoIntegers st = new SumofTwoIntegers();
        int summ = st.getSum(2,3);
        System.out.println(summ);
    }
}
