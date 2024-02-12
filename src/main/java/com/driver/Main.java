package com.driver;
class A{
    void run(){
        System.out.println("Invoking method from class A");
    }
}
class B extends A{
    void run(){
        System.out.println("Method is overridden in Extendend class B");
    }
}
public class Main {
        public static void main(String[] args){
            B obj = new B();
            obj.run();
        }

}