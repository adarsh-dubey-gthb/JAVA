public class overriding {
    static class Animal{
        void sound(){
            System.out.println("Some generic sound");
        }
    }
    static class Dog extends Animal {
        @Override
        void sound(){
            System.out.println("Woof woof! ");
        }
    }
    static class Cat extends Animal{
        @Override
        void sound(){
            System.out.println("Meow Meow! ");
        }
    }
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
    }
}
