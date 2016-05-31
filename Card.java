import java.awt.*;
public class Card extends ShapeClass
{


    protected String CardValue = "A";
    protected String suitss = "Spade";
    protected boolean down = false;
    public Card ()
    {

	setHeight (80);
	setWidth (60);

    }


    public String getCardValue ()
    {
	return CardValue;

    }


    public void setCardValue (String value)
    {
	CardValue = value;
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

	   g.setColor (Color.black);
	    g.drawRect (getCentreX () - getWidth () / 2, getCentreY () - getHeight () / 2, getWidth (), getHeight ());
	    if (suitss == "Spade")
	    {

	     

		Spade C3 = new Spade ();
		C3.setCentre (getCentreX (), getCentreY ());

		C3.draw (g);

	    }
	    else if (suitss == "Diamond")
	    {


		Diamond C2 = new Diamond ();
		C2.draw (g);


	    }
	    else if (suitss == "Heart")
	    {
		Heart C1 = new Heart ();
		C1.draw (g);
	    }
	    else if (suitss == "Club")
	    {
		Clubs C4 = new Clubs ();
		C4.draw (g);
	    }
	    g.setColor (Color.black);
	    g.drawString (CardValue, getCentreX () - getWidth () / 2 + 7, getCentreY () - getHeight () / 2 + 12)
	       ; g.drawString (CardValue, getCentreX () + getWidth () / 2 - 12, getCentreY () + getHeight () / 2 - 12)
	       ;
	}

    }





}




