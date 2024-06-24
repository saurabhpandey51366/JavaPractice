class Heart { //Composition Class
    private double weight; //Instance Variables using Encapsulation
    private int bpm; //Instance Variables using Encapsulation
    Heart(double weight, int bpm) { //Constructor
        this.weight = weight;
        this.bpm = bpm;
    }
    double getWeight() { //Getter Method
        return weight;
    }
    int getBpm() { //Getter Method
        return bpm;
    }
}

class Brain { //Composition Class
    private double weight; //Instance Variables using Encapsulation
    private String color; //Instance Variables using Encapsulation
    Brain(double weight, String color) { //Constructor
        this.weight = weight;
        this.color = color;
    }
    double getWeight() { //Getter Method
        return weight;
    }
    String getColor() { //Getter Method
        return color;
    }
}

class Bike { //Aggregation Class
    private String brand; //Instance Variables using Encapsulation
    private int mileage; //Instance Variables using Encapsulation
    Bike(String brand, int mileage) { //Constructor
        this.brand = brand;
        this.mileage = mileage;
    }
    String getBrand(){ //Getter Method
        return brand;
    }
    int getMileage(){ //Getter Method
        return mileage;
    }
}
class Book { //Aggregation Class
    private String name; //Instance Variables using Encapsulation
    private String author; //Instance Variables using Encapsulation
    Book(String name, String author) { //Constructor
        this.name = name;
        this.author = author;
    }
    String getName(){ //Getter Method
        return name;
    }
    String getAuthor(){ //Getter Method
        return author;
    }
}

class Student1 {
    Heart H = new Heart(412,72); //Object Creation for Composition Class
    Brain B = new Brain(1.3,"Pink"); //Object Creation for Composition Class
    void hasA(Bike bi) {
        System.out.println("Brand of Bike: " + bi.getBrand());
        System.out.println("Mileage of Bike: " +bi.getMileage());
    }
    void hasA(Book bo) {
        System.out.println("Name of Book: " + bo.getName());
        System.out.println("Name of Author of Book: " + bo.getAuthor());
    }
}

class AggregationAndComposition{
    public static void main(String[] args){
        Bike bi = new Bike("Yamaha",40); //Object Creation for Aggregation Class
        Book bo = new Book("ANSI C", "E Balaguruswamy"); //Object Creation for Aggregation Class
        Student1 s = new Student1(); //Object Creation for Main Class
        System.out.println("Weight of Heart of Student: " + s.H.getWeight());
        System.out.println("BPM of Heart of Student: " + s.H.getBpm());
        s.hasA(bi);
        System.out.println("Weight of Brain of Student: " + s.B.getWeight());
        System.out.println("Color of Brain of Student: " + s.B.getColor());
        s.hasA(bo);
        s=null;
        System.out.println("Brand of Bike: " + bi.getBrand());
        System.out.println("Mileage of Bike: " + bi.getMileage());
        System.out.println("Name of Book: " + bo.getName());
        System.out.println("Name of Author of Book: " + bo.getAuthor());
        }
}