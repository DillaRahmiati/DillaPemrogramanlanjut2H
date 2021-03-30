package org.ExceptionsListsThreads;
import java.util.HashSet;

//Sets
public class Sets {
    public static void main(String[ ] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set.size());
    }
}
