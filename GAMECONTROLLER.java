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
    Foundations F1 = new Foundations ();
    Foundations F2 = new Foundations ();
    Foundations F3 = new Foundations ();
    Foundations F4 = new Foundations ();
    boolean noaction = false;


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
	F1.setLocation (500, 100);
	F2.setLocation (600, 100);
	F3.setLocation (700, 100);
	F4.setLocation (800, 100);
	//
	F1.setSuit ("Spade");
	F2.setSuit ("Heart");
	F3.setSuit ("Club");
	F4.setSuit ("Diamond");

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


	for (int b = 1 ; b < 3 ; b++)
	{
	    P8.addCard (D.deal ());

	}


    }


    public boolean WINTEST ()
    {

	if (F1.WINTEST () && F2.WINTEST () && F3.WINTEST () && F4.WINTEST ())
	{
return true;

	}
	else return false;
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

	F1.draw (g);
	F2.draw (g);
	F3.draw (g);
	F4.draw (g);
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

	if (MOUSE.isEmpty ())
	{
	    if (S1.AddCheck (e))
	    {
		MOUSE.LastPile (13);
		MOUSE.addCard (S1.deal (e));

	    }
	    else if (S2.AddCheck (e))
	    {
		MOUSE.LastPile (14);
		MOUSE.addCard (S2.deal (e));
	    }
	    else if (S3.AddCheck (e))
	    {
		MOUSE.LastPile (15);
		MOUSE.addCard (S3.deal (e));
	    }
	    else if (S4.AddCheck (e))
	    {
		MOUSE.LastPile (16);
		MOUSE.addCard (S4.deal (e));
	    }
	    //////
	    if (P1.PilesCheck (e) != -1)
	    {

		MOUSE.LastPile (1);
		for (int i = P1.PilesCheck (e) ; i < P1.size () ; i++)
		{
		    MOUSE.addCard (P1.releaseCard (i));

		}
		P1.RemoveCard (P1.PilesCheck (e));
	    }
	    else if (P2.PilesCheck (e) != -1)
	    {
		MOUSE.LastPile (2);

		for (int i = P2.PilesCheck (e) ; i < P2.size () ; i++)
		{
		    MOUSE.addCard (P2.releaseCard (i));

		}
		P2.RemoveCard (P2.PilesCheck (e));
	    }
	    else if (P3.PilesCheck (e) != -1)
	    {
		MOUSE.LastPile (3);
		for (int i = P3.PilesCheck (e) ; i < P3.size () ; i++)
		{
		    MOUSE.addCard (P3.releaseCard (i));

		}
		P3.RemoveCard (P3.PilesCheck (e));
	    }

	    else if (P4.PilesCheck (e) != -1)
	    {
		MOUSE.LastPile (4);
		for (int i = P4.PilesCheck (e) ; i < P4.size () ; i++)
		{
		    MOUSE.addCard (P4.releaseCard (i));
		}
		P4.RemoveCard (P4.PilesCheck (e));
	    }
	    else if (P5.PilesCheck (e) != -1)
	    {
		MOUSE.LastPile (5);
		for (int i = P5.PilesCheck (e) ; i < P5.size () ; i++)
		{
		    MOUSE.addCard (P5.releaseCard (i));
		}
		P5.RemoveCard (P5.PilesCheck (e));
	    }
	    else if (P6.PilesCheck (e) != -1)
	    {
		MOUSE.LastPile (6);
		for (int i = P6.PilesCheck (e) ; i < P6.size () ; i++)
		{
		    MOUSE.addCard (P6.releaseCard (i));
		}
		P6.RemoveCard (P6.PilesCheck (e));
	    }
	    else if (P7.PilesCheck (e) != -1)
	    {
		MOUSE.LastPile (7);
		for (int i = P7.PilesCheck (e) ; i < P7.size () ; i++)
		{
		    MOUSE.addCard (P7.releaseCard (i));
		}
		P7.RemoveCard (P7.PilesCheck (e));
	    }
	    else if (P8.PilesCheck (e) != -1)
	    {
	    
		MOUSE.LastPile (8);
		for (int i = P8.PilesCheck (e) ; i < P8.size () ; i++)
		{
	 
		    MOUSE.addCard (P8.releaseCard (i));
		}
		P8.RemoveCard (P8.PilesCheck (e));
	    }
	    /////////
	    if (F1.AddCheck (e))
	    {
		MOUSE.LastPile (9);
		MOUSE.addCard (F1.deal ());


	    }
	    if (F2.AddCheck (e))
	    {
		MOUSE.LastPile (10);
		MOUSE.addCard (F2.deal ());


	    }
	    if (F3.AddCheck (e))
	    {
		MOUSE.LastPile (11);
		MOUSE.addCard (F3.deal ());


	    }
	    if (F4.AddCheck (e))
	    {
		MOUSE.LastPile (12);
		MOUSE.addCard (F4.deal ());


	    }


	}


    }


    public void mouseReleased (MouseEvent e)
    {
 
	if (MOUSE.hassomecard ())
	{
	
	    int num = MOUSE.size ();
	    //
	    if (P1.PilesCheck (e) > P1.size () - 2 && P1.addCheck (MOUSE.releaseCard (0)))

		{


		    for (int i = 0 ; i < num ; i++)
		    {

			P1.addCard (MOUSE.deal ());
		    }
		}
	    //
	    else if (P2.PilesCheck (e) > P2.size () - 2 && P2.addCheck (MOUSE.releaseCard (0)))

		{


		    for (int i = 0 ; i < num ; i++)
		    {

			P2.addCard (MOUSE.deal ());
		    }
		}
	    else if (P3.PilesCheck (e) > P3.size () - 2 && P3.addCheck (MOUSE.releaseCard (0)))

		{


		    for (int i = 0 ; i < num ; i++)
		    {

			P3.addCard (MOUSE.deal ());
		    }
		}

	    else if (P4.PilesCheck (e) > P4.size () - 2 && P4.addCheck (MOUSE.releaseCard (0)))

		{


		    for (int i = 0 ; i < num ; i++)
		    {

			P4.addCard (MOUSE.deal ());
		    }
		}
	    else if (P5.PilesCheck (e) > P5.size () - 2 && P5.addCheck (MOUSE.releaseCard (0)))

		{


		    for (int i = 0 ; i < num ; i++)
		    {

			P5.addCard (MOUSE.deal ());
		    }
		}
	    else if (P6.PilesCheck (e) > P6.size () - 2 && P6.addCheck (MOUSE.releaseCard (0)))

		{


		    for (int i = 0 ; i < num ; i++)
		    {

			P6.addCard (MOUSE.deal ());
		    }
		}
	    else if (P7.PilesCheck (e) > P7.size () - 2 && P7.addCheck (MOUSE.releaseCard (0)))

		{


		    for (int i = 0 ; i < num ; i++)
		    {

			P7.addCard (MOUSE.deal ());
		    }
		}
	    else if (P8.PilesCheck (e) > P8.size () - 2 && P8.addCheck (MOUSE.releaseCard (0)))

		{


		    for (int i = 0 ; i < num ; i++)
		    {

			P8.addCard (MOUSE.deal ());
		    }
		}
	    else
		noaction = true;

	}

	if (MOUSE.oneCard ())
	{
      
    
	
	    if (S1.AddCheck (e) && !S1.isFilled ())
	    {
		S1.addCard (MOUSE.deal ());
	    }
	    else if (S2.AddCheck (e) && !S2.isFilled ())
	    {
		S2.addCard (MOUSE.deal ());
	    }
	    else if (S3.AddCheck (e) && !S3.isFilled ())
	    {
	    
		S3.addCard (MOUSE.deal ());
	    }
	    else if (S4.AddCheck (e) && !S4.isFilled ())
	    {
		S4.addCard (MOUSE.deal ());
	    }
	    else if (F1.AddCheck (e) && F1.NextCard (MOUSE.releaseCard (0)))
	    {
		F1.addCard (MOUSE.deal ());
	    }
	    else if (F2.AddCheck (e) && F2.NextCard (MOUSE.releaseCard (0)))
	    {
		F2.addCard (MOUSE.deal ());
	    }
	    else if (F3.AddCheck (e) && F3.NextCard (MOUSE.releaseCard (0)))
	    {
		F3.addCard (MOUSE.deal ());
	    }
	    else if (F4.AddCheck (e) && F4.NextCard (MOUSE.releaseCard (0)))
	    {
		F4.addCard (MOUSE.deal ());
	    }
	    else
		noaction = true;


	}
	if (noaction == true)
	{
	    int num = MOUSE.size ();
	    for (int i = 0 ; i < num ; i++)
	    {
		if (MOUSE.GetLastPile () == 1)
		{


		    P1.addCard (MOUSE.deal ());

		}



		else if (MOUSE.GetLastPile () == 2)
		{

		    P2.addCard (MOUSE.deal ());

		}
		else if (MOUSE.GetLastPile () == 3)
		{

		    P3.addCard (MOUSE.deal ());

		}
		else if (MOUSE.GetLastPile () == 4)
		{

		    P4.addCard (MOUSE.deal ());

		}
		else if (MOUSE.GetLastPile () == 5)
		{

		    P5.addCard (MOUSE.deal ());

		}
		else if (MOUSE.GetLastPile () == 6)
		{

		    P6.addCard (MOUSE.deal ());

		}
		else if (MOUSE.GetLastPile () == 7)
		{

		    P8.addCard (MOUSE.deal ());

		}
		else if (MOUSE.GetLastPile () == 8)
		{

		    P8.addCard (MOUSE.deal ());

		}
		else if (MOUSE.GetLastPile () == 9)
		{

		    F1.addCard (MOUSE.deal ());

		}
		else if (MOUSE.GetLastPile () == 10)
		{

		    F2.addCard (MOUSE.deal ());

		}
		else if (MOUSE.GetLastPile () == 11)
		{

		    F3.addCard (MOUSE.deal ());

		}
		else if (MOUSE.GetLastPile () == 12)
		{

		    F4.addCard (MOUSE.deal ());

		}
		else if (MOUSE.GetLastPile () == 13)
		{

		    S1.addCard (MOUSE.deal ());

		}
		else if (MOUSE.GetLastPile () == 14)
		{

		    S2.addCard (MOUSE.deal ());

		}
		else if (MOUSE.GetLastPile () == 15)
		{

		    S3.addCard (MOUSE.deal ());

		}
		else if (MOUSE.GetLastPile () == 16)
		{

		    S4.addCard (MOUSE.deal ());

		}
		noaction = false;
	    }

	}
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
