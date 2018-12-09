import java.util.Scanner;
public class TestBill {
    public static void main(String args[]){
        double[] rate = {5,7,9};
        Scanner input = new Scanner(System.in);
        WaterBill bill = new WaterBill();
        bill.setRate(rate);
        bill.setVolume(input.nextDouble());
        System.out.println("水费为"+bill.getBill());
    }


}

abstract class Bill{
    protected double volume;

    protected Bill(){
        volume = 0;
    }

    protected Bill(double volume){
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public abstract double getBill();
}

class WaterBill extends Bill{
    private double[] rate = {2.28,2.5,3.9};

    public  WaterBill(){

    }

    public WaterBill(double volume){
        super(volume);
    }

    public double[] getRate() {
        return rate;
    }

    public void setRate(double[] rate) {
        this.rate = rate;
    }

    @Override
    public double getBill() {
        double volume = this.volume;
        if (volume > 0 && volume <= 180)
            return volume*rate[0];
        if (volume > 181 && volume <=260)
            return (volume-180)*rate[1]+180*rate[0];
        if (volume > 260)
            return (volume-260)*rate[2]+80*rate[1]+180*rate[0];

        return volume;
    }
}