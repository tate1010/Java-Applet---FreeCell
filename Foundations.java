import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Foundations implements ActionListener, MouseListener, MouseMotionListener
{

    protected int Locationx;
    protected int Locationy;
    protected int value = 1;
    protected String suitss;
    protected Vector base = new Vector (13);
    public void clear(){
    base.clear();
    value = 1;
    }
    public void addCard (Card C)
    {


	base.add (C);
	value += 1;

    }


    public boolean WINTEST ()
    {
	if (value == 14)
	{
	    return true;
	}
	else
	    return false;
    }


    public void setSuit (String string)
    {
	suitss = string;


    }


    public boolean AddCheck (MouseEvent e)
    {

	if (isPointInside (e.getX (), e.getY ()))
	{
	    return true;

	}
	else
	    return false;
    }


    public boolean isPointInside (int x, int y)
    {

	//    g.fillRect (getCentreX () - getWidth () / 2, getCentreY () - getHeight () / 2, getWidth (), getHeight ());
	if (x > Locationx - 30 && x < Locationx + 30)

	    {

		if (y > Locationy - 40 && y < Locationy + 40)
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


    public void setLocation (int x, int y)
    {
	Locationx = x;
	Locationy = y;

    }


    public void draw (Graphics g)
    {
	if (value != 1)
	{
	    ((Card) base.lastElement ()).setCentre (Locationx, Locationy);
	    ((Card) base.lastElement ()).draw (g);
	}
	else if (value == 1)
	{
	    g.setColor (Color.black);
	    g.drawRect (Locationx - 30, Locationy - 40, 60, 80);
	    //
	    if (suitss == "Spade")
	    {



		Spade C3 = new Spade ();

		C3.setCentre (Locationx, Locationy);
		C3.draw (g);

	    }
	    else if (suitss == "Diamond")
	    {


		Diamond C2 = new Diamond ();

		C2.setCentre (Locationx, Locationy);
		C2.draw (g);


	    }
	    else if (suitss == "Heart")
	    {
		Heart C1 = new Heart ();

		C1.setCentre (Locationx, Locationy);
		C1.draw (g);
	    }
	    else if (suitss == "Club")
	    {
		Clubs C4 = new Clubs ();

		C4.setCentre (Locationx, Locationy);
		C4.draw (g);
	    }

	    //
	}

    }


    ////

    public boolean NextCard (Card C)
    {
	if (C.getCardSuit () == suitss && C.getCardValue () == value)
	{

	    return true;
	}
	else
	    return false;
    }


    public Card deal ()
    {


	Card C1 = new Card ();
	C1 = (Card) base.lastElement ();
	base.remove (base.size () - 1);
	value--;
	return C1;



    }





    //////////


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
}


