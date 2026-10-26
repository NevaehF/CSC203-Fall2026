//09/24/2026
// Classes and Objects 


// Student class demo #1
/* 
class Student{ // 1 = class name 
    String name; // Atributes - Data members 
    int age;  
}

public class Main{
    public static void main(String[] args){ 
        Student student1 = new Student(); // Instantiated an object from student
        student1.name = "Michael";
        student1.age = 23;
        System.out.println(student1.name);
        System.out.println(student1.age);
        Student student2 = new Student();
        student2.name = "Alain";
        student2.age = 22;
        System.out.println(student2.name);
        System.out.println(student2.age);
    }
}
 */

// --------------------------------------------------------------------------------------------------------------------------------

/* 
 // car class demo #2
class Car{
    String brand;
    String color; 
    int year; 
}

public class Main{
    public static void main(String[] args){
        Car car1 = new Car();
        car1.brand = "Scion";
        car1.color = "White";
        car1.year = 2011;
        Car car2 = new Car();
        car2.brand = "Nissan";
        car2.color= "White";
        car2.year = 2026;
        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.year);
        System.out.println();
        System.out.println(car2.brand);
        System.out.println(car2.color);
        System.out.println(car2.year);
    }
}
    */
 //  --------------------------------------------------------------------------------------------------------------------------------------

 
/*
// Class Dog Demo #3 
//  class Dog{
    String name;
    public void bark(){
        System.out.println("Woof Woof!... ");
    }
}
    public class Main{
    public static void main(String[] args){
        Dog d = new Dog();
        d.name = "Mallow";
        d.bark();
    }
}
*/
//  --------------------------------------------------------------------------------------------------------------------------------------

/*
// Class Dog Demo #4 
class Dog{
    String name;
    public void introduce(){
        System.out.println("My name is " + name);
    }
}

public class Main{
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.name = "Marshmallow";
        dog1.introduce();
        Dog dog2 = new Dog();
        dog2.name = "Daisy";
        dog2.introduce();
    }
}
*/
//  --------------------------------------------------------------------------------------------------------------------------------------

// Student class demo #5

    class Student{
        String name; 
        int age; 
        public Student(){ // Constructor - It doesn't have parameters 
            name = "Unknown";
            age = 0;
        }

        public Student(String studentName, int studentAge){ // It takes parameters 
            name = studentName;
            age = studentAge;
        }
    }
public class Main{
    public static void main(String[] args){
        Student student1 = new Student( "Nevaeh",21);
        Student student2 = new Student("Sarae", 21);
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student2.name);
        System.out.println(student2.age);

    }
}

