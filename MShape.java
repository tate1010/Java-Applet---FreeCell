import java.awt.*;

public abstract class MShape extends ShapeClass
{

public void SlideTo(int x, int y, Graphics g){
while(x != getCentreX() && y != getCentreY()){
if (x > getCentreX()){
erase(g);
setX(x+1);
draw(g);
}
else if (x < getCentreX()){
erase(g);
setX(x-1);
draw(g);
}
if(y>getCentreY()){
erase(g);
setY(y+1);
draw(g);
}
else if (y<getCentreY()){
erase(g);
setY(y-1);
draw(g);


}




}
delay(1);
}
}
