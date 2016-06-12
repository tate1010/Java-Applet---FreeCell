import java.awt.*;
import java.util.*;

public class Piles{
 protected Vector  P1  = new Vector (13);

protected int Locationx;
protected int Locationy;
 
 
public void setLocation(int x,int y){
Locationx = x;
Locationy = y;

}
public void addCard(Card C){
P1.add(C);

}
public Card releaseCard(int index){

 Card C1 = new Card();
  C1 = (Card) P1.elementAt (0);
   
     
	return C1;

}
 
public void draw(Graphics g){
for (int i = 0; i< P1.size(); i++){


 ((Card)P1.elementAt(i)) .setCentre(Locationx ,Locationy+ i*20);
 ((Card)P1.elementAt(i)) .draw(g);

 }
}
}

