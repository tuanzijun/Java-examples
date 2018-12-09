import java.util.Scanner;
import java.util.Arrays;

public class TestSquare {
    public static void main(String[] args){

        Square[] data=new  Square[5];

        Scanner input = new Scanner(System.in);

        for(int i=0;i<data.length;i++){

            data[i]=new Square(input.nextInt());

        }

        System.out.println( "数组原顺序：");

        for(Square squ:data)

            System.out.println(squ.getArea());



        System.out.println( "升序排序后：");

        Square.sortByArea(data);

        for(Square squ:data)

            System.out.println(squ.getArea());

    }
}

class Square implements Comparable<Square>{
    int data;

    Square(int data){
        this.data = data;
    }

    public double getArea(){
        return Math.pow(this.data,2);
    }

    public static void sortByArea(Square[] data) {
        Arrays.sort(data);
    }

    @Override
    public int compareTo(Square square) {
        if(square.data > this.data)
            return -1;
        else if (square.data < this.data)
            return  1;
        return 0;
    }
}