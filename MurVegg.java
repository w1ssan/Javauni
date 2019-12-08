/* Leksjon3 :eksamenoppgave oppgave 13
*leser inn høyde på murvegg, og setter denne opp 
*bruker forband, dvs. starter eller slutter en 
*rad med en halv stein
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class MurVegg extends EasyGraphics {

  public static void main(String[] args) {
    launch(args);
  }

  public void run() {
  	//eksamensvaret starter her!
  	final int STR_X = 400;
    final int STR_Y = 300;
    makeWindow("Murvegg", STR_X, STR_Y);
    //les in murhøyde
    int høyde = parseInt(getText("Gi høyde (1-4)"));
    //Steindimensjon
    int antSteinPrRad = 10;
    int b = (int)Math.round(STR_X/(antSteinPrRad+0.5));//b er bredde på stein
    int h = b/2;//h er høyde på stein
    
    //legge stein
    //legger en inledende halvstein evt.
    setSpeed(9);
    for (int radnr= 1; radnr <= høyde; radnr++){
      int y = STR_Y - radnr*h;
      int m = 0;
      if (radnr%2 == 0){ //2-4-6-8
        setColor(255,0,0);
        int id1 = fillRectangle(0, -h, b/2, h);
        moveRectangle(id1, 0, y);
        setColor(0,0,0);
        int id = drawRectangle(0, -h, b/2, h);
        moveRectangle(id, 0, y);
        m = b/2;
       }
      for (int steinNr = 0; steinNr < antSteinPrRad; steinNr++){
        setColor(255,0,0);
        int id2 = fillRectangle(0, -h, b, h);
        setColor(0,0,0);
        int id = drawRectangle(0, -h, b, h);
        moveRectangle(id, m+steinNr*b, y);
        moveRectangle(id2, m+steinNr*b, y);
        pause(500);
        
      } 

      //legge den avsluttende halve stein
      if (radnr % 2 == 1){ //2-4-6-8
        int id = drawRectangle(STR_X - b/2, y, b/2, h);
        int id2 =fillRectangle(STR_X - b/2, y, b/2, h);
        
      }
                  //alt : x = antSteinPrRad*2
    }
    
    //eksamensvaret slutter her!
  }

}