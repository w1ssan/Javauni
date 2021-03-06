/*all methods i could get from the book*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import java.util.*;
public class bib {


	//normal skrivTegn method antall x 
	public static void skrivTegn(char t, int antall) {
		for (int i = 1; i<=antall; i++)
			out.print(t);
		out.println();
	}


	public static void skrivBoks(int b, int h) {
		for (int i = 1; i<=h; i++){
			for (int j = 1; j<=b; j++) {
				out.print('x');
			}
			out.println();
		}
	}


	public static void skrivTrekant(char t, int h){
		int rad = 0;
		for (int i = 1; i<=h; i++) {
			for (int j = 0; j<=rad; j++) {
				out.print(t);	
			}
			rad++;
			out.println();
		}
	}


	public static void skrivtrekant2(char t, int h){
		int rad = h;
		for (int i = 0; i<=h; i++) {
			for (int j = 0; j<=rad; j++) {
				out.print(t);	
			}
			rad--;
			out.println();
		}	
	}


	// cm to inch
	public static double cmToTommer(double cm){
		double tommer = cm / 2.54;
		return tommer;
	}


	// inch to cm 
	public static double tommerToCm(double tommer){
		double cm = tommer * 2.54;
		return cm;
	}


	//takes a number of times into the method and multiplies 
	public static int fakultet(int max){
		int sum = 1;
		for (int i = 1; i <= max; i++){
			sum = sum * i;
		}
		return sum;
	}


	//method that reads a number between a lowest and max limiter into a integer 
	public static int lesHeltall(int nedre, int øvre){
		boolean lovlig = false;
		int tall;
		do{
			tall = parseInt(showInputDialog("oppgi et tall mellom " + nedre + " og " + øvre + ":"));
			if (tall >= nedre && tall <= øvre) {
				lovlig = true;
			}

		}while (!lovlig);
		return tall;
	}

	
	//method that determens if input char is a letter of the alfabet
	public static String charTest(char b){
		String utTxt = "";
		if (b >= 'A' && b<= 'Z' || b >= 'a' && b<= 'z') {
			utTxt += "er en bokstav";
		}
		else
			utTxt += "er ikke en bokstav";
		return utTxt;
	}


	//method that determens if a letter is a vowel or not
	public static String vokalTest(char b){
		String utTxt = "";
		if (b >= 'A' && b<= 'Z' || b >= 'a' && b<= 'z') {
			if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'y') {
				utTxt += "bokstav er en vokal";
			}
			else
				utTxt += "bokstav er en konsonant";
		}
		else {
			utTxt = "er ikke en bokstav";
		}
		return utTxt;	
	}


	//capital letter test
	public static String capaTest(char b){
		String utTxt = "";
		if (b >= 'A' && b<= 'Z' || b >= 'a' && b<= 'z') {
			if (b >= 'A' && b <= 'Z') {
				utTxt += "stor bokstav";
			}
			else
				utTxt += "liten bokstav";
		}
		else {
			utTxt = "er ikke en bokstav";
		}
		return utTxt;
	
	}


    //metode som summerer inhold i en tabell
	public static int arraySum(int[] a){
		int sum = 0;
		for (int i=0; i<=a.length; i++) {
			sum += a[i]; 
		}
		return sum;
	}


	//metode som finner ut hvis en tall er en primtall(true) eller ikke(false)
	public static boolean prim(int a){
		boolean res = true;
        for(int i = 2; i <= a/2; ++i)
        {
            // condition for nonprime number
            if(a % i == 0)
            {
                res = false;
                break;
            }
        }
        return res;
	}

	// HTML metoder

	//metode som åpner en html dokument
	public static void startDok(){
		out.println("<html><body>");
	}

	//metode lukker en html dokument
	public static void stoppDok(){
		out.println("</body></html>");
	}

	//metode som lager et overskrift i html
	public static void overskrift1(String s){
		out.println("<h1>" + s + "</h1>");
	}

	/*TABELLER METODER*/

	//metode som nulstiller en tabel
	public static void tabNullstill(int[] tab){
		for (int i = 0; i < tab.length; i++) {
			tab[i] = 0;
		}
	}

	//metode som setter alle verdier i en tabel til x
	public static void tabOmstill(int[] tab, int x){
		for (int i = 0; i < tab.length; i++) {
			tab[i] = x;
		}
	}

	//metode som printer en tabel til console
	public static void tabPrint(int[] tab){
		for (int i = 0; i < tab.length; i++) {
			out.print(tab[i] + " ");
		}
	}

	//metode som finner minste verdi i en heltall tabell
	public static int tabMin(int[] tab){
		int min = 2147483646;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] <= min){
				min = tab[i];
			}
		}
		return min;
	}

	//metode som finner største verdi i en heltall tabell
	public static int tabMax(int[] tab){
		int max = -2147483646;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] >= max){
				max = tab[i];
			}
		}
		return max;
	}

	//metode som finner gjennomsnitt verdi av en heltall tabell
	public static int tabSnitt(int[] tab){
		int snitt = 0;
		for (int i = 0; i < tab.length; i++) {
			snitt += tab[i];
		}
		snitt = snitt / tab.length;
		return snitt;
	}

	//metode for å slå sammen tabeller
	public static int[] tabSamle(int[] tabA, int[] tabB){
		int nyLengde = tabA.length + tabB.length;
		int[] nyTab = new int[nyLengde];
		for (int i = 0; i<tabA.length; i++) {
			nyTab[i] = tabA[i];
		}
		for (int j = 0; j<tabB.length; j++) {
			nyTab[tabA.length + j] = tabB[j];
		}
		return nyTab;
	}

	//metode som snur en tabell
	static void tabSnu(int a[], int n) { 
        int t; 
        for (int i = 0; i < n / 2; i++) { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        }
    } 

}