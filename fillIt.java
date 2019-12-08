//hjelpemetoder skrivTegn skriver ut valgfri char (t) i int antall ganger
private static void skrivTegn(char t, int antall){
for (int i = 1; i <= antall; i++)
	out.print(t);
}
//hjelpemetode med output, areal tar input bredde(a) høyde(b) og return flattinhold
private static int areal(int a, int b){
	int flattinnhold = a*b;
return flattinnhold;
}
//
for(int i = 1; i<=4; i++){
	skrivTegn(' ',8-2*i);
	skrivTegn('+', 2*i);
	out.println()
}
//arial av en sirkel
private static double arealSirkel(double radius){
	return math.PI*Math.pow(r,2);
}
//eksempel på kall fra main 
out.println("arial: " + arealSirkel(10));
//se hvis en tall er et oddetall
private static boolean odde(int a){
	return (tall%2 == 1);
}
//eksempel på kall fra main
if (odde(5))
	out.println("5 er et oddetall");
//mottsatt odde metode
private static boolean like(int tall){
	return ! odde(tall);
}
//skifte bokstav fra (i) liten til stor (andre tegn uendret), og (ii) motsatt
private static char stor(char = t){
	if ('a'<= t && t<='z')
		return (char)(t-32);
	return t;
}
private static char liten(char = t){
	if ('A'<= t && t<='Z')
		return (char)(t+32);
	return t;
}
//metode kall på denne
out.println(liten(bokstav) + " -> " + stor(bokstav));
//finne tverrsummen til et tosifret heltall
private static int tverrsum(int tall){
	int s1 = tall/10;
	int s2 = tall%10;
	return (s1+s2);
}
private static int tverrsum(int tall){
	//løkke som bruker %10 for å komme till siste tallet og telle disse sammen
}
//verdioverføring av parameter
private static void parameterTest(int x) {
	x = x + 1;
	int w = x;
}
// public metode som alle programmer kan bruke 
public class Temperatur {
	public static double celcius2Fahrenheit(double c) {
		return (c * 9/5) + 32;
	}
	public static double fahrenheit2Celcius(double f) {
		return (f - 32) * 5/9;
	}
}
// metodekall på denne
double grC = 20.0;
double grF = Temperatur.celcius2Fahrenheit(grC);
	   grF = Math.round(grF);

//------------------------------------------------------------------------------------------------------------------
//tabeller (arrays)
int [] timeTab; //deklarer en tomt tabell
int [] timeTab = {8,12,10,7,7,4,0}; //deklarer en tabell med innhold
//datatype[] tabellnavn = new datatype[lengde];
int[] tabellnavn = new int [9];
//denne lager start verdier
//sum av timer i tabelen
int [] timeTab = {8,12,10,7,7,4,0};
int sum = 0;
for (int i = 0; i<7; i++)
	sum+= timeTab[i];
out.print("Sum timer: " + sum);
//dagnr og timer
for (int i = 0; i<7; i++)
out.println("dag " + i + ": " + timeTab[i]); 
// telling av øyne (1-6) ved terningkast
int [] antall = new int [7];
int kast = lesHeltall();
while (kast!=0) {
	antall[kast]++;
	kast = lesHeltall();
}
//sekvensielt søk
boolean funnet = false;
int i=0;
while (!funnet && i < tall.length) //stopper før vi går over enden av array 
	if (tall[i] == letterEtter)
		funnet = true
	else 
		i++; // flytt til neste tall

//største verdi i et tallsett?
int posisjon = 0;
double maxTall = tall[0];
for (int i =1; i<tall.length; i++)
	if(tall[i] > maxTall){
		maxTall = tall[i];
		posisjon = i;
	}
out.println("største verdi: " + maxTall);
out.println("er på plass nr : " + posisjon)
//tabeler del 2 
//-----------------------------------------------------------
//deklarer en tabell med 3 pi i verdiliste
double [] mintabel = {Math.Pi, Math.Pi, Math.Pi};
//automatisk indeksert : 0-6
//en indeksert variabel er en kompenent av tabellen feks
timeTab[2] = 2;
//bruk antall kompenenter i tabellen 
datatype[] tabellnavn = new datatype[lengde];
//når man lager en tabell på den måten så blir alle variables i tabellen 0
int[] mintabel = new int[5];
int[] mintabel = {5,5,5,5,5};
// tabell med 50 5 tall
int[] tall = new int[50];
for (int i= 0; i<tall.lengde; i++)
	tall[i] = 5;
// 50 tall 0 og 5 annenhver
int[] tall = new int[50];
for (int i =0; i<tall.lengde; i+=2)
	tall[i]=5;
//lag tabell me 1 b c
char[] bokstav = {'a', 'b', 'c'};
//tabell med hele alfabetet
char[] bokstavstor = new char[26];
for (char i = 1; i<=26 ; i++) {
	bokstavstor[i] = (char)('A' + i);
}
//alternativ
for (char b='A';b<='Z' ; b++) {
	bokstavstor[b-65] = b;
}
// tabell kortfargene
String[] kortfarge = {"ruter", "kløver", "hjerter", "spar"};
//¨tabellkopiering -1
tabellb= tabella;
//kopi vi forigår referanseoverføring, og lager ikke en ny tabell
//tabellkopiering 2
int[] tabellB = new int[tabellA.length];
for (int i = 0; i<=tabellA.length; i++) {
	tabellB[i] = tabellA[i];
}
//likhet i tabellen
public static boolean verdiLike(int[] tab1, int[] tab2) {
	if (tab1.length != tab2.length)
		return false;
	boolean like = true;
	int i = 0;
	while (like && i <tab1.length)
		if(tab1[i] != tab2[i])
			like = false
		else
			i++;
	return like;
}
liketab = Arrays.equals(tabellA, tabellB);
sort = Arrays.sort(tabell); //sorterer en tabell i stigende rekkefølge
pos = Arrays.binarySearch(tabell, søkeverdi); //søker i en tabell etter en verdi og returnerer index plassen vis du får negativ verdi så er ikke verdien der.
tabellB = Arrays.copyOf(tabella,lengde);
//returnerer en ny tabell av den angitte lengde som er en kopi av tabellA dersom angitt lengde er lik tabellA.length. om lengden er større, fyller det på med "null" utover i den nye tabellen, om lengden er mindre blir det tat kopi av så mange element som det er plass til i den nye
import java.util.*; // arrays klassen importeres ved denne
//finne en verdi i en array
Arrays.sort(tall);
int i = Arrays.binarySearch(tall, letterEtter);//hvis du bruker dette må du sortere søk
//dobler hver verdi i en heltalltabell
private static int[] dobling(int[] tab) {
	int[] nyTab = new int[tab.length];
	for (int i = 0; i<tab.length; i++) {
		nyTab[i] = 2*tab[i];
	}
	return nyTab;
}
//metodekall
int tabellB= dobling(int[] tab);

//referanseoverføring av tabeller
private static void nullstill(in[] tab){
	
}
//filer og untak
//skriving(lagring) og lesning 
//grunnlegende operasjoner åpne fil -> skrive dataene til fil -> lukke fil
import java.io.*; //importerer aktuele filklassen java in out
public class SkrivNavneliste {
	public static void main(String[] args) throws Exception {
		//åpne fil
		String filnavn = "navn.txt";
		PrintWriter skriver = new PrintWriter(filnavn); //åpner filnavn
		String[] navnTab = {"jo","jan","june", "jenny"};
		//skrive til fil
		for (int i = 0; i < navnTab.length; i++)
			skriver.println(navnTab[i]);
		//close fil
		skriver.close(); //lukker fil
	}
}
//til våren skal ve bruke try-catch-setning for å fange exception
//for nå skal vi la programmet krasje med throws exception
String fil = "filnavn.txt"
//filen finner ikke fra før: ny fil blir oppretter
//filen finnes fra før: overskriver eksisterende innhold:
PrintWriter skriver = new PrintWriter(fil);
//føye til mer innhold, henge på nye linjer:
FileWriter skrivelink = new FileWriter(fil, true);
PrintWriter skriver = new PrintWriter(skrivelink);

// lese fra fil
/*
Kvasikode:
	åpne file for lesing
	les in
	gjenta til slutten
	*/
//import hovedklassen
import java.util.*;
//oprett et scanner objekt kalt (leser)
Scanner leser = new Scanner(aktuell fil);
while (leser.hasNext()) //alternativ leser.hasNextLine()
//har du en tegnsekvens .next()
//har du hele linjer .hasNextLine()
File innFil = new File("navn.txt");
Scanner leser = new Scanner(innFil); //filinnpakning først

// antall navn ligger på første linje
int antNavn = parseInt(leser.nextLine() );
//tabell for å holde på alle navnene fra fila
String[] navnTab = new String[antNavn];

for (int pos=0; pos<antNavn; pos++)
	navnTab[pos] = leser.nextLine();
leser.close(); //tabellen er fylt med navn

//snur tabellen 
PrintWriter skriver = new PrintWriter("snunavn.txt");
for (int pos= antNavn-1; pos>=0; pos--)
	skriver.println(navnTab[pos]);
skriver.close();
//fin
int sum = 0;
while (leser.hasNext()) //denne skal være i sammenheng med nextInt leser.hasNextInt()
	sum += parseInt(leser.next());
	//mye enklere variant sum += leser.nextInt();
	leser.close();
	out.println("sum: " + sum);

//obs hasNextDouble og nextDouble leser desimaltall 
		//utfordring vi bruker komma i norge istedenfor punktum
Scanner leser = new Scanner (fil)
leser.useLocale(locale.US);// usa bruker . som , 
double sum = 0;
while (leser.hasNextDouble())
	sum += leser.nextDouble();
	leser.close();
	out.println("sum " + sum);

//eksamenoppgave 3 2017
/*hva skal vi beregne
min, max, snitt= sum/antall
*/
import java.util.*;
import java.io.*;

String filnavn = showInputDialog("gi filnavn med temp: ");
File fil = new File(filenavn);//legge til filinpakning
Scanner leser = new Scanner(fil); 
int antall = 0;
double sum = 0, min = 100, max = -100;
while (leser.hasNextDouble()){
	double temp = leser.nextDouble();
	sum += temp;
	antall++
	if (temp < min)
		min = temp;
	if (temp > max)
		max = temp;
}
leser.close();

double snitt = sum / antall;
//føye til resultat på datafil
FileWriter skrivelink = new FileWriter(filenavn, true);//append = true
PrintWriter skriver = new PrintWriter(skrivelink);// henger på skrivelink til printwriter (hvis vi skal henge på mer date på same fil)
skriver.println(); //ny linje for a ungå feilskriving
skriver.println("min temp: " + min);
skriver.println("max temp: " + max);
skriver.println("snitt temp: " + snitt);
skriver.close();
// lag en metode som skriverpent(): en metode som legger til blank for liten tall så det ser fint ut i utskrift.

