package singletonpacakgexample;
class doublechecked {
    public static doublechecked obj;

    private doublechecked() {

    }

    private double i;

    public void setbalance(double num) {
        i = num;
    }

    public void getbalance() {
        System.out.println("Account balance is: " + i);
    }

    public static doublechecked getobject() {
        if (obj == null) {

            synchronized (doublechecked.class) {

                if (obj == null)
                    obj = new doublechecked();
            }
        }

        else
        {

            System.out.println("User has already logged in");
        }
        return obj;
    }

}
public class doublecheck
{
    public static void main(String[] args)
    {
        doublechecked e1=doublechecked.getobject();
        e1.setbalance(10000);
        e1.getbalance();
        doublechecked e2=doublechecked.getobject();
    }
}
