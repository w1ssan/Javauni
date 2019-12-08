// Skipper programforklaring her i løsningsforslaget
import static java.lang.Integer.*;
public class Tjueett extends EasyGraphics {
	public static void main(String[] args) {
		launch(args);
	}
	public void run () {
		makeWindow("21-spillet", 400, 200);
		setFont("Arial", 20);
		drawString("Fjern 1, 2 eller 3 brikker fra haugen",25,40);
		fillRectangle(25, 50, 350, 5);
		int iHaugen = 21;
		boolean ferdig = false;
		int spiller = 1;
		while ( !ferdig ) {
			setColor(255,255,255);
			fillRectangle(0,60,400,140);
			setColor(0,0,0);
			if ( iHaugen > 3 ) {
				setFont("Arial", 40);
				drawString("Spiller " + spiller + " sin tur ...",25,100);
				for (int i=0; i<iHaugen; i++)
					fillRectangle(25 + 10*i, 125,5,50);
				setFont("Arial", 20);
				drawString(iHaugen + " i haugen",260, 175);
				int fjernes = 0;
				boolean ulovlig = false;
				do {
					fjernes = parseInt(getText("Gi antall å fjerne:"));
					ulovlig = fjernes < 1 || fjernes > 3;
					if (ulovlig) {
						setColor(255,0,0);
						drawString("Ulovlig antall!",270,100);
						pause(1000);
						setColor(255,255,255);
						fillRectangle(270,65,125,40);
					}
				} while ( ulovlig );
				iHaugen -= fjernes;
				spiller = 1 + (spiller%2); // Bytter til neste spiller
			}
			else { // iHaugen = 0!
				ferdig = true;
				setColor(255,255,255);
				fillRectangle(0,0,400,200);
				setFont("Arial", 55);
				setColor(255,0,0);
				drawString("Spiller " + spiller + " vant!",20,125);
			}
		}
	}
}