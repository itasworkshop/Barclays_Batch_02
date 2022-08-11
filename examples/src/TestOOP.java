

//OOPs --> design your application in such a way that we are dealing with real world object

//object --> every real world represents an object
// state/properties
// behaviour/functionalities
// Laptop --> color, company, price, processor
//        --> playsmusic, playvedio, runsprogram

//class --> template or blueprint for creating objects
//      --> used for creating objects
//template at reception enquiry form is like class
//filled detail of enquiry --> object
class Laptop{

    String color;
    String company;
    int price;

    //constructor -- > looks like methods with class used for initialisation
    Laptop(String color,String company,int price){
        this.color = color;
        this.company = company;
        this.price = price;
    }

    public void playMusic(){
        System.out.println("My music is playing.");
    }

    public void getConfig(){
        System.out.println("This is "+ this.company + " laptop , of color "+ this.color+" it comes at price "+this.price);
    }
}


public class TestOOP {

    public static void main(String[] args){
        Laptop obj = new Laptop("Black","Dell",50000);
        obj.getConfig();
        obj.playMusic();
    }
}
