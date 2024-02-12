package com.driver;
class A {
    String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: create object of class B and call method meth of class A with it
        B objB = new B();
        System.out.println(objB.meth()); // Output: Method is overridden in Extended class B

        // Task 5: call this overridden method from obj of class B
//        System.out.println(objB.meth()); // Output: Method is overridden in Extended class B
    }
}