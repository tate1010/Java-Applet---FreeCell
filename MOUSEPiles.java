import java.awt.*;
import java.util.*;

public class MOUSEPiles extends Piles
{
 protected int lp = -1 ;
    public boolean oneCard ()
    {

	if (P1.size () == 1)
	{
	    return true;
	}
	else
	    return false;
    }


    public Card deal ()
    {

       
   if (hassomecard ())
	{

	    Card C1 = new Card ();
	    C1 = (Card) P1.elementAt (0);
	    P1.remove (0);

	    return C1;

	}
	else
	    return null;
    }


    public boolean hassomecard ()
    {
	if (P1.size () == 0)
	{

	    return false;
	}
	else
	    return true;

    }
    public void LastPile(int a){
    lp = a;
    }
    public int GetLastPile(){
    
    return lp;
    }
}
