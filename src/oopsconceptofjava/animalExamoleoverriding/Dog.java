package oopsconceptofjava.animalExamoleoverriding;

public class Dog extends AnimalOverridingParent {

    @Override
    public void makeSound()
    {
        System.out.println("Barks");
    }
    public static void main(String[] args) {
        AnimalOverridingParent aop= new AnimalOverridingParent();
        Dog ac= new Dog();
        Cat c= new Cat();
        Lion l= new Lion();

        aop.makeSound();
        ac.makeSound();
        c.makeSound();
        l.makeSound();



    }
}
