package oopsquestion1;

public class MainClass {

    public static void main (String args [] ){
        MyInterfaceTwoImpl myClass = new MyClass();
        myClass.describe();

    }
}


/* If two interfaces contain a method with the same signature
   then it is impossible to implement both the interfaces simultaneously.
   Though the use of interface makes multiple inheritance possible, but the method
   with same name and same signature will be considered as one method only.

* */