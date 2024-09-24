package oop;


class OuterClass {
    int x = 10;

     class InnerClass {//private  static
        int y = 5;

         public int myInnerMethod() {
             return x;
         }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//        OuterClass.InnerClass myInner = new OuterClass.InnerClass();//static
        System.out.println(myInner.y + myOuter.x);
        System.out.println(myInner.myInnerMethod());
    }
}


//Anonymous inner class as an argument
abstract class Engine {
    public abstract void engineType();
}
class Vehicle4 {
    public void transport(Engine e) {
        e.engineType();
    }
}
 class Tester {
    public static void main(String args[]) {
        Vehicle4 v = new Vehicle4();
        v.transport(new Engine() {
            @Override
            public void engineType() {
                System.out.println("Turbo Engine");
            }
        });
    }
}