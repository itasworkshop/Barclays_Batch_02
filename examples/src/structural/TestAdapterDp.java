package structural;

//Adaptor Dp --> convert interface of class into another interface based on client requirement.

interface CreditCard{
    public void giveBankDetails();
    public String getCreditCard();
}

class BankDetails{

    private String name;
    private String accHolderName;
    private long accNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

}

class Customer extends BankDetails implements CreditCard{

    @Override
    public void giveBankDetails() {
        setName("Axis");
        setAccHolderName("Rajesh");
        setAccNo(12345);
    }

    @Override
    public String getCreditCard() {
        return this.getAccHolderName()+ " with account no "+ this.getAccNo()+" with bank "+ this.getName()+ " Credit card is approved!";
    }
}

public class TestAdapterDp {
    public static void main(String[] args){
        Customer obj = new Customer();
        obj.giveBankDetails();
        System.out.println(obj.getCreditCard());
    }
}
