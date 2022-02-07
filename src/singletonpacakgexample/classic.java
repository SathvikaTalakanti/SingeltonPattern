package singletonpacakgexample;
class classicimplementation{
    public static classicimplementation obj;

    private classicimplementation(){

    }
    private double i;
    public void setbalance(double num)
    {
        i=num;
    }
    public void getbalance()
    {
        System.out.println("Account balance is: " +i);
    }

    public static classicimplementation getobject() {
        if(obj == null)
        {
            obj = new classicimplementation();
            System.out.println("user logged in");
        }
        else
        {

            System.out.println("User has already logged in");
        }
        return obj;
    }

}
public class classic {
    public static void main(String[] args) {
        classicimplementation e1 = classicimplementation.getobject();
        e1.setbalance(10000);
        e1.getbalance();
        classicimplementation e2 = classicimplementation.getobject();
    }
}