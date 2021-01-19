package DataStructure.Map;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

    @Test
    public void test() {
        List list = new ArrayList();
        List arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add("app1");
        arrayList.add(-1);
        list.add(arrayList);
        arrayList.clear();
        arrayList.add(1);
        arrayList.add("app2");
        arrayList.add(-1);
        list.add(arrayList);

        list.forEach(System.out::println
        );


    }


}
