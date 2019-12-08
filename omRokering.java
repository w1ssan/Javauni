/* eksamen mai 2018
*program for rokering av tabelverdier
*oppgaven bruker klassemetoder
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class omRokering {

  public static void main(String[] args) {
  	//les in 2 tall 
  	String tallTekst = showInputDialog("Gi tall 1 (min):");
  	int min = parseInt(tallTekst);
  	tallTekst = showInputDialog("Gi tall 2 (max):");
  	int max = parseInt(tallTekst);
  	//sjekk: min < max
  	if (min > max) {
  		int hjelp = max;
  		max = min;
  		min = hjelp;
  	}
  	// lag tallserie min .. max i tabell
  	int[] tall = Tabeller.tallSerie(min, max);
  	
  	//rokering
  	int[] rokert = new int[tall.length];
  	int lengde = tall.length;
  	if ( lengde % 2 == 1){
  		lengde--;
  		rokert[lengde] = tall[lengde];
  	}
  	for (int i = 0; i < lengde; i+=2) {
  		rokert[i] = tall[i+1];
  		rokert[i+1] = tall[i];

  	}
  	String utTxt = "tallserie: " + Tabeller.skriv(tall) +"\n" 
  				 + "rokerte: " + Tabeller.skriv(rokert);
  	showMessageDialog(null, utTxt);
  	}
  }
