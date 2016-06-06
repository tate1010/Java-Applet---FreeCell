import java.awt.*;
public class STDECK extends Deck
{
public STDECK() {
String[] suits;
String[] Value;
suits = new String [] {"Spade","Heart","Clubs","Diamond"};
Value = new String [] {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
for(int s = 0; s < 3; s++){
for(int C = 0; C < 12; C++){
Card C1 = new Card();
C1.setCardSuit(suits[s]);
C1.setCardValue(Value[C]);
addcard(C1);



}
}



}






}
