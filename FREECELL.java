import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import java.applet.*;
public class FREECELL extends Applet implements ActionListener, MouseListener, MouseMotionListener
{
    Graphics g;
    BufferedImage buffer = null;
    STDECK D = new STDECK ();
    Piles P1 = new Piles ();
    Piles P2 = new Piles ();
    Piles P3 = new Piles ();
    Piles P4 = new Piles ();
    Piles P5 = new Piles ();
    Piles P6 = new Piles ();
    Piles P7 = new Piles ();
    Piles P8 = new Piles ();
    Slot S1 = new Slot ();
    Slot S2 = new Slot ();
    Slot S3 = new Slot ();
    Slot S4 = new Slot ();

    class RepaintTask extends TimerTask
    {
	public void run ()
	{
	    bufferPaint ();
	}
    }


    public void init ()
    {
	addMouseListener (this);
	addMouseMotionListener (this);
	g = getGraphics ();
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
	for (int b = 1 ; b < 6 ; b++)
	{
	    P8.addCard (D.deal ());

	}
	S1.addCard (D.deal ());




    }


    public void update ()
    {
	try
	{
	    Thread.sleep (17);
	}
	catch (InterruptedException ex)
	{
	    Thread.currentThread ().interrupt ();
	}

	repaint ();

    }



    public void bufferPaint ()
    {
	buffer = new BufferedImage (getWidth (), getHeight (), BufferedImage.TYPE_INT_ARGB);
	Graphics tempG = buffer.getGraphics ();
	ImageIcon i = new ImageIcon ("poker-table-background.jpg");
	tempG.drawImage (i.getImage (), 0, 0, this);
	P1.draw (tempG);
	P2.draw (tempG);
	P3.draw (tempG);
	P4.draw (tempG);
	P5.draw (tempG);
	P6.draw (tempG);
	P7.draw (tempG);
	P8.draw (tempG);
	S1.draw (tempG);
	S2.draw (tempG);
	S3.draw (tempG);
	S4.draw (tempG);
	repaint ();



    }


    public void paint (Graphics g)
    {
	if (buffer == null)
	{
	    Timer timer = new Timer (true);
	    timer.schedule (new RepaintTask (), 0, 1000 / 30);
	    return;
	}
	g.drawImage (buffer, 0, 0, this);
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


    ////////


}
