package fundermentals;

public class Loops {
    public static void main(String[] args) {
        System.out.println("=====================while loop==============================");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("======================do while=============================");

        int j = 2;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 9);

        System.out.println("======================for=============================");

        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        for (int a = 1; a <= 2; a++) {
            System.out.println("Outer: " + a); // Executes 2 times

            // Inner loop
            for (int b = 1; b <= 3; b++) {
                System.out.println(" Inner: " + b); // Executes 6 times (2 * 3)
            }
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String c : cars) {
            System.out.println(c);
        }



    }
}
