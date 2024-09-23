package oop;

/*
* A constructor in Java is a special method that is used to initialize objects.
* The constructor is called when an object of a class is created.
*  It can be used to set initial values for object attributes:*/

public class ClassObj {
    int x = 5;//attribute
    int y = 5;//attribute

    // Create a class constructor for the Main class
    public ClassObj() {
        y = 7;  // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {//method

        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        ClassObj myObj = new ClassObj();
        ClassObj myObj2 = new ClassObj();

        myObj.myPublicMethod();
        System.out.println(myObj.x);
        System.out.println(myObj2.x);


        System.out.println(myObj2.y);
    }

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
}
