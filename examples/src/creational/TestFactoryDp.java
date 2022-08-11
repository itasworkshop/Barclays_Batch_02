package creational;

//Factory DP --> using interface or abstract for creating objects and subclass can decide which one to instantiate
//loose coupling

import java.util.Scanner;

abstract class Product{

    protected double rate;
    abstract void getRate();

    public void calculateTotalBill(int unit){
        System.out.println(unit*rate);
    }
}

class DomesticLaunch extends Product{
    @Override
    void getRate() {
        this.rate = 5.50;
    }
}

class InternationalLaunch extends Product{
    @Override
    void getRate() {
        this.rate = 10.50;
    }
}

class GetProductFactory{

    public Product getProduct(String marketType){
        if(marketType ==null){
            return null;
        }if(marketType.equals("domestic")){
            return new DomesticLaunch();
        }if(marketType.equals("domestic")){
            return new InternationalLaunch();
        }
        return null;
    }
}

public class TestFactoryDp {
    public static void main(String[] args){
        GetProductFactory factory = new GetProductFactory();
        String marketPlan = "domestic";
        int unit  = 100;

        //Scanner sc = new Scanner(System.in); marketPlan = sc.nextLine();

        Product product = factory.getProduct(marketPlan);
        product.getRate();
        product.calculateTotalBill(unit);

    }
}
