package creational;

//singleton --> only one instance that should be accessible globally
// static member , private constructor, static factory method

class Singleton{
    private static Singleton single = null;

    private String s;

    private Singleton(){
        s = "hey from singleton constructor.";
    }

    public static Singleton getInstance(){
        if(single == null){
            single = new Singleton();
        }
        return single;
    }
}

public class TestSingletonDp {
    public static void main(String[] args){
        Singleton obj = Singleton.getInstance();

        System.out.println(obj);

        Singleton obj1 = Singleton.getInstance();

        //Singleton obj2 = new Singleton();

        System.out.println(obj1);
    }
}
