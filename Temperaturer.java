// Skipper programforklaring her i løsningsforslaget
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.*;
public class Temperaturer {
	public static void main(String[] args) throws Exception {
	String filnavn = showInputDialog("Gi filnavn:");
	File fil = new File(filnavn);
	Scanner leser = new Scanner(fil);
	//leser.useLocale(Locale.US);
	//leser.useDelimiter(" ");
	int antall = 0;
	double min=100, max=0, sum=0;
	while ( leser.hasNextDouble() ) {
		double temp = leser.nextDouble();
		antall++;
		if ( temp < min )
		min = temp;
		if ( temp > max )
		max = temp;
		sum += temp;
	}
	leser.close();
	double snitt = Min.avrund1(sum/antall);
	FileWriter skrivekobling = new FileWriter(fil, true);
	PrintWriter skriver = new PrintWriter(skrivekobling);
	skriver.println();
	skriver.println(" Min.temp.: " + min);
	skriver.println(" Max.temp.: " + max);
	skriver.println("Snitt temp.: " + snitt);
	skriver.close();
	showMessageDialog(null, "Filbehandling ferdig, ok!");
	}
	// Metoden avrunder et tall til én desimal
	public static double avrund1(double tall) {
	double eps = 0.5;
	if ( tall < 0 ) eps = -0.5;
	return (int)(tall*10 + eps)/10.0;
	}
}