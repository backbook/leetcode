package com.akulaku;


import java.util.function.Consumer;


interface Callable { // [1]
    void call(String s);
}

class Describe{

    void show(String msg){
        System.out.println("msg "+msg);
    }
}




public class MethodReferences {

    static void hello(String name){
        System.out.println("hello, "+name);
    }

    static class Description{
        String about;
        Description(String desc){
            about  = desc;
        }
        void helP(String msg){
            System.out.println(about + "  "+ msg);
        }
    }

    static class Helper{
        static void assist(String msg){
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {

        Describe describe = new Describe();
        Callable show = describe::show;
        show.call("call()");


    }








}
