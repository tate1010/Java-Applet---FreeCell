// The "DiamondApplet" class.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DnD extends Applet implements ActionListener, MouseListener, MouseMotionListener
{
   Card d1;

    boolean drawFlag = false;
    boolean OKtoMove = false;







    // Place instance variables here

    public void init ()
    {
	//   setSize (new Dimension (500, 300));
	//    g = getGraphics (); // gets canvas created by browser-
	// replaces new statement


	addMouseListener (this);
	addMouseMotionListener (this);



	//  d1 = new Card ();

	// Place the body of the initialization method here
    } // init method




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

	if (d1.isPointInside (e.getX (), e.getY ()) == true)
	{
	  
	    OKtoMove = true;
	    d1.setCentre (e.getX (), e.getY ());
	    d1.draw (g);
	    repaint ();

	}

    }


    public void mouseReleased (MouseEvent event)
    {
	OKtoMove = false;
     
    }


    public void mouseClicked (MouseEvent event)
    {

    }


    public void mouseDragged (MouseEvent e)
    {


	if (OKtoMove == true)
	{
	   
	    d1.setCentre (e.getX (), e.getY ());
	    d1.draw (g);
	    repaint ();
	}
    }


    public void mouseMoved (MouseEvent e)
    {




    }




} // DiamondApplet class
