package org.ExceptionsListsThreads;

public class Threads {
    static class A extends  Thread {
        public void run () {
            System.out.println("Hello");
        }

        public static void main(String[] args) {
            A object = new A();
            object.start();
        }
    }
}
