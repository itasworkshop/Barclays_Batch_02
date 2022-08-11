
//1) Abstraction --> to hide [details will come later] --> abstract class and interfaces

//2) Encapsulation --> no direct data exposure, getters and setters
//3) Inheritance --> code reusablity --> parent-child class --> Computer --> laptop --> gaming laptop
//4) Ploymorphism --> one thing behaving as multiple things


//Encapsulation
//Pojo --> plain old java objects
class Laptop1{

    private String color;
    private String company;
    private int price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    //constructor -- > looks like methods with class used for initialisation
    Laptop1(String color,String company,int price){
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

public class TestOOP1 {
    public static void main(String[] args){
        Laptop1 obj = new Laptop1("Black","Dell",50000);
        obj.getConfig();
        obj.playMusic();
        System.out.println(obj.getCompany());
    }
}
