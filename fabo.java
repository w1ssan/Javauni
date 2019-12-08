/* Leksjon 3 oppgave 7
*simulere terningkast og teller antall kast til
*første 6-er
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class fabo {

  public static void main(String[] args) {
  	int n = Min.lesHeltall(1,10);
  	int r = 1;
  	int pr = 1;
  	for (int i = 1; i <= n; i++)
		pr = pr+r;
  		out.print(pr+ " ");





/*	talltxt= showInputDialog("gi et siffer(2-9):");
	siffer = parseInt(talltxt);
*/


  }
}