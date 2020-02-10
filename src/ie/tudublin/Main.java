package ie.tudublin;

public class Main
{
     public static void main(String[] args) {
        System.out.println("Hello world");    

        //Animal a = new Animal();

        // The type is a superclass, the instance is a subclass

        // This is not polymorphism
        Cat topcat = new Cat("Topcat");

        // This is polymorphism!
        Animal mino = new Cat("Mino");
        // A vitual method!
        // Dynamic binding
        mino.speak();
        // This wont compile!!
        //System.out.println(mino.getNumLives());
        // This is an example of a cast
        System.out.println(((Cat)mino).getNumLives());

        mino = new Dog("Misty");  // This will compile!
        //topcat = new Dog("Tara"); // This wont compile!




    }
}