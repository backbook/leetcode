import com.sujy.design.mode.decorator.Test;

import java.util.ArrayList;


public class test {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();

        System.out.println(c1 == c2);

    }

}