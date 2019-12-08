/* eksamen mai 2018
*Program for omkoding av tallfiler
*lovlige verdier fratrekkes 10 og 
*skrives fortløpende på ny fil, maks
*12 tall pr linje på ny fil
*/
import java.io.*; // file, printWriter
import java.util.*; //scanner
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class omKoding {

  public static void main(String[] args) throws Exception{ //ikke glem throws exception
  	//les inn filnavnet
  	String filnavn = showInputDialog("Gi filnavn: ");
  	File fil = new File( filnavn );
  	Scanner leser = new Scanner(fil);

  	PrintWriter skriver = new PrintWriter("res"+filnavn);

  	//leser ett og ett tall, omkoder hvis lovlig
  	int antall = 0;

  	while ( leser.hasNextInt() ) {
  		int verdi = leser.nextInt();
  		if ( 0 <= verdi && verdi <= 20) {
  			verdi = verdi-10;
  			skriver.print(verdi + " ");
  			antall++;
  			if ( antall % 12 == 0)
  				skriver.println();
  		} 
  	leser.close();
  	skriver.close();			
  	}
	String utTxt = "Filbehandling Ok! ";
	showMessageDialog(null, utTxt);

  }
}