/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2014/01/05
 * Time: 11:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dollar{

   private int amount;
    public Dollar(int Amount)
    {
        this.amount = Amount;

    }

    public Dollar times(int multiple)
    {
        return new Dollar(amount*multiple);
    }

    public boolean equals(Object object)
    {
        Dollar dollar = (Dollar) object;
        return amount==dollar.amount;
    }



}
