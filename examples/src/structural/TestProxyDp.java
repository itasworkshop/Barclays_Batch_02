package structural;

//Proxy DP --> placeholder, provides control over accessing original object.

interface OfficeInternet{
    public void grantAccess();
}

class OriginalInternetAccess implements OfficeInternet{

    private String ename;

    public OriginalInternetAccess(String name){
        this.ename = name;
    }

    @Override
    public void grantAccess() {
        System.out.println("Internet access is granted for "+this.ename);
    }
}

class ProxyInternet implements OfficeInternet{

    private String ename;
    private OriginalInternetAccess access;

    ProxyInternet(String name){
        this.ename = name;
    }



    public int getRole(String ename){
        return 9;
    }

    @Override
    public void grantAccess() {
        if(getRole(this.ename)> 5){
            access = new OriginalInternetAccess(ename);
            access.grantAccess();
        }else {
            System.out.println("No internet for you!");
        }
    }
}

public class TestProxyDp {

    public static void main(String[] args){
        OfficeInternet internet = new ProxyInternet("Rajesh");
        internet.grantAccess();
    }
}
