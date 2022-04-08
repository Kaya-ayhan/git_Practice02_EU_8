package day37_Inheritance.animalTask.animal;

public class Parrot extends Animal {

    public Parrot(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void sing(){
        System.out.println(name+" is singing");
    }
}
