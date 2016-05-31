import java.awt.*;

public abstract class suits extends MShape
{
    String suitss = "Spade";
    public void setHeight (int height)  //overrid height
    {
	super.setHeight (height);
	super.setWidth ((int) height * 4 / 5);

    }


    public void setWidth (int Width)  //overridden wiedth
    {

	super.setHeight ((int) Width * 4 / 5);
	super.setWidth (Width);
    }
    
    public void setSuit(String suita){
    if(suita == "Spade"){
     suitss = "Spade";
    }
    else if (suita == "Diamond"){
     suitss = "Diamond";
    }
     else if (suita == "Heart"){
      suitss = "Heart";
    }
    else if (suita == "Club"){
     suitss = "Club";
    }
    else
    {
    }
    }
    
    public String getSuit() {
    return suitss;
    
    
    }
    
    
    }

