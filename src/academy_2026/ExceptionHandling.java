package academy_2026;

public class ExceptionHandling {
    //Errors are serious problems that occur due to system-level failures and are generally beyond the control of the application. They are not meant to be caught or handled by the program.
    //Exceptions are abnormal conditions that occur during program execution due to logical or runtime issues. Unlike errors, exceptions can be handled using try-catch blocks.
    public static void main(String[] args) {
        // Built-in exception example
        try {
            int result = 10 / 0; // ArithmeticException
            int[] arr = new int[20];

            arr[20] = 20;

            System.out.println(arr[20]);
        }
        catch (ArithmeticException e){

            System.out.println("Built-in Exception caught: "
                    + e);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        // User-defined exception example
        try {
            validateAge(16);
        }
        catch (AgeNotValidException e) {
            System.out.println(
                    "User-defined Exception caught: "
                            + e.getMessage());
        }
        finally {
            // code that will always execute
            System.out.println("finally This block always executes.");
        }

    }
    static void validateAge(int age)
            throws AgeNotValidException
    {
        if (age < 18) {
            throw new AgeNotValidException(
                    "Age must be 18 or above");
        }
        System.out.println("Age is valid");
    }
}

class AgeNotValidException extends Exception{//custom exception

    AgeNotValidException(String message){
        super(message);

    }
    // throws: Declares exceptions that a method might throw, informing the caller to handle them. It is mainly used with checked exceptions
}
