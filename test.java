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
      S5.setCardValue("5");
      S5.setCardSuit("Diamond");
     S5.draw(g);
    }

}
