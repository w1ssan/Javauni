import java.util.Arrays;

public class tabellMetoder{
	public static void main(String[] args) {
		int[] tall = {1,2,3,4,5,6,7};
		//legg till metode som gjør tabellen 1 størere og legger in valgt verdi
		tall = leggTillTab(tall, 5);

		//endre tabell som lagger en ny kopi av en valgt tabell og legger till en verdi i en valgt indeks
		int[] endrettall = endretTabell(5, 1, tall);

		//printtabell metode
		printTab(tall);
		System.out.println();

		printTab(endrettall);
		System.out.println();

		//her er litt ekstra som du kan bruke hvis du finner bruk for det

		String[] strtab = {"dog", "cat", "fish"};
		//si du vil legge till 1 dyr
		//først så kan du bruke denne for å lage tabellen størrere
		strtab = Arrays.copyOf(strtab, strtab.length + 1);
		//så legger du inn dyret
		strtab[strtab.length - 1] = "chicken";
		//så kan du bruke denne for å printe en tabell uansett hvilken type
		System.out.println(Arrays.toString(strtab)); //<--- legg merke til at strtab blir lagt i toString();
	}

	public static int[] endretTabell(int verdi, int indeks, int[] tab){
		//dette lagger en ny tabell med arrays.clone() metode husk å importe arrays klassen oppe
 		int[] ny = tab.clone();
 		//endrer tall på indeksen
		ny[indeks] = verdi;
		//sender tabellen ut igjen
		return ny;
	}
	public static int[] leggTillTab(int[] tab, int verdi){
		int[] ny = new int[tab.length + 1];
		for (int i = 0; i < tab.length; i++) {
			ny[i] = tab[i];
		}
		ny[tab.length] = verdi;
		return ny;
	}

	public static void printTab(int[] tab){
		for (int i = 0; i<tab.length; i++) {
			System.out.print(tab[i]);
		}
	}


}

