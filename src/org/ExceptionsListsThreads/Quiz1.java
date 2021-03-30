package org.ExceptionsListsThreads;

//Module 6 Quiz
public class Quiz1 {
    public static void main(String[] args) {

    }
    void myFunc(int a,int b) {
        try
        {
            System.out.println(a / b);
        }
        catch
        (Exception e) {
            System.out.println("Error");
        }
    }
}
