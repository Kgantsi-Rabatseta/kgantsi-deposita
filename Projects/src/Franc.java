/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2014/01/06
 * Time: 4:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class Franc {
    int amount;
    public Franc(int Amount)
    {
        this.amount=Amount;
    }

    public Franc times(int multiple)
    {
        return new Franc(amount*multiple);
    }

    public boolean equals(Object object)
    {
        Franc franc = (Franc) object;
        return amount==franc.amount;
    }


}
