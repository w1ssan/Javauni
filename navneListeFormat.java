/* Leksjon 6 oppgave 1
* filtesting via navnelister
* ser på pkt c) med å snu navn...
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
// spesifikk filimport
import java.util.*; // file/print
import java.io.*; // scanner

public class navneListeFormat {

  public static void main(String[] args) throws Exception{
  	//les inn filnavnet
  	String filnavn = showInputDialog("Gi filnavn: ");

  	//åpne tilgang til fil
  	File fil = new File(filnavn); //filinnpakning
  	Scanner leser = new Scanner(fil);

  	//beregne antall navn på fila
  	int antnavn = 0;
  	while ( leser.hasNextLine() ){
  		antnavn++;
  		leser.nextLine(); //flytter leseposisjon på fila
  	}
  	leser.close();
  	String[] navn = new String[antnavn];

  	//gjenåpner tilgang til fil
  	leser = new Scanner(fil);
  	for ( int i=0; i<antnavn; i++)
  		navn[i] = leser.nextLine(); //ett navn
  	leser.close();

  	//skriver navneliste til ny fil, men på
  	//formen etternavn, fornavn

  	//skiver navneliste til ny fil
  	PrintWriter skriver = new PrintWriter("etter"+filnavn);
  	//snur rekkefølge på navn
  	for ( int i=0; i<antnavn; i++){
  		Scanner linjeleser = new Scanner(navn[i]);
  		// NB! default skilletegn er whitespace
  		String fornavn = linjeleser.next();
  		String etternavn = linjeleser.next();
  		skriver.println(etternavn+", "+fornavn);
  	}
  	skriver.close();

  	String utTxt = "filbehandling ferdig, OK!";
  	showMessageDialog(null, utTxt);


  }
}