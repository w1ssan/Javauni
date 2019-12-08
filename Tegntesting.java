import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class Tegntesting {
	//output
	public static void main(String[]args) {
		
		int a = trekkBokstav();//65(A)+32(a)
		out.println((char)a);
		//call for the skrivtegn method (character type, number of instances)
		bib.skrivTegn('+', 7);
		//call for the skrivboks method (number of instances in one line, number of lines)
		bib.skrivBoks(14, 8);
		//call for the skrivtrekant method (character type, number of lines)
		bib.skrivTrekant('+', 3);

		//kall på en metode som konverterer cm til tommer
		double sum = bib.cmToTommer(20);
		out.println(sum);

		//kall på en metode som konverterer tommer til cm
		sum = bib.tommerToCm(20);
		out.println(sum);

		//kall på fakultet metode
		int tall = bib.fakultet(8);
		out.println(tall);

		//kall på en metode som leser in et helltall mellom en nedre og en øvre grense
		tall = bib.lesHeltall(0, 10);
		out.println(tall);*//*

		//kall på en metode som tester hvis input er en bokstav eller ikke
		String utTxt = bib.charTest('*');
		out.println(utTxt);

		//kall på en metode som tester hvis en bokstav er en vokal eller ikke
		utTxt = bib.vokalTest('*');
		out.println(utTxt);

		//kall på en metode som tester hvis en bokstav er en stor eller liten bokstav
		utTxt = bib.capaTest('H');
		out.println(utTxt);

		//en array summering metode
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		int print = bib.arraySum(intArray);
		out.println(print);
		
		//en kall på tversum metoden
		int tall = parseInt(showInputDialog("gi en tall"));
		int sum = tverrSum(tall);
		showMessageDialog(null, sum);

		//en call på geometri library laget fra boken
		double res = geometri.rectArea(3, 5);
		out.println(res);

		// primtall call alle prim tall fra 2-100 hopper over 1
		for (int i = 2; i<= 100; i++) {
			if (bib.prim(i) == true){
				out.print(i + " ");
			}
		}
		boolean bool = bib.prim(11);
	}
	//trekkbokstav metoden
	public static int trekkBokstav(){
		int min = 65;
		int max = 90;
		return min+(int)(Math.random()*(max-min));
	}
	//tversum metode
	public static int tverrSum(int a){
		int sum = 0;
		do{
			int tall = a%10;
			a = a/10;
			sum +=tall;
		}while (a>10);
		sum += a;
		return sum;
	
	}
}