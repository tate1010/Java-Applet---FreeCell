import java.awt.*;
import java.util.*;
public abstract class Deck extends ShapeClass
{


    public Vector Deck = new Vector ();

    public int count ()
    {
	return Deck.capacity ();


    }


    public void addcard (Card C)
    {
	Deck.add (C);
    }


    public void addat (Card C, int pos)
    {
	Deck.add (pos, C);
    }


    public void deleteCard (int num)
    {
	Deck.remove (num);

    }


    public boolean isempty ()
    {

	if (Deck.capacity () == 0)
	{
	    return true;

	}
	else
	{
	    return false;

	}
    }


    public Card deal ()
    {
    
 Card C1 = new Card();
 C1 = (Card) Deck.elementAt (0);
     Deck.remove (0);
     
	return C1;
       

    }


    public void setCentres (int x, int y)
    {

	for (int i = 0 ; i < count () ; i++)
	{

	    ((Card) Deck.elementAt (i)).setCentre (x, y);


	}
    }
public void shuffle(){
for (int i= 0; i<1000; i ++){
Card C2 = new Card();
C2 = deal();
addat(C2,(int) (Math.random () * 52));

}
}


    
    }
