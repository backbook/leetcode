package com.sujy;

interface IntCall{
    int call(int arg);

}

public class RecursiveFactorial {

    static IntCall fact;
    public static void main(String[] args){
        //使用n == 0的条件终止，不然会一直运算，直到打爆
        fact = n -> n == 0 ? 1 : n * fact.call(n - 1);
        for (int i = 0; i < 10 ; i++) {
            System.out.println(fact.call(i));
        }


    }

}
