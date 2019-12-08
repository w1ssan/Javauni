/* Leksjon 3 eksempel av nøsting av løkker
*lesser siffer og linjetall fra bruker
*skriver ut linjer i dette sifferet
*tester do løkke
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class SifferLinjer {

  public static void main(String[] args) {
      	//les inn siffer
  	int siffer; 
  	int linjer; 
  	String talltxt;
  	boolean fortsett;
  	do {
  		do {
	      	talltxt= showInputDialog("gi et siffer(2-9):");
	      	siffer = parseInt(talltxt);
	      } while (siffer < 2 || siffer > 9);
	      	//les inn linjetall
	    do {
	      	talltxt= showInputDialog("gi et antall linjer(2-15):");
	      	linjer = parseInt(talltxt);
	      } while (linjer < 2 || siffer > 15);
	    // skriver ut resultat	

	      //skriver nedover linje
	      for (int j = 1; j <= linjer; j++){
	      	//skriver bortover linje
	      	for (int i = 1; i <= siffer; i++)
	      		out.print(siffer + " ");
	      	out.println();
	      }
	      	String svar = showInputDialog("flere forsøk? [1]=ja, [0]=nei");
	      	int svarkode = parseInt(svar);
	      	fortsett = (svarkode == 1);


  	} while (fortsett);

  }
}