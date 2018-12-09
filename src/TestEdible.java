//public class TestEdible {
//    public static void main(String[] args){
//
//        Object[] objects = {new Tiger(), new Chicken(), new Apple(),new Orange()};
//
//        System.out.println("输出所有食品的食用方法：");
//
//        for(Object obj:objects){
//
//            if (obj instanceof Edible)
//
//                System.out.println(obj + "{"+((Edible) obj).howToEat()+"}");
//
//        }
//
//        System.out.println("\n输出所有动物的叫声：");
//
//        for(Object obj:objects){
//
//            if (obj instanceof Animal)
//
//                System.out.println(obj + "{"+((Animal) obj).cry()+"}");
//
//        }
//
//    }
//}
//
//interface Edible{
//    public String howToEat();
//}
//
//abstract class Animal{
//    public abstract String cry();
//}
//
//class Chicken extends Animal implements Edible{
//    public String cry(){
//        return "gugu";
//    }
//    public String toString(){
//        return "Chicken";
//    }
//    public String howToEat(){
//        return "煎一下";
//    }
//}
//
//class  Tiger extends Animal{
//    public String cry(){
//        return "wouwou";
//    }
//    public String toString(){
//        return "Tiger";
//    }
//}
//
//abstract class Fruit implements Edible{
//        }
//
//
//        class Apple extends Fruit{
//            @Override
//            public String howToEat() {
//                return "直接食用";
//            }
//            public String toString(){
//                return "Apple";
//            }
//        }
//
//        class Orange extends Fruit{
//            @Override
//            public String howToEat() {
//                return "打成果汁";
//            }
//            public String toString(){
//                return "Orange";
//            }
//        }