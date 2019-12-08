/* Programmet leser ønsket antall bokstaver (1-12) som skal trekkes tilfeldig
* fra A-L. Hver bokstav trekkes kun en gang, og blir skrevet i konsollet.
*/
import static javax.swing.JOptionPane.*; // Dialogvindu for innlesingen
import static java.lang.Integer.*; // Omgjør fra tekst til heltall
import static java.lang.System.*; // Utskrift i konsollet
public class TrekkBokstaver {
	public static void main(String[] args) {
		int antBokstaver = 0;
		do {
			antBokstaver = parseInt(showInputDialog("Gi ant. bokstaver (1-12):"));
		} while ( antBokstaver < 1 || antBokstaver > 12);
		char[] bokstav = {'A','B','C','D','E','F','G','H','I','J','K','L'};
		for (int nr=1; nr<=antBokstaver; nr++) {
			int i=0;
			do {
			i = trekkTall(0,11);
			} while ( bokstav[i] == '*' );
			// Stjerna markerer en bokstav som er trukket ut
			out.print(bokstav[i] + " ");
			bokstav[i] = '*';
		}
		out.println();
		}
		// Metoden trekker et tilfeldig heltall i området min - max
		private static int trekkTall(int min, int max) {
		return min + (int)(Math.random()*(max-min+1) );
	}
}