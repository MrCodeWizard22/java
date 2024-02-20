// access specifiers for a class in java are 4 
// 1. private:only accessible inside a class only,within package, outside package by subclass only

// 2. default: if we don't specify the specifiers for a class then by default it is of
//     default type and we can access its members within class and package only

// 3. protected : can access within class withing package, outside package
//     by subclass only 

// 4. public : within class , within package, outside package by subclass only,
//     and outside package also.

// constructor:
//     only being called only once, the memory is alloted for an object only when
//     the constructor is called 

//     in syntax we don't use any keyword and just write the function name 
//     like for Pen class we will write the constructor as Pen()
//     there are default constructor in a java class if we donot write any
//     then it will invoke a default constructor

public class OOPs {
    
    public static void main(String []args){
        // Student s1 = new Student("rahul");  //student() --constructor 

        // s1.calPer(10, 20, 30);
        // System.out.println(s1.percentage);

        // Pen p1 = new Pen();

        // p1.setColor("green");
        // System.out.println("getcolor"+ p1.getColor());

        // p1.setTip(5);
        // System.out.println("gettip"+ p1.getTip());

        // Fish salmon = new Fish();

        // salmon.eat();

        Calculator c1 = new Calculator();

        System.out.println("sum of two integer values "+ c1.sum(2,3));
        System.out.println("Sum of two float value "+ c1.sum(2.2f, 3.4f));
        System.out.println("Sum of three integer values "+c1.sum(3,3,5));
        

    }
}

class Student {
    String name;
    int age;
    float percentage;

    Student(String n){
        this.name = n;

    }
    void calPer(int ph, int ch, int ma){
        percentage=(ph + ch + ma)/3;
    }
}

class Pen {
    private String color;
    private int tip;
    String getColor(){
        return this.color ;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String c){
        this.color = c;
    }

    void setTip(int t){
        this.tip = t;
    }
    
}

// inheritence :
//         some properties from a parent class transfered to child class
//         we use extends keyword in child class as shown below

// there are some types of inheritence : single level, multilevel,heirarchical,hybrid
//     --in given below example the fishand Animal class is type of single level
//         and dog is a type of multilevel inheritence


    
// polymorphism : 
        // many forms-- compile time and run time 
                // two types of overloading:
                //     1.method overloading
                            // two methods with diffrent parameter 
                            // it is type of compile time overloading

                        
    

class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }
}
class Mammal extends Animal{
    int legs;

}
class dog extends Mammal{
    boolean bark;
}

class Calculator{
    int sum(int a ,int b){
        return a+ b;
    }
    float sum(float a , float b){
        return a + b;
    }

    int sum ( int a , int b, int c){
        return a + b + c;
    }
}