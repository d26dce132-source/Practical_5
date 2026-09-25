/*Create class CinemaShow with private String title, private int seatsAvailable, private
final int capacity, and private static int totalBooked=0.
Constructor(title, capacity): set both and seatsAvailable = capacity.
Constructor(title): chain with this(title, 100).
book(int n): if n ≤ seatsAvailable, reduce seatsAvailable by n, add n to totalBooked,
return true; else return false unchanged.*/

class CinemaShow {

    private String title;
    private int seatsAvailable;
    private final int capacity=30;
    private static int totalBooked = 0;

    CinemaShow(String title,int capacity)
    {
        this.title=title;
        this.seatsAvailable=capacity;
    }
    CinemaShow(String title)
    {
        this(title,100);
    }
    public boolean book(int n)
    {
        if(n<=seatsAvailable)
        {
            seatsAvailable-=n;
            totalBooked+=n;
            return true;
        }
        else
        {
            return false;
        }
    }
    //(d) cancel(int n): increase seatsAvailable by n but never above capacity.
    public int cancel(int n)
    {
        if(n + seatsAvailable < capacity)
        {
            seatsAvailable++;
            return 1;
        }
        return 0;

    }
    //(e) Add getSeatsAvailable() and static getTotalBooked().
    public int getSeatsAvailable()
        {
            return seatsAvailable;
        }
    public static int getTotalBooked()
    {
        return totalBooked;
    }
    
    }

public class Main1
{
    public static void main(String[] args)
    {
        CinemaShow c1=new CinemaShow("Hello",30);
        CinemaShow c2=new CinemaShow("abc");

        

    }
}



