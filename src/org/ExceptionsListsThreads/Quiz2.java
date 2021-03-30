package org.ExceptionsListsThreads;

//Module 6 Quiz
public class Quiz2 {
    public static void main(String[] args) {
    }
        void myFunc ( int arg) throws IllegalArgumentException {

            if (arg < 0)
                throw new IllegalArgumentException();
        }
    }