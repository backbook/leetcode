package internal;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer,Integer> function = i -> i+1;

        Function<Integer,Integer> function1 =  i -> i * 199;

        Integer apply = function.apply(1);
        System.out.println(apply);


    }
}
