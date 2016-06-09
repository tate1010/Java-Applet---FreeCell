import java.awt.*;
import java.applet.*;
public class test extends Applet
{
  public void paint (Graphics g)
   {
    /*
       Heart C1 = new Heart();
      C1.draw(g);
      Diamond C2 = new Diamond();
      Spade C3 = new Spade();
      C2.setCentre(300,200);

      C2.draw(g);
      C3.setCentre(500,300);
      C3.draw(g);
      */
      Card S5 = new Card();
      S5.setCardSize("large");
      S5.setCardValue("10");
      S5.setCardSuit("Spade");
     S5.draw(g);
    }

}
