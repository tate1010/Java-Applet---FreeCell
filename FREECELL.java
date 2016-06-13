import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import java.applet.*;
public class FREECELL extends Applet implements ActionListener, MouseListener, MouseMotionListener
{
    GAMECONTROLLER GAME = new GAMECONTROLLER ();
    Graphics g;
    BufferedImage buffer = null;
    Graphics bufferGraphics;


    class RepaintTask extends TimerTask
    {
	public void run ()
	{
	    repaint ();
	}
    }


    public void init ()
    {
	GAME.init ();
	addMouseListener (this);
	addMouseMotionListener (this);
	g = getGraphics ();




    }


    public void update (Graphics g)
    {

	bufferPaint ();
	g.drawImage (buffer, 0, 0, this);
    }



    public void bufferPaint ()
    {
	ImageIcon i = new ImageIcon ("poker-table-background.jpg");
	bufferGraphics.drawImage (i.getImage (), 0, 0, this);


	GAME.draw (bufferGraphics);

    }


    public void paint (Graphics g)
    {
	if (buffer == null)
	{
	    buffer = new BufferedImage (getWidth (), getHeight (), BufferedImage.TYPE_INT_ARGB);
	    bufferGraphics = buffer.getGraphics ();
	    Timer timer = new Timer (true);
	    timer.schedule (new RepaintTask (), 0, 1000 / 60);
	    return;
	}
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
GAME.mousePressed(e);
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
	GAME.mouseMoved (e);
    }


    ////////


}
