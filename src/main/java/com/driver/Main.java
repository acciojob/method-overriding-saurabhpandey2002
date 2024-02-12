package com.driver;
public class Main {
        public static void main(String[] args){
            B obj = new B();
            obj.meth();
        }
        static class A{
            void meth(){
                System.out.println("Invoking method from class A");
            }
        }
        static class B  extends A{
            void meth(){
                System.out.println("Method is overridden in Extendend class B");
            }
        }
}