package singletonpacakgexample;
class synchronizedinstantiation{
    public static synchronizedinstantiation obj;

    private synchronizedinstantiation(){

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

    public static synchronized synchronizedinstantiation getobject() {
        if(obj == null)
        {
            obj = new synchronizedinstantiation();
            System.out.println("user logged in");
        }
        else
        {

            System.out.println("User has already logged in");
        }
        return obj;
    }

}
public class synchronizd
{
   public static void main(String[] args)
   {
       synchronizedinstantiation e1=synchronizedinstantiation.getobject();
       e1.setbalance(10000);
       e1.getbalance();
       synchronizedinstantiation e2=synchronizedinstantiation.getobject();
   }
}
