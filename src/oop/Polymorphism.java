package oop;

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}


class Bike{
//    int a=10;
    void run(){System.out.println("running");}
}
class Splendor extends Bike{
//    int a=20;
    void run(){System.out.println("running safely with 60km");}

    public static void main(String args[]){
        Bike b = new Splendor();//upcasting
        b.run();
//        System.out.println(b.a);
    }
}

/*
* Java Runtime Polymorphism with Data Member

A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.*/

class Bike1{
    int speedlimit=90;
}
class Honda3 extends Bike1 {
    int speedlimit = 150;

    public static void main(String args[]) {
        Bike1 obj = new Honda3();
        System.out.println(obj.speedlimit);//90
    }
}

/*
* static binding

When type of the object is determined at compiled time(by the compiler), it is known as static binding.

If there is any private, final or static method in a class, there is static binding.*/

class Dog1{
    private void eat(){System.out.println("dog is eating...");}

    public static void main(String args[]){
        Dog1 d1=new Dog1();
        d1.eat();
    }
}


class Animal2{
    void eat(){System.out.println("animal is eating...");}
}

class Dog2 extends Animal2{
    void eat(){System.out.println("dog is eating...");}

    public static void main(String args[]){
        Animal2 a=new Dog2();
        a.eat();
    }
}

//Upcasting
class Animal3 {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog3 extends Animal3 {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches a ball");
    }
}



class Animal4 {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog4 extends Animal4 {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches a ball");
    }
}

 class Main3 {
    public static void main(String[] args) {
        Animal4 animal = new Dog4();  // Upcasting (implicit)

        // Downcasting (Animal to Dog)
        Dog4 dog = (Dog4) animal;
        dog.fetch();  // Dog fetches a ball
    }
}



 class Main1 {
    public static void main(String[] args) {
        Dog3 dog = new Dog3();

        // Upcasting (Dog to Animal)
        Animal3 animal = dog;
        animal.sound();  // Dog barks (method overriding in action)

//         animal.fetch();  // Not allowed, Animal class doesn't have fetch() method
    }
}

interface Printable{}
class A implements Printable{
    public void a(){System.out.println("a method");}
}
class B implements Printable{
    public void b(){System.out.println("b method");}
}

class Call{
    void invoke(Printable p){//upcasting
        if(p instanceof A){
            A a=(A)p;//Downcasting
            a.a();
        }
        if(p instanceof B){
            B b=(B)p;//Downcasting
            b.b();
        }

    }
}//end of Call class

class Test4{
    public static void main(String args[]){
        Printable p=new B();
        Call c=new Call();
        c.invoke(p);
    }
}
