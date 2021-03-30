package org.MoreandClasses;

public class DownCasting {
    public static void main(String[] args) {
        class A {
            public void print() {
                System.out.println("A");

            }
        }
        class B extends A {
            public void print() {
                System.out.println("B");
            }

            public void main(String[] args) {
                A object = new B ();
                B b = (B) object;
                b.print();
            }
        }
    }

}
