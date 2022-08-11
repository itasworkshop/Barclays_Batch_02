package structural;

//Decorator DP --> attaching additional responsibilities to an object dynamically

interface Item{

    public String prepareItem();
    public double itemPrice();
}

class VegItem implements Item{


    @Override
    public String prepareItem() {
        return "Veg Item";
    }

    @Override
    public double itemPrice() {
        return 10.0;
    }
}

abstract class ItemDecorator implements Item{
    private Item newItem;

    public ItemDecorator(Item newItem){
        this.newItem = newItem;
    }

    @Override
    public String prepareItem() {
        return newItem.prepareItem();
    }

    @Override
    public double itemPrice() {
        return newItem.itemPrice();
    }
}

class NonVegItem extends ItemDecorator{

    public NonVegItem(Item newItem){
        super(newItem);
    }

    public String prepareItem() {
        return super.prepareItem() + " with extra spices.";
    }

    @Override
    public double itemPrice() {
        return super.itemPrice()+ 50.0;
    }
}

class MexicanVegItem extends ItemDecorator{

    public MexicanVegItem(Item newItem){
        super(newItem);
    }

    public String prepareItem() {
        return super.prepareItem() + " with extra cheese.";
    }

    @Override
    public double itemPrice() {
        return super.itemPrice()+ 150.0;
    }
}
public class TestDecoratorDp {

    public static void main(String[] args){
        Item item = new VegItem();
        System.out.println(item.itemPrice());
        System.out.println(item.prepareItem());

        Item item1 = new NonVegItem(item);
        System.out.println(item1.itemPrice());
        System.out.println(item1.prepareItem());

        Item item2 = new MexicanVegItem(item);
        System.out.println(item2.itemPrice());
        System.out.println(item2.prepareItem());
    }
}
