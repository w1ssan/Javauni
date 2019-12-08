/* Programmet beregner gjennomsnittslønn i ulike tjenestetidsgrupper
* for et gitt firma. Firmadata ligger på en egen fil.
* Resultat skrives til ny fil.
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import java.io.*;
import java.util.*;
public class Loennsanalyse {
	public static void main(String[] args) throws Exception {
		int[] sumLønn = new int[6];
		int[] antall = new int[6];
		String filnavn = showInputDialog("Gi filnavn (firmaX.txt):");
		File fil = new File(filnavn);
		Scanner leser = new Scanner(fil);
		while ( leser.hasNextLine() ) {
			int alder = leser.nextInt(); // hoppes over
			int tjTid = leser.nextInt();
			int loenn = leser.nextInt();
			int grNr = tjTid/10;
			antall[grNr]++;
			sumLønn[grNr] += loenn;
		}
		leser.close();
		PrintWriter skriver = new PrintWriter("snitt"+filnavn);
		for (int grNr=0; grNr<6; grNr++) {
			skriver.print(grNr*10 + "-" + (grNr*10+9) + ": ");
			// Her er det ok å bare skrive ut gruppenummer 0-6
			if ( antall[grNr] > 0 )
				skriver.println(sumLønn[grNr]/antall[grNr]);
			else
				skriver.println("0");
		}
		skriver.close();
	}
}