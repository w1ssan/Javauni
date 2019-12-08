/*verktøyklasse for eksamen mai 2018, oppg.2
*/
public class Tabeller {
	// metode som lager tallserie
	public static int[] tallSerie(int a, int b){
		int[] tab = new int[ b - a +1 ];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = a + i;
		}
		return tab;
	}
	// array to string metode
	public static String skriv(int[] tab){
		String ut = ""; //denne skal kastes ut fra metoden
		for (int i = 0; i<tab.length; i++) {
			ut += tab[i] + " ";
		}
		return ut;
	}
}