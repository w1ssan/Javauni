import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static javax.swing.JOptionPane.*;

public class tabellHjelp{

	public static void main(String[]args){
		// lage en tabell med kjennt tallsett
		int[] tallsett = {10, 20, 30, 40};
		//a simple printout
		for (int i = 0; i< tallsett.length; i++) {
			out.print(tallsett[i] + " ");
		}
		out.println();

		//this one counts how many numbers in an array are less or equal to X 
		int x = 4;
		int[] telltall = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int ant = 0;
		for (int i = 0; i< telltall.length; i++) {
			if (telltall[i] <= x){
				ant++;
			}
		}
		out.println(ant);

		//user inputs a array and this sorts the array in an ascending order
		/*int[] fyllinn = new int[8];
		for (int i = 0; i<fyllinn.length; i++) {
			fyllinn[i] = bib.lesHeltall(1, 100);
		}
		sort(fyllinn);
		for (int i = 0; i< fyllinn.length; i++) {
			out.print(fyllinn[i] + " ");
		}
		out.println();*/
		//Temperatur oppgave 5.9.4
		/*int[] temp = new int[7];
		int min = 100;
		int max = -100;
		int sum = 0;
		int snitt = 0;
		for (int i = 0; i<temp.length; i++) {
			temp[i] = bib.lesHeltall(-50, 50);
			if (temp[i] >= max){
				max = temp[i];
			}
			if (min >= temp[i]){
				min = temp[i];
			}
			sum += temp[i];
			snitt = sum / 7;
		}
		out.print("minimum temp: " + min + "\n" + "maximum temp: " + max + "\n" + "gjennomsnit temp: " + snitt);*/

		//flette tabeller
		int [] første = {1,2,3,4,5,6,7};
		int [] andre = {8, 9, 10};
		int [] siste = bib.tabSamle(første, andre);
		int min = bib.tabMin(siste);
		int max = bib.tabMax(siste);
		int snitt = bib.tabSnitt(siste);
		bib.tabPrint(siste);
		out.println();
		out.println(min);
		out.println(max);
		out.println(snitt);

		int antall = 5;
		int[] karakter = {'A', 'A', 'F', 'F', 'D'};
		int sum = 0;
		for (int i = 0; i < karakter.length; i++) {
			sum += karakter[i];
		}
		int snitte = sum / karakter.length;
		char ut = (char)snitte;
		out.println(ut);

		/*int[] konsol = {1, 2, 3, 4, 5, 6, 7};
		String utTxt = "[ ";
		for (int i = 0; i < konsol.length; i++) {
			utTxt += konsol[i] + ", ";
		}
		utTxt +="]";
		showMessageDialog(null, utTxt);*/

		
		int[] omstill = {1, 2, 3, 4, 5, 6};
		bib.tabSnu(omstill, omstill.length);
		bib.tabPrint(omstill);
	}
}