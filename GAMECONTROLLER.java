import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class GAMECONTROLLER implements Cloneable, ActionListener, MouseListener, MouseMotionListener

{
    STDECK D = new STDECK ();
    Piles P1 = new Piles ();
    Piles P2 = new Piles ();
    Piles P3 = new Piles ();
    Piles P4 = new Piles ();
    Piles P5 = new Piles ();
    Piles P6 = new Piles ();
    Piles P7 = new Piles ();
    Piles P8 = new Piles ();
    MOUSEPiles MOUSE = new MOUSEPiles ();
    Slot S1 = new Slot ();
    Slot S2 = new Slot ();
    Slot S3 = new Slot ();
    Slot S4 = new Slot ();

    public void EXTRACT (Piles iP1, Piles iP2, Piles iP3, Piles iP4, Piles iP5, Piles iP6, Piles iP7, Piles iP8, MOUSEPiles iM1, Slot iS1, Slot iS2, Slot iS3, Slot iS4)
    {
	System.out.println ("ad");
	iP1 = P1;
	iP2 = P2;
	iP3 = P3;
	iP4 = P4;
	iP5 = P5;
	iP6 = P6;
	iP7 = P7;
	iP8 = P8;
	iM1 = MOUSE;
	iS1 = S1;
	iS2 = S2;
	iS3 = S3;
	iS4 = S4;
    }


    public void init ()
    {
	///////////////INIT///////////////
	D.shuffle ();
	P1.setLocation (100, 200);
	P2.setLocation (200, 200);
	P3.setLocation (300, 200);
	P4.setLocation (400, 200);
	P5.setLocation (500, 200);
	P6.setLocation (600, 200);
	P7.setLocation (700, 200);
	P8.setLocation (800, 200);
	///
	S1.setLocation (100, 100);
	S2.setLocation (200, 100);
	S3.setLocation (300, 100);
	S4.setLocation (400, 100);
	///
	for (int b = 1 ; b < 8 ; b++)
	{
	    P1.addCard (D.deal ());

	}


	for (int b = 1 ; b < 8 ; b++)
	{
	    P2.addCard (D.deal ());

	}


	for (int b = 1 ; b < 8 ; b++)
	{
	    P3.addCard (D.deal ());

	}


	for (int b = 1 ; b < 8 ; b++)
	{
	    P4.addCard (D.deal ());

	}


	for (int b = 1 ; b < 7 ; b++)
	{
	    P5.addCard (D.deal ());

	}


	for (int b = 1 ; b < 7 ; b++)
	{
	    P6.addCard (D.deal ());

	}


	for (int b = 1 ; b < 7 ; b++)
	{
	    P7.addCard (D.deal ());

	}


	for (int b = 1 ; b < 7 ; b++)
	{
	    P8.addCard (D.deal ());

	}


    }


    //////
    public void draw (Graphics g)
    {
	P1.draw (g);
	P2.draw (g);
	P3.draw (g);
	P4.draw (g);
	P5.draw (g);
	P6.draw (g);
	P7.draw (g);
	P8.draw (g);
	S1.draw (g);
	S2.draw (g);
	S3.draw (g);
	S4.draw (g);
	MOUSE.draw (g);

    }








    ////////

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

	if (MOUSE.oneCard ())
	{
	    if (S1.AddCheck (e))
	    {
		S1.addCard (MOUSE.deal ());
	    }
	    if (S2.AddCheck (e))
	    {
		S2.addCard (MOUSE.deal ());
	    }
	    if (S3.AddCheck (e))
	    {
		S3.addCard (MOUSE.deal ());
	    }
	    if (S4.AddCheck (e))
	    {
		S4.addCard (MOUSE.deal ());
	    }



	}
	else if (MOUSE.isEmpty ())
	{
	    if (S1.AddCheck (e))
	    {
		MOUSE.addCard (S1.deal (e));

	    }
	    if (S2.AddCheck (e))
	    {
		MOUSE.addCard (S2.deal (e));
	    }
	    if (S3.AddCheck (e))
	    {
		MOUSE.addCard (S3.deal (e));
	    }
	    if (S4.AddCheck (e))
	    {
		MOUSE.addCard (S4.deal (e));
	    }
	    if (P1.PilesCheck (e) != -1)
	    {

		for (int i = P1.PilesCheck (e) ; i < P1.size () ; i++)
		{
		    MOUSE.addCard (P1.releaseCard (i));
		    
		}P1.RemoveCard (P1.PilesCheck (e));
	    }
	    if (P2.PilesCheck (e) != -1)
	    {

		for (int i = P2.PilesCheck (e) ; i < P2.size () ; i++)
		{
		    MOUSE.addCard (P2.releaseCard (i));
		    
		}P2.RemoveCard (P2.PilesCheck (e));
	    }
	    if (P3.PilesCheck (e) != -1)
	    {

		for (int i = P3.PilesCheck (e) ; i < P3.size () ; i++)
		{
		    MOUSE.addCard (P3.releaseCard (i));

		}
			    P3.RemoveCard(P3.PilesCheck(e));
	    }

	    if (P4.PilesCheck (e) != -1)
	    {

		for (int i = P4.PilesCheck (e) ; i < P4.size () ; i++)
		{
		    MOUSE.addCard (P4.releaseCard (i));
		}
		P4.RemoveCard (P4.PilesCheck (e));
	    }
	    if (P5.PilesCheck (e) != -1)
	    {

		for (int i = P5.PilesCheck (e) ; i < P5.size () ; i++)
		{
		    MOUSE.addCard (P5.releaseCard (i));
		}
		P5.RemoveCard (P5.PilesCheck (e));
	    }
	    if (P6.PilesCheck (e) != -1)
	    {

		for (int i = P6.PilesCheck (e) ; i < P6.size () ; i++)
		{
		    MOUSE.addCard (P6.releaseCard (i));
		}
		P6.RemoveCard (P6.PilesCheck (e));
	    }
	    if (P7.PilesCheck (e) != -1)
	    {

		for (int i = P7.PilesCheck (e) ; i < P7.size () ; i++)
		{
		    MOUSE.addCard (P7.releaseCard (i));
		}
		P7.RemoveCard (P7.PilesCheck (e));
	    }
	    if (P8.PilesCheck (e) != -1)
	    {

		for (int i = P8.PilesCheck (e) ; i < P8.size () ; i++)
		{
		    MOUSE.addCard (P8.releaseCard (i));
		}
		P8.RemoveCard (P8.PilesCheck (e));
	    }


	}

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
	MOUSE.setLocation (e.getX (), e.getY ());
    }



}
