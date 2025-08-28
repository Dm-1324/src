class Animal{
    public void printName(){
        System.out.println("This can be any animal !!!!");
    }
}
class Dog extends Animal{
    public void printName(){
        System.out.println("This is a DOG !!!!");
    }
}
class Cat extends Animal{
    public void printName(){
        System.out.println("This is a CAT !!!!");
    }
}

public class Ques28 {
    public static void main(String[] args) {
        Animal newAnimal;
        newAnimal = new Animal();
        newAnimal.printName();

        newAnimal = new Dog();
        newAnimal.printName();

        newAnimal = new Cat();
        newAnimal.printName();
    }
}
