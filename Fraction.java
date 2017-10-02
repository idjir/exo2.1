
/**
 * Write a description of class Fraction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fraction
{
    // instance variables - replace the example below with your own
    private double num,denum;

    /**
     * Constructor for objects of class Fraction
     */
    public Fraction(double num, double denum)
    {
        // initialise instance variables
        this.num=num;
        this.denum=denum;
    }
    public Fraction()
    {
    this(0,0);
     }

    @Override
    public String toString()
    {
        // put your code here
        return "num:" + Double.valueOf(num).toString() = " "+ "denum:" + Double.valueOf(denum).toString();
    }
}
