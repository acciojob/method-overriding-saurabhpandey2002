package com.driver;

public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
        // Task 3: create object of class B and call method meth of class A with it
        B objB = new B();
        System.out.println(objB.meth()); // Output: Method is overridden in Extended class B

        // Task 5: call this overridden method from obj of class B
        B objB1 = new B();
       System.out.println(objB1.meth()); // Output: Method is overridden in Extended class B
    }
}