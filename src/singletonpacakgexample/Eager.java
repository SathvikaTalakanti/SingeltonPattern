package singletonpacakgexample;
class eagerinstantiation {
    public static eagerinstantiation obj=new eagerinstantiation(); //Eager instantiation

    private eagerinstantiation(){}
    private double i;
    public void setbalance(double num)
    {
        i=num;
    }
    public void getbalance()
    {
        System.out.println("Account balance is: " +i);
    }

    public static eagerinstantiation getobject()
    {

        return obj;
    }
}
public class Eager
{
  public static void main(String[] args)
  {
      eagerinstantiation e1=eagerinstantiation.getobject();
      e1.setbalance(10000);
      e1.getbalance();
      eagerinstantiation e2=eagerinstantiation.getobject();
  }
}
