class Thermost{

    private String location;
    private int temperature;
    private static final int MIN=16;
    private static final int MAX=30;
    private static int activeCount = 0;

    public Thermost(String location, int startTemp)
    {
        this.location = location;
        if(startTemp>=MIN && startTemp<=MAX)
        {
            this.temperature=startTemp;
        }
        else
        {
            this.temperature=22;
        }
        activeCount++;
    }
    public Thermost(String location)
    {
        this(location,22);
    }
    public void raise()
    {
        if(temperature<MAX)
        {
            temperature++;
        }
        else
        {
              System.out.println("Already at maximum (30)");
        }
    }
    public void lower()
    {
        if(temperature>MIN)
        {
            temperature--;
        }
        else
        {
              System.out.println("Already at minimum (16)");
        }
    }
    public int getTemperature()
    {
        return temperature;
    }
    public  static int getActiveCount()
    {
        return activeCount;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Thermost t1=new Thermost("Living ROOM",25);
        Thermost t2=new Thermost("Bedroom");

        for(int i=0;i<=10;i++)
        {
            t1.raise();
            System.out.println(t1.getTemperature());
        }
         System.out.println("Decresing Temp :-");
        for(int i=1;i<=20;i++)
        {
            t1.lower();
            System.out.println(t1.getTemperature());
        }
       System.out.println(Thermost.getActiveCount());
    }
}