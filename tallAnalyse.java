/* leksjon 5- tabeller oppgave1
* tabelltrening. beregner gjennomsnitt av et 
* datasett (heltall) og finner tall som er 
* minder en snittet
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class tallAnalyse {

  public static void main(String[] args) {
// initierer en tabell
  	int[] tall = {10, 1, 10, 3, 9, 8, 10, 6, 2, 1};

// beregner snittet
	int sum = 0;
	for (int i = 0; i<tall.length; i++)
		sum+= tall[i];
	int snittet = sum / (tall.length); 

// 
	String utTxt = "gjennomsnitt av " + tall.length + " tall: " + snittet + "\n"
				+ "Under Snittet: ";
	

	for (int i = 0; i<tall.length; i++)
		if (tall[i] < snittet)
			utTxt += tall[i] + " ";
	showMessageDialog(null, utTxt);
// skriver ut resultatet
	

// 

/*	talltxt= showInputDialog("gi et siffer(2-9):");
	siffer = parseInt(talltxt);
*/


  }
}