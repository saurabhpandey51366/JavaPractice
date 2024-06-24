package ProblemSolving;
class Vehicle{
    String brand = "Tata";
    String model = "Nexon";
    int year = 2006;
    void drive(){
        System.out.println("Car which you want ot drive");
    }
}


public class Inheritance {
    public static void main(String[] args) {

    }
}

class Car extends Vehicle{
    String color = "Red";
    void honk(){
        
    }
}
