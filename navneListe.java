/* Leksjon 6 oppgave 1
* filtesting via navnelister
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
// spesifikk filimport
import java.util.*; // file/print
import java.io.*; // scanner

public class navneListe {

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

  	//skiver navneliste til ny fil
  	PrintWriter skriver = new PrintWriter("snudd"+filnavn);
  	for (int i= antnavn-1; i>=0; i--)
  		skriver.println(navn[i]);
  	skriver.close();

  	//leser et nytt navn, legger det til på navn.txt
  	String nyttNavn = showInputDialog("gi navn (fornavn etternavn): ");
  	FileWriter skrivelink = new FileWriter(filnavn, true);
  	skriver = new PrintWriter(skrivelink); //append
  	skriver.println();
  	skriver.println(nyttNavn);
  	skriver.close();

  	String utTxt = "filbehandling ferdig, OK!";
  	showMessageDialog(null, utTxt);


  }
}