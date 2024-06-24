class Animal{
    void breathing(){
        System.out.println("Animals Breathe");
    }
    void eat(){
        System.out.println("Carnivores eat meat, Herbovores eat plants and Omnivores eat both");
    }
    void foodHabit(){
        System.out.println("Animals have different food habits");
    }
}

class Deer extends Animal{
    void foodHabit() {
        System.out.println("Deer Eats Grass");
    }
}

class Tiger extends Animal{
    void foodHabit() {
        System.out.println("Tiger Eats Raw Meat");
    }
}

class Monkey extends Animal{
    void foodHabit() {
        System.out.println("Monkey Eats Fruits");
    }
}

public class Assignment {
    public static void main(String[] args) {
        Deer d = new Deer();
        Tiger t = new Tiger();
        Monkey m = new Monkey();
        Animal a = new Animal();
        d.foodHabit();
        t.foodHabit();
        m.foodHabit();
        a.foodHabit();
    }
}
