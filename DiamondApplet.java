// The "DiamondApplet" class.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DiamondApplet extends Applet implements ActionListener , MouseListener, MouseMotionListener
{
    Card d1;
    boolean drawFlag = false;
boolean OKtoMove = false;




    Graphics g;   // declares a graphics canvas for drawing
    Button buttonDraw = new Button ("Draw");
    Button buttonErase = new Button ("Erase");
    Label labelAction = new Label ("Action");
    TextField textFieldAction = new TextField (5);
    Checkbox checkboxFilled = new Checkbox ("Filled", true);
    Choice choiceSize = new Choice ();

    // Place instance variables here

    public void init ()
    {
	setSize (new Dimension (500, 300));
	g = getGraphics (); // gets canvas created by browser-
	// replaces new statement

	add (buttonDraw);   // adds button to canvas
	add (buttonErase);
	add (labelAction);
	add (textFieldAction);
	add (checkboxFilled);
	addMouseListener (this);
addMouseMotionListener (this);
	choiceSize.add ("Large");       // H = 100; W = 75
	choiceSize.add ("Medium");      // H = 80;  W = 60
	choiceSize.add ("Small");       // H = 60;  W = 45
	add (choiceSize);
	buttonDraw.addActionListener (this);  // this is the button
	buttonErase.addActionListener (this);

	d1 = new Card ();

	// Place the body of the initialization method here
    } // init method


    public void paint (Graphics g)
    {
	if (drawFlag == true)
	{
	    d1.draw (g);
	}
	else
	{
	    d1.erase (g);
	}

	// Place the body of the drawing method here
    } // paint method


    public void actionPerformed (ActionEvent e)
    {

	Object objSource = e.getSource ();
	if (objSource == buttonDraw)
	{

	    textFieldAction.setText ("Draw");

	    drawFlag = true;
	}
	if (objSource == buttonErase)
	{
	    textFieldAction.setText ("Erase");

	    drawFlag = false;

	}
	 repaint ();
       
    }


    public boolean action (Event e, Object o)
    {

	if (e.target instanceof Checkbox)
	{
	    if (checkboxFilled.getState () == true)
	    {
		System.out.println ("1");
	    }
	    if (checkboxFilled.getState () == false)
	    {
		System.out.println ("2");
	    }
	}
	////
	repaint ();
	return true;
    }

   public void mouseEntered(MouseEvent event) {
    }
    public void mouseExited(MouseEvent event) {
    }
    public void mousePressed(MouseEvent e) {
    
if (d1.isPointInside (e.getX (), e.getY ()) == true)
{
textFieldAction.setText ("Pressed");
OKtoMove = true;
d1.setCentre (e.getX (), e.getY ());
d1.draw (g);
repaint ();

}

    }
    public void mouseReleased(MouseEvent event) {
    OKtoMove = false;
    textFieldAction.setText ("Relase");
    }

    public void mouseClicked(MouseEvent event) {
     
    }
    public void mouseDragged(MouseEvent e){
   

if (OKtoMove == true)
{
textFieldAction.setText ("mouseDragged");
d1.setCentre (e.getX (), e.getY ());
d1.draw (g);
repaint ();
}
}
public void mouseMoved(MouseEvent e){



    
    }




} // DiamondApplet class
