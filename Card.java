import java.awt.*;
import java.awt.event.*;
public class Card extends ShapeClass implements ActionListener, MouseListener, MouseMotionListener
{

    protected boolean OKtoMove = false;
    protected int CardValue = 1;
    String[] Value = new String [] {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    protected String suitss = "Spade";
    protected boolean down = false;
    public Card ()
    {

	setHeight (80);
	setWidth (60);

    }


    public int getCardValue ()
    {
	return CardValue;

    }


    public void setCardValue (int value)
    {
	CardValue = value;
    }

    public void setCardValue (String value)
    {
    for (int i = 1; i < 14; i++){
    if(value == Value[i-1   ]){
    CardValue = i;
    }
    
    }
    }
    public void setCardSize (String value)
    {
	if (value == "Small")
	{
	    setHeight (60);

	}
	if (value == "Medium")
	{
	    setHeight (80);
	}
	if (value == "Large")
	{
	    setHeight (100);
	}
	if (value == "Extra Large")
	{
	    setHeight (120);

	}
    }


    public void setCardSuit (String suit)
    {
	if (suit == "Spade")
	{
	    suitss = "Spade";

	}
	if (suit == "Diamond")
	{
	    suitss = "Diamond";
	}
	if (suit == "Heart")
	{
	    suitss = "Heart";

	}
	if (suit == "Club")
	{
	    suitss = "Club";


	}



    }


    public void draw (Graphics g)
    {

	if (down == true)
	{
	    g.setColor (Color.black);

	    g.fillRect (getCentreX () - getWidth () / 2, getCentreY () - getHeight () / 2, getWidth (), getHeight ());
	}
	else if (down == false)
	{
	    g.setColor (Color.white);
	    g.fillRect (getCentreX () - getWidth () / 2, getCentreY () - getHeight () / 2, getWidth (), getHeight ());
	    g.setColor (Color.black);
	    g.drawRect (getCentreX () - getWidth () / 2, getCentreY () - getHeight () / 2, getWidth (), getHeight ());

	    if (suitss == "Spade")
	    {



		Spade C3 = new Spade ();
		C3.setCentre (getCentreX () + getWidth () / 2 -7 , getCentreY () - getHeight () / 2 + 12);

		C3.draw (g);
		C3.setCentre(getCentreX () - getWidth () / 2 + 14, getCentreY () + getHeight () / 2 - 12);
		C3.draw(g);
		C3.setCentre(getCentreX(),getCentreY());
		C3.draw(g);

	    }
	    else if (suitss == "Diamond")
	    {


		Diamond C2 = new Diamond ();
		C2.setCentre (getCentreX () + getWidth () / 2 -7 , getCentreY () - getHeight () / 2 + 12);

		C2.draw (g);
		C2.setCentre(getCentreX () - getWidth () / 2 + 14, getCentreY () + getHeight () / 2 - 12);
		C2.draw(g);
		C2.setCentre(getCentreX(),getCentreY());
		C2.draw(g);


	    }
	    else if (suitss == "Heart")
	    {
		Heart C1 = new Heart ();
	       C1.setCentre (getCentreX () + getWidth () / 2 -7 , getCentreY () - getHeight () / 2 + 12);

		C1.draw (g);
		C1.setCentre(getCentreX () - getWidth () / 2 + 14, getCentreY () + getHeight () / 2 - 12);
		C1.draw(g);
		C1.setCentre(getCentreX(),getCentreY());
		C1.draw(g);
	    }
	    else if (suitss == "Club")
	    {
		Clubs C4 = new Clubs ();
		C4.setCentre (getCentreX () + getWidth () / 2 -7 , getCentreY () - getHeight () / 2 + 12);

		C4.draw (g);
		C4.setCentre(getCentreX () - getWidth () / 2 + 14, getCentreY () + getHeight () / 2 - 12);
		C4.draw(g);
		C4.setCentre(getCentreX(),getCentreY());
		C4.draw(g);
	    }

	    g.drawString (Value[CardValue-1], getCentreX () - getWidth () / 2 + 7, getCentreY () - getHeight () / 2 + 12)
		;
	    g.drawString (Value[CardValue-1], getCentreX () + getWidth () / 2 - 14, getCentreY () + getHeight () / 2 - 12)
		;
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




    //////
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

	if (isPointInside (e.getX (), e.getY ()) == true)
	    System.out.println ("a");
	{

	    OKtoMove = true;
	    setCentre (e.getX (), e.getY ());



	}

    }


    public void mouseReleased (MouseEvent event)
    {
	OKtoMove = false;

    }


    public void mouseClicked (MouseEvent event)
    {
	System.out.println ("A");
    }


    public void mouseDragged (MouseEvent e)
    {


	if (OKtoMove == true)
	{

	    setCentre (e.getX (), e.getY ());

	}
    }


    public void mouseMoved (MouseEvent e)
    {




    }
}




