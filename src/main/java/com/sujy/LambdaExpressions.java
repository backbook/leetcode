package com.sujy;

interface Description{
    String brief();
}

interface Body{
    String detailed(String head);
}

interface Multi{
    String twoArg(String head,Double d);
}


public class LambdaExpressions {

    static Body bod = h -> h + "NO parens";

    public static void main(String[] args) {
        System.out.println(bod.detailed("hi,"));
    }


}
