/* Metodesamling, verktøyklasse, der det ligger 
 *en del verktøy som kan vøære nyttige 
 i ulike program. et minibibliotek
 */
import static javax.swing.JOptionPane.*;
public class Min{

	// tegnsekvens i gitt tegn, av gitt lengde
	public static void skrivTegn(char tegn, int antall){
		for (int i = 1; i <= antall; i++)
			System.out.print(tegn);
	}
	// sjekker om tegn er engelsk bokstav.
	public static boolean erBokstav(char t){
		return ( 'a' <=t && t<= 'z' || 'A' <=t && t<= 'Z' );
	}
	// avrunder en decimal verdi til et siffer etter komma
	public static double avrund1(double t){
		return (int)(t*10 + 0.5)/10.0;
	}
	// avrunder en decimal verdi til et siffer etter komma 
	public static double avrund2(double t){
		return (int)(t*100 + 0.5)/100.0;
	}
	//leser lovlig heltall i (min - max)
	public static int lesHeltall(int min, int max){
		int tall; 
		boolean ulovlig;
		do {
			String tallTxt = showInputDialog("gi heltall (" + min + " - " + max + "):");
			tall = Integer.parseInt(tallTxt);
			ulovlig = tall < min || tall > max;
			if ( ulovlig )
				showMessageDialog(null, "Ulovlig verdi !");

		} while ( ulovlig );

		return tall;
	}
	//returnerer en tilfeldig valgt heltall som ligger i omradet min-max
	public static int trekkTall(int min, int max){

		return (int)(min + Math.random()* (max-min + 1));
	}
	//temperatur converter celcius <-> fahrenheit
	public class Temperatur {
	public static double celcius2Fahrenheit(double c) {
		return (c * 9/5) + 32;
	}
	public static double fahrenheit2Celcius(double f) {
		return (f - 32) * 5/9;
	}
	//beregner tverrsum på en heltall me mer 2 tall
	public static int tverrsum(int tall){
		int s1 = tall/10;
		int s2 = tall%10;
		return (s1+s2);
	}
	public static int antPositive(int[] tab) {
		int antall=0;
		for (int i=0; i<tab.length; i++)
			if ( tab[i] > 0 )
				antall++;
		return antall;
	}
}
}
