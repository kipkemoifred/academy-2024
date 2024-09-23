package fundermentals;

import org.w3c.dom.ls.LSOutput;

public class Methods {
    public static void main(String[] args) {
        myMethod();
        myMethod();
        int y=myMethod2(2,3);
        System.out.println(y);

        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        //code scope

        // Code here CANNOT use x

        int x = 100;

        // Code here can use x
        System.out.println(x);


        // Code here CANNOT use x

        { // This is a block

            // Code here CANNOT use x

            int z = 100;

            // Code here CAN use x
            System.out.println(z);

        } // The block ends here

        // Code here CANNOT use x


        System.out.println("=========================recursion====================================");
        int result = sum(10);
        System.out.println(result);

    }
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static int myMethod2(int x, int y) {
        return x + y;
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }



    //overloading
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }


}
