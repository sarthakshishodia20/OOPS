public class Inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        shark.sleep();
        shark.swim();
        shark.fins=25;
        System.out.println(shark.fins);
    
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("i can eat");
    }
    void sleep(){
        System.out.println("i can sleep");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("i can swim");
    }
}