import java.awt.*;
import java.util.*;

public class MOUSEPiles extends Piles
{

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

	if (oneCard ())
	{


	    Card C1 = new Card ();
	    C1 = (Card) P1.elementAt (0);
	    P1.remove (0);

	    return C1;


	}
	else
	    return null;
    }
}
