// 10.01.2026

// Inheritance - Access Modifiers 
// public: means the member can be accessed from anywhere
// private: means the member can only be accessed inside the same class
// Protected: allows access inside the same class, inside the same package, and from a subclass

/* Example 1 

class Student{
    public String name; // Data member 
    // Create a setter: a public function, will help to access private members
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){ // Method (function)
        System.out.println("Hello");
    }
    public void displayName(){
        System.out.println(name);
    }
}

public class InheritanceDemo{
    public static void main(String[] args){
        Student student1 = new Student();
       // student1.name = "Nevaeh";
       // System.out.println(student1.name);
       student1.setName("Nevaeh");
       System.out.println(student1.getName());
       student1.sayHello();
    }
}
    */

/* Example 2 

class Animal{
    protected String name; 
    public void eat(){
        System.out.println(name + " is eating!");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println(name + " is barking!");
    }
}

public class InheritanceDemo{
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.name = "Mallow";
        dog1.eat();
        dog1.bark();

    }
}

*/

/* Example 3 

class BankAccount{
    private String owner;
    private double balance;
    public BankAccount(String owner, double balance){ // Constructor 
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount; // this.balance = this.balance + amount
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public String getOwner(){
        return this.owner;
    }
}

public class InheritanceDemo{
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("Nevaeh", 100.00);
        bankAccount.deposit(500.00);
        System.out.println("Owner : " + bankAccount.getOwner());
        System.out.println("Balance : " + bankAccount.getBalance());

    }
}

*/

/* Example 4 */

class Animal{
    public void makeSound(){
        System.out.println("Animals make sound! ");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dogs say Wook Woof!!");
    }
}

class Cat extends Animal{
    //Method Overriding
    @Override
    public void makeSound(){
        System.out.println("Cats say Meow Meow!!");
    }
}

public class InheritanceDemo{
    public static void main(String[] args){

    }
}

