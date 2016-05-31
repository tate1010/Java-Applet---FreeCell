import java.awt.*;
import java.lang.Math;
public class Heart extends suits
{
public  Heart(){
setColor(Color.red);

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
  int iPointsX[] = new int [5];
	int iPointsY[] = new int [5];

	iPointsX [0] = iCentreX - iWidth / 2;
	iPointsY [0] = iCentreY;
	iPointsX [1] = iCentreX + iWidth / 2;
	iPointsY [1] = iCentreY;
	iPointsX [2] = iCentreX;
	iPointsY [2] = iCentreY + iHeight / 2;
	iPointsX [3] = iCentreX - iWidth / 2;
	iPointsY [3] = iCentreY - iHeight / 4;
	iPointsX [4] = iCentreX;
	iPointsY [4] = iCentreY - iHeight / 4;

	g.setColor (getColor());

	g.fillArc (iPointsX [3], iPointsY [3], iWidth / 2, iHeight / 2, 0, 180);
	g.fillArc (iPointsX [4], iPointsY [4], iWidth / 2, iHeight / 2, 0, 180);
	g.fillPolygon (iPointsX, iPointsY, 3);
	

    }
    }

