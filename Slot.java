import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Slot implements ActionListener, MouseListener, MouseMotionListener
{

    protected int Locationx;
    protected int Locationy;
    private boolean filled = false;
    protected Vector Slot = new Vector (1);
    public void addCard (Card C)
    {
	if (filled == false)
	{
	    Slot.add (C);
	    filled = true;
	}
    }


    public Card deal ()
    {

	if (filled == true)
	{
	    Card C1 = new Card ();
	    C1 = (Card) Slot.elementAt (0);
	    Slot.clear ();
	    filled = false;
	    return C1;
	}

	else
	{
	    return null;
	}
    }




    public boolean isPointInside (int x, int y)
    {

	//    g.fillRect (getCentreX () - getWidth () / 2, getCentreY () - getHeight () / 2, getWidth (), getHeight ());
	if (x > getCentreX () - getWidth () / 2 && x < getCentreX () - getWidth () / 2 + getWidth ())

	    {

		if (y > getCentreY () - getHeight () / 2 && y < getCentreY () - getHeight () / 2 + getHeight ())
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
	if (filled == true)
	{
	    ((Card) Slot.elementAt (0)).setCentre (Locationx, Locationy);
	    ((Card) Slot.elementAt (0)).draw (g);
	}
	else if (filled == false)
	{
	    g.setColor (Color.black);
	    g.drawRect (Locationx - 30, Locationy - 40, 60, 80);
	}

    }


    ////


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
	if(isPointInside)



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


