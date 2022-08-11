
//method overloading
class Calculator{

    public int addition(int a,int b){
        return a+b;
    }

    public int addition(int a,int b,int c){
        return a+b+c;
    }
}


public class TestOOP4 {
    public static void main(String[] args){
        Calculator obj = new Calculator();
        System.out.println(obj.addition(10,20));
        System.out.println(obj.addition(10,20,30));
    }
}
