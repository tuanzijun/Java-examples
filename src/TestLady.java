import java.util.Scanner;

public class TestLady {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] infomation = input.nextLine().split(" ", 4);

        Lady lady = new Lady(infomation[0],infomation[1].equals("Cat")?new Cat(infomation[2],infomation[3]):new Dog(infomation[2],infomation[3]));


        System.out.println(lady+ ";Her pet cry  "+lady.myPetCry());

    }
}

abstract class Animal{
    public String name;
    protected Animal(String name){
        this.name = name;
    }
    abstract public String cry();
}

class Cat extends Animal{
    private String eyesColor;
    public Cat(String name,String color){
        super(name);
        this.eyesColor = color;
        this.name = name ;
    }

    public String cry(){
        return "miaomiao!";
    }

    public String toString(){

        return "Cat{name="+name+";eyesColor="+this.eyesColor+"}";
    }
}

class Dog extends Animal{
    private String furColor;

    public Dog(String n,String color){
        super(n);
        this.name = n;
        this.furColor = color;
    }

    public String cry(){
        return "wangwang!";
    }

    public String toString(){
        return "Dog{name="+this.name+";furColor="+this.furColor+"}";
    }
}

class Lady {
    private String name;
    private Animal pet;

    public Lady(String name,Animal pet){
        this.name = name;
        this.pet = pet;
    }

    public String myPetCry(){
        return pet.cry();
    }

    public String toString(){
        return "Lady{name="+this.name+",pet="+this.pet+"}";
    }

}