
//Inheritance

class Laptop2{

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
    Laptop2(String color,String company,int price){
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

class GamingLaptop extends Laptop{

    private String graphicCard;

    GamingLaptop(String color,String company,int price, String card){
        super(color,company,price); //parent constructor
        this.graphicCard = card;

    }

    public void playGames(){
        System.out.println("Playing awsome games!!!!!!!!");
    }

}

public class TestOOP2 {
    public static void main(String[] args){
        GamingLaptop obj = new GamingLaptop("Black","Dell",50000, "VDHI2.0");
        obj.getConfig();
        obj.playMusic();
        obj.playGames();
    }
}