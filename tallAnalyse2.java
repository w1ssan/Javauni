/* leksjon 5- tabeller oppgave1
* tabelltrening. beregner gjennomsnitt av et 
* datasett (heltall) og finner tall som er 
* minder en snittet
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class tallAnalyse2 {

  public static void main(String[] args) {

// les inn antall tall til tabelen
  	String talltxt = showInputDialog("gi antall tall:");
  	int antall = parseInt(talltxt);
// initierer en tabell
  	int[] tall = new int [antall];
// trekker tilfeldige tall til tabelen (1-10)
  	for (int i= 0; i < antall; i++)
  		tall[i] = Min.trekkTall(1,10);
// hvis tabellen er mindre en 8 tall 
  	String utTxt = "";
  	if (antall <=8 ){
  		utTxt += "Tallsettet: ";
  		for (int i = 0; i < antall; i++)
			utTxt += tall[i] + ", ";
		utTxt += "\n";
  	}
// beregner snittet
	int sum = 0;
	for (int i = 0; i<antall; i++)
		sum+= tall[i];
	int snittet = (int)Math.round((double)sum / antall ); 

// 
	utTxt += "gjennomsnitt av " + antall + " tall: " + snittet + "\n"
				+ "Under Snittet: ";
	

	for (int i = 0; i<antall; i++)
		if (tall[i] < snittet)
			utTxt += tall[i] + " ";
		utTxt += "\n";
// se hvis snitt tallet er i tall mengde
	utTxt += "snitt er i Tallsettet: ";
	boolean funnet = false;
	int i = 0;
	while (!funnet && i<antall)
		if (tall[i] == snittet)
			funnet = true;	
		else
			i++;
	if ( funnet )
		utTxt += "Ja!";
	else
		utTxt += "Nei!";
	showMessageDialog(null, utTxt);
// skriver ut resultatet
	

// 

/*	talltxt= showInputDialog("gi et siffer(2-9):");
	siffer = parseInt(talltxt);
*/


  }
}