public class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){

        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void sleep() {
        System.out.println(name+" is sleeping *Zzzzz*");
    }

    void eat() {
        System.out.println(name+" is eating *nhac*");
    }
}