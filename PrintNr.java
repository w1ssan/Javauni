/* Leksjon 3-5 : 
*splitter positive heltall i odde og partall
*som skrives på hver sin linje
*leser start og slutt for atuelle tall
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class PrintNr {

  public static void main(String[] args) {
  	boolean fortsett = true;
  	while (fortsett){    

      	//les inn nedre og øvre grense
      	String talltxt= showInputDialog("gi et positivt helltall :");
      	int start = parseInt(talltxt);
      	talltxt= showInputDialog("gi et positivt helltall :");
      	int stopp = parseInt(talltxt);
      	int extra;
      	if (start>stopp){
      		extra = start; start = stopp; stopp = extra;

      	}
      	// bruk if til å gi feilmelding hvis start > stopp
      	// eller bytt verdiene     

      	//"beregning": splitte odde-partall
      		String linje1 = "", linje2 = ""; // oddetall på 1 og partall på 2
      		for (int tall = start; tall <= stopp; tall++){
      			if (tall % 2 == 1)
      				linje1 = linje1 + tall + "  ";
      			else //partall
      				linje2 += tall + "  ";
      		}    
    

      		//skriver ut resultat
      		String utTxt = linje1 + "\n" + linje2;
      		showMessageDialog(null, utTxt);
      		//flere tallsplittinger?
      		int svar = parseInt( showInputDialog("flere forsøkk? [0] Nei, [1] Ja") );
      		fortsett = (svar == 1);
  	}





  }

}