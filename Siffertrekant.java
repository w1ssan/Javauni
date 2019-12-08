/* Programmet leser inn et heltall for høyden i en trekant.
* Denne skrives ut i konsollet vha. de ulike linjenummerne
* som skrivesymbol for hver av linjene.
*/
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.System.*;
public class Siffertrekant {
	public static void main(String[] args) {
		int høyde = 0;
		do {
			høyde = parseInt(showInputDialog("Gi antall linjer (2-9):"));
		} while (høyde < 2 || høyde > 9);
			for (int i=1; i<=høyde; i++) {
			for (int j=1; j<=høyde-i; j++)
				out.print(" "); // Avtagende innrykk på linjene
			for (int j=1; j<=i; j++)
				out.print(i+" "); // Linjesiffer skrives ut
			out.println();
		}
	}
}