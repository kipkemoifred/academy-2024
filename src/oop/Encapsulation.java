package oop;

/*
* The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

    declare class variables/attributes as private
    provide public get and set methods to access and update the value of a private variable
*/

public class Encapsulation {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }



}

 class Test{
     public static void main(String[] args) {
         Encapsulation myObj = new Encapsulation();
//         myObj.name = "John";  // error
         myObj.setName("John"); // Set the value of the name variable to "John"
         System.out.println(myObj.getName());
     }
}
