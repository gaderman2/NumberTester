package net.htlgkr.gattermannk190189;

import java.util.ArrayList;
import java.util.List;

public class HalloJavaMitForEach {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(" Java");
        list.add(" with");
        list.add(" ForEach");

        for(String s : list)
            System.out.println(s);

        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }

}
