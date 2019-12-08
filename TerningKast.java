/* Leksjon 3 oppgave 7
*simulere terningkast og teller antall kast til
*første 6-er
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class TerningKast {

  public static void main(String[] args) {
    //beregning
    int antKast = 0;
    int øyne;
    do { // 0- ikke inkludert 1
    	øyne = 1+(int)(Math.random()*6);
    	antKast++;

    } while(øyne != 6);
    //skriver ut resultat
    String utTxt = "Antall kast til 6-er: " + antKast;
    showMessageDialog(null, utTxt);


/*	talltxt= showInputDialog("gi et siffer(2-9):");
	siffer = parseInt(talltxt);
*/


  }
}