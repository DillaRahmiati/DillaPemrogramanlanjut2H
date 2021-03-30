package org.ExceptionsListsThreads;

public class Threads2 {
   static class A implements Runnable {
       public void run() {
           System.out.println("Bye");
       }
   }
   public static class App {
       public static void main(String[] args) {
           Thread ob = new Thread(new A ());
           ob.start();
       }
   }
}
