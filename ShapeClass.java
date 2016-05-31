
import java.awt.*;

public abstract class ShapeClass
{
    //static Console c;
    private int iCentreX = 100;
    private int iCentreY = 100;
    private int iWidth = 100;
    private int iHeight = 100;
    private Color iColor = Color.black;
public void setColor (Color c){
iColor = c;


}
public Color getColor(){
return iColor;

}
    public void setX (int x)
    {
	iCentreX = x;

    }


    public void setY (int y)
    {
	iCentreY = y;
    }
    public void setCentre(int x , int y){
    
    
    iCentreX = x;
    iCentreY = y;
    }


    public void setWidth (int width)
    {
	iWidth = width;
    }


    public void setHeight (int height)
    {
	iHeight = height;

    }


    public int getCentreX ()
    {

	return iCentreX;

    }


    public int getCentreY ()
    {

	return iCentreY;

    }


    public int getWidth ()
    {

	return iWidth;
    }


    public int getHeight ()
    {

	return iHeight;
    }



    public abstract void draw (Graphics g);



    public void delay (int iDelayTime)
    {
	long lFinalTime = System.currentTimeMillis () + iDelayTime;
	do
	{
	}

	while (lFinalTime >= System.currentTimeMillis ());
    }


    public void erase (Graphics g)
    {   
    Color temp ;
    temp = iColor;
	iColor = Color.white;
	draw (g);
    iColor = temp;
	}
}
