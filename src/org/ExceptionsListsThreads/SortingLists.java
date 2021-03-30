package org.ExceptionsListsThreads;
import java.util.*;

public class SortingLists {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("a");
        list.add("c");
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
