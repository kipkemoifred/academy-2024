package academy_2026;

public class OOP {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Accessing attributes and methods
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");

        // Modifying attributes
        person1.setAge(31);
        System.out.println(person1.getName() + " is now " + person1.getAge() + " years old.");
    }
}
//super class
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public void job(){
        System.out.println("Person is living "+getName());
    }
}

//encapsulation: The Person class encapsulates the attributes name and age, providing public methods to access and modify them. This ensures that the internal state of the object is protected from direct access, promoting data integrity and security.
//inheritance: You can create a subclass of Person, such as Student or Employee, that inherits the attributes and methods of the Person class. This allows for code reuse and the creation of specialized classes that share common behavior.
//polymorphism: You can create multiple classes that implement a common interface or extend a common superclass, allowing you to treat objects of different types in a uniform way. For example, you could have a method that takes a Person object as a parameter and can accept instances of Student or Employee as well, demonstrating polymorphic behavior.

class PolymorphismExample {
    public static void main(String[] args) {
        System.out.println("Polymorphism example:");
        Person person = new Person("Charlie", 40);
        Student student = new Student("David", 20, "Computer Science");
        Teacher teacher= new Teacher("Eve", 35, "Mathematics");

        person.job();
        teacher.job();
        //overload job method
        teacher.job(4);
        student.job();

        //abstraction
        System.out.println("Abstraction example:");
        Car car=new Car("BMW");
        Bicycle bicycle=new Bicycle("Hero");
        car.accelerate();
        bicycle.accelerate();

        //interface
        System.out.println("Interface example:");
        Animal lion=new Lion();
        Animal dog=new Dog();
        lion.sound();
        dog.sound();

//        printPersonInfo(person);
//        printPersonInfo(teacher);
//        printPersonInfo(student); // Polymorphic behavior
    }

    public static void printPersonInfo(Person person) {
        System.out.println(person.getName() + " is " + person.getAge() + " years old.");
    }
}

class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
    @Override
    public void job(){
        System.out.println("Student is learning ,name-> "+getName()+" ,major-> "+getMajor());
    }
}

class Teacher extends Person{
    private String subject;
    private String name;
    private int rating;
    private int age;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    @Override
    public void job(){
        System.out.println("Teacher is teaching ,name->"+getName()+" ,subject->"+getSubject());
    }

//overload
    public void job(int rating){
        System.out.println("Teacher is teaching ,name->"+getName()+" ,subject->"+getSubject()+" ,rating->"+rating);
    }

}

//abstraction
abstract class Vehicle {
    private String model;

    Vehicle(String model) {
        this.model = model;
    }

    // Abstract method
    abstract void accelerate();

    // Concrete method
    void displayModel() {
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    Car(String model) {
        super(model);
    }

    // Implementing the abstract method
    void accelerate() {
        System.out.println("The car accelerates quickly.");
    }
}

class Bicycle extends Vehicle {
    Bicycle(String model) {
        super(model);
    }

    // Implementing the abstract method
    void accelerate() {
        System.out.println("The bicycle accelerates slowly.");
    }
}

//interface
interface Animal {
    void sound();
}
class Lion implements Animal {
    public void sound() {
        System.out.println("Lion roars");
    }
}
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

