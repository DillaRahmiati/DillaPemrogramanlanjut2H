package org.ExceptionsListsThreads;

import java.util.HashMap;

//HashMap
public class B {
    public static void main(String[] args) {
        HashMap<String, String> m = new HashMap<String, String>();
        m.put("A", "First");
        m.put("B", "second");

        System.out.println(m.get("B"));
    }
}
