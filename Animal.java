public class Animal {
    String name;
    void eat(){
        System.out.println(name + " is eating");
    }
    void sleep(){
        System.out.println(name + " is sleeping");
    }

}

class Dog extends Animal{
    void bark(){
        System.out.println(name + " is barking");
    }
}

class Main{
    public static void main(String[] args){
      Dog dog = new Dog();
      dog.name = "Buddy";
      dog.bark();
      dog.eat();
      dog.sleep();
    }
}