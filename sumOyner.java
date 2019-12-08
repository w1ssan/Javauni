/* leksjon 5- tabeller oppgave1
* simuler kast med to terninger 
* teller hvor mye av samme kast vi får 
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import java.util.*;

public class sumOyner {

  public static void main(String[] args) {

//telle tabell
  	int [] antallAv = new int[13]; //indekser 2-12 0 og 1 er ubrukt


//les inn
	int antkast = Min.lesHeltall(1,99);

//teller sum øyner
	for (int i = 1; i<=antkast; i++) {
		int øyne1 = Min.trekkTall(1, 6);
		int øyne2 = Min.trekkTall(1, 6);
		int sumØyne = øyne1+øyne2;
		antallAv[sumØyne]++; 
	}
//utskrift
	
	String utTxt= "Kastresultat: " + Arrays.toString(antallAv);
	showMessageDialog(null, utTxt);

  }
}