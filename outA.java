/* Leksjon 3 oppgave 7
*simulere terningkast og teller antall kast til
*første 6-er
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class outA {

  public static void main(String[] args) {
  	int ant = Min.lesHeltall(1,8);
  	for (int i = 1; i<=ant; i++){
  		Min.skrivTegn('+',1);
  		out.println();
  		Min.skrivTegn('+',i);
  		out.println();
  	}


/*	talltxt= showInputDialog("gi et siffer(2-9):");
	siffer = parseInt(talltxt);
*/


  }
}