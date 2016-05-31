import java.awt.*;
import java.lang.Math;
public class Diamond extends suits
{

public  Diamond(){
setColor(Color.red);
setWidth(10);
setHeight(12);

}


    public void draw (Graphics g)
    {
    
    /*
	g.fillOval (getCentreX ()-getWidth()/4 , getCentreY () + getHeight()/8, getWidth()/4, getWidth () / 4);
	g.fillOval (getCentreX () + getWidth ()/4, getCentreY () + getHeight () / 8, getWidth () /4 , getHeight () / 4);
      g.fillOval (getCentreX (), getCentreY () - getHeight () / 4, getWidth () / 4, getHeight () / 4);
       g.fillRect (getCentreX ()-getWidth()/8, getCentreY (), (int)(getWidth()/2), (int)(getHeight()/1.5)) ;
*/

      

 int iCentreX = getCentreX ();
 int iCentreY = getCentreY ();
 int iWidth = getWidth();
 int iHeight = getHeight();
	// declare two arrays for X & Y coordinates of Diamond
	int iPointsX[] = new int [4];
	int iPointsY[] = new int [4];

	// calculate points on diamond & store in the arrays
	iPointsX [0] = iCentreX - iWidth / 2;
	iPointsY [0] = iCentreY;
	iPointsX [1] = iCentreX;
	iPointsY [1] = iCentreY - iHeight / 2;
	iPointsX [2] = iCentreX + iWidth / 2;
	iPointsY [2] = iCentreY;
	iPointsX [3] = iCentreX;
	iPointsY [3] = iCentreY + iHeight / 2;

	// draw the diamond using methods available from the Console object (c)
	g.setColor (getColor());
      
	    g.fillPolygon (iPointsX, iPointsY, 4);
      
	    g.drawPolygon (iPointsX, iPointsY, 4);
	

    }
    }

