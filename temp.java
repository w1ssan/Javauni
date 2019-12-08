import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
import java.lang.Double.*;



public class temp{
	public static void main(String[] args) throws Exception{

		// les inn filnavnet
		String filNavn = showInputDialog("Gi filnavn: ");

		// åpne tilgang til fil

		File fil = new File(filNavn);
		Scanner leser = new Scanner(fil);

		// deklarere ny tabell og fylle den
		int antall = 1;
		double[] temperatur = new double[24];
		for (int i = 0; i < 24; i++) {
			temperatur[i] = leser.nextDouble();
			antall++;
		}
		leser.close();
		//beregne min og max
		double max = -1000;
		for (int i = 0; i < temperatur.length; i++)
			if (temperatur[i] >= max){
				max = temperatur[i];
			}

		double min = 1000;
		for (int i = 0; i < temperatur.length; i++)
			if (temperatur[i] <= min){
				min = temperatur[i];
			}

		//beregne snitt og runde det
		double snitt = 0;
		for (int i = 0; i < temperatur.length; i++)
			snitt += temperatur[i];
		snitt = snitt / temperatur.length;
		snitt = (int)(snitt * 10 + 0.5)/10.0;

		//legge til min max og snitt til filen
		FileWriter skrivelink = new FileWriter(filNavn, true);
		PrintWriter skriver = new PrintWriter(skrivelink);
		skriver.println();
		skriver.println("Minimum : " + min);
		skriver.println("Maximum : " + max);
		skriver.println("Gjennomsnitt : " + snitt);
		skriver.close();

		showMessageDialog(null, "filbehandling ferdig, OK!");
	}
}