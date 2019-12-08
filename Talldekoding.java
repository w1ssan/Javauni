// Skipper programforklaring her i løsningsforslaget
import static javax.swing.JOptionPane.*;
import java.io.*; // PrintWriter, File, FileWriter
import java.util.*; // Scanner
public class Talldekoding {
	public static void main(String[] args) throws Exception {
		String filnavn = showInputDialog("Gi tallfil:");
		String utTekst;
		Scanner leser = new Scanner( new File(filnavn) );
		PrintWriter skriver = new PrintWriter("res"+filnavn);
		int antTall = 0;
		while ( leser.hasNextInt() ) {
			int verdi = leser.nextInt();
			if ( 0 <= verdi && verdi <= 20 ) {
				int tall = verdi - 10;
				antTall++;
				skriver.print(tall + " ");
			if ( antTall%12 == 0 )
				skriver.println();
			}
		// else: Ulovlig verdi - skal hoppes over
		}
		leser.close();
		skriver.close();
		showMessageDialog(null,"Dekoding ferdig, ok!");
	}
}