/* eksamen mai 2018: oppgave 4
*program for orm-spill trekker forflytning tilfeldir, 
*og teller antall steg til veggtreff
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class ormSpill extends EasyGraphics {

  public static void main(String[] args) {
    launch(args);
  }

  public void run() {
  	//eksamensvaret starter her!
  	makeWindow("Orm-spillet", 400, 400);
  	int teller = 0;
  	setFont("Arial", 24);
  	//markerer startpkt
  	fillCircle(0,0,5);
  	int x1 = 0, y1 = 0;
  	boolean truffetVeggen = false;
  	while ( !truffetVeggen){
  		int retning = trekkTall(0,1);
  		int x2 = x1;
  		int y2 = y1;
  		if (retning == 0){
  			x2 += 25;
  		}
  		else { //retning == 1
  			y2 += 25;
  		}
  		truffetVeggen = (y2 >= 400 || x2 >= 400);
  		drawLine(x1,y1,x2,y2);
  		teller +=1;
  		pause(100);
  		if (!truffetVeggen) {
  			fillCircle(x2,y2,5);
  		}
  		x1 = x2;
  		y1 = y2;
  		}
  		if ( y1 > x1) {
  			drawString("Ormlengde: "+ teller,210, 20);
  		}
  		else{
  			drawString("Ormlengde: "+ teller,10, 390);
  		}
  	

    //eksamensvaret slutter her!
  
  	//hjelpemetoder
  	
}
private static int trekkTall(int min, int max) {
		return min + (int)(Math.random()*(max-min+1) );
	}
}