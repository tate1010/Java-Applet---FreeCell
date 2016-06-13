import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Piles implements ActionListener, MouseListener, MouseMotionListener
{
    protected Vector P1 = new Vector (13);

    protected int Locationx;
    protected int Locationy;
    //
    public boolean isCardInside (int x, int y, int i)
    {

	//    g.fillRect (getCentreX () - getWidth () / 2, getCentreY () - getHeight () / 2, getWidth (), getHeight ());
	if (x > Locationx - 30 && x < Locationx + 30)

	    {

		if (y > Locationy +20*(i-2) && y < Locationy +20*(i-1))
		{
		    ;
		    return true;
		}
		else
		{
		    return false;
		}
	    }
	else
	{
	    return false;
	}
    }


    //

    public void setLocation (int x, int y)
    {
	Locationx = x;
	Locationy = y;

    }


    public void addCard (Card C)
    {
	if (P1.size () <= 13)
	{

	    P1.add (C);
	}
    }


    public int PilesCheck (MouseEvent e)
    {


	for (int i = 0 ; i < P1.size ()+3 ; i++)
	{
	    if (isCardInside (e.getX (), e.getY (), i))
	    {
		if (i > P1.size()){
		i = P1.size()-1;
		
		}
		return i;
	     
 
	    }




	}
	return -1;
    }


    public Card releaseCard (int index)
    {

	if (index < P1.size ())
	{
	    Card C1 = new Card ();
	    C1 = (Card) P1.elementAt (index);

	    return C1;
	}
	return null;
    }
    public void RemoveCard(int index){
    
	   for (int i = index; i < P1.size(); i++){
	   P1.remove(index);
	   
	   }
	    
    
    }

    public void draw (Graphics g)
    {
	for (int i = 0 ; i < P1.size () ; i++)
	{


	    ((Card) P1.elementAt (i)).setCentre (Locationx, Locationy + i * 20);
	    ((Card) P1.elementAt (i)).draw (g);

	}
    }


    public boolean isEmpty ()
    {
	if (P1.size () == 0)
	{
	    return true;
	}
	else
	    return false;
    }

    public int size(){
    return P1.size();
    
    }
    ///

    public void actionPerformed (ActionEvent e)
    {
    }


    public void mouseEntered (MouseEvent event)
    {
    }


    public void mouseExited (MouseEvent event)
    {
    }


    public void mousePressed (MouseEvent e)
    {




    }


    public void mouseReleased (MouseEvent event)
    {

    }


    public void mouseClicked (MouseEvent event)
    {



    }


    public void mouseDragged (MouseEvent e)
    {



    }


    public void mouseMoved (MouseEvent e)
    {

    }


    ///

}




