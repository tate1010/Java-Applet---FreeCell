import java.awt.*;
import javax.swing.ImageIcon;
import java.applet.*;
public class FREECELL extends Applet
{
  public void paint (Graphics g)
   {
    ImageIcon i = new ImageIcon("poker-table-background.jpg");
      g.drawImage(i.getImage(), 0, 0, this);
  STDECK D = new STDECK();
  
  D.deal().draw(g);
  
     
      
     
    }

}
