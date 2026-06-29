package academy_2026;

public class ControlFlowLoops {
    public static void main(String[] args) {
        int number = 10;

        // If-Else Statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        int age = 25;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("Allowed entry");
        } else {
            System.out.println("Not allowed");
        }

//        int age = 20;
        boolean hasLicense = true;

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("Can drive");
            } else {
                System.out.println("No license");
            }
        } else {
            System.out.println("Too young to drive");
        }

        // Switch Statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop iteration: " + i);
        }

//break and continue
        System.out.println("Break and Continue Example:");
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println("i: " + i);
        }
        System.out.println("Out of Loop");

        for (int i = 0; i < 10; i++) {
            if (i == 2)
                continue;
            System.out.print(i + " ");
        }


        // While Loop
        int count = 0;
        while (count < 5) {
            System.out.println("While Loop iteration: " + count);
            count++;
        }

        // Do-While Loop
        int doCount = 0;
        do {
            System.out.println("Do-While Loop iteration: " + doCount);
            doCount++;
        } while (doCount < 5);
    }
}
