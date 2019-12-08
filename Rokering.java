/* Programmet henter heltallstabell via metode i Tabeller-klassen.
* Går gjennom tabellen og rokerer parvis (bytter to og to) tall.
* Skriver ut tallene både før og etter rokering.
*/
import static javax.swing.JOptionPane.*; // Dialogvindu for innlesingen
import static java.lang.Integer.*; // Omgjør fra tekst til heltall
import static java.lang.System.*; // Utskrift i konsollet
public class Rokering {
	public static void main(String[] args) {
		int start = parseInt(showInputDialog("Gi minste tall:"));
		int slutt = parseInt(showInputDialog("Gi største tall:"));
		int[] t = Tabeller.tallserie(start,slutt);
		int n = t.length;
		int[] nyT = new int[n];
		if ( n%2 == 1 )
			n--;
		for (int i=0; i<n-1; i+=2) {
			nyT[i] = t[i+1];
			nyT[i+1] = t[i];
		}
		if ( n < t.length )
			nyT[n] = t[n];
		out.println("Før: " + Tabeller.skriv(t));
		out.println("Etter: " + Tabeller.skriv(nyT));
	}
	public static int[] tallserie(int min, int max) {
	int[] tab = new int[max-min+1];
	for (int i=0; i<tab.length; i++)
		tab[i] = min + i;
	return tab;
	}
}