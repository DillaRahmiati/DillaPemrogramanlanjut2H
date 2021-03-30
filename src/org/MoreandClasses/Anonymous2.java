package org.MoreandClasses;

//Anonymous Classes
public class Anonymous2 {
    public static void main(String[] args) {
    }

    static class A {

        public void print() {
            System.out.println("A");
        }
    }

    static class B {

        public static void main(String[] args) {
            A object = new A() {
                @Override
                public void print() {
                    System.out.println("Hello");
                }
            };
            object.print();

        }
    }
}