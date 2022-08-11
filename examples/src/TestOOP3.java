
//Abstraction --> 1) Abstract class --> can have both abstract as well concrete method
// 2) Interface --> only abstract method

abstract class RBI{

    abstract int calculateEMI(int intrest,int time);
}

interface RBIInterface{
    int calculateEMI(int intrest,int time);
}

class HdfcBank implements RBIInterface{

    @Override
    public int calculateEMI(int intrest, int time) {
        return intrest*10 + time;
    }
}

class AxisBank extends RBI{

    @Override
    int calculateEMI(int intrest, int time) {
        return intrest*20;
    }
}

public class TestOOP3 {

    public static void main(String[] args){
        HdfcBank obj1 = new HdfcBank();
        System.out.println(obj1.calculateEMI(2000,5));

        AxisBank obj2 = new AxisBank();
        System.out.println(obj1.calculateEMI(5000,15));
    }
}
