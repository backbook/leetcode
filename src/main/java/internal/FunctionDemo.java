package internal;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer,Integer> function = i -> i+1;

        Function<Integer,Integer> function1 =  i -> i * 199;

        Integer apply = function.apply(1);
        System.out.println(apply);

        Runnable runnable = () -> System.out.println("1");
        runnable.run();

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("谎言和誓言的区别是什么呢");

        Consumer<String> consumer1 =
                (String st) -> {
            System.out.println(st);
        };
        consumer1.accept("一个听的人当真了，一个是说的人当真了");


        Consumer<String> consumer2 = st -> {st = st+"sada";System.out.println(st);};

        consumer2.accept("一个听的人当真了，一个是说的人当真了");


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        int compare = comparator.compare(10, 21);
        System.out.println(compare);

        Comparator<Integer> comparator1 = (t1,t2) -> {
            System.out.println(t1);
            System.out.println(t2);
            return t1.compareTo(t2);
        };
        int compare1 = comparator1.compare(11231, 11231);
        System.out.println(compare1);


        Comparator<Integer> comparator2 = (t1,t2) -> t1.compareTo(t2);


        System.out.println(comparator2.compare(2313,1231));

        LambdaTestFuction<Integer,Integer> lambdaTestFuction = s -> s * 1000;
        int run = lambdaTestFuction.run(10);
        System.out.println(run);


    }
}

interface LambdaTestFuction<T,E>{

    int run(T t);

}