package org.ExceptionsListsThreads;
import java.io.File;

public class WorkingWithFile {
    public static void main(String[] args) {
     File file = new File("a.txt");
     if(file.exists()){
         System.out.println("Yes");
     }
    }
}
