// Skipper programforklaring her i løsningsforslaget
import static java.lang.Integer.*;
public class Laanekalkulator extends EasyGraphics {
public static void main(String[] args) {
	launch(args);
}
public void run() {
		final int VINDU = 350;
		final int B = VINDU/4; // Kolonnebredde
		final int H = VINDU/16; // Linjehøyde
		final int M = 25; // Venstremarg
		String tittel = "Annuitetslån betalt i månedlige rater";
		makeWindow(tittel, VINDU, VINDU);
		int lån = 0;
		do {
			lån = parseInt( getText("Gi lånebeløp (kr): ") );
		} while (lån < 50000 || lån > 2000000);
		int år = 0;
		do {
			år = parseInt( getText("Gi låneperiode (år): ") );
		} while (år < 3 || år > 30);
		// Ulovlig verdi? -> Åpne dialogvindu med feilmelding
		String inndata = "Lånebeløp: " + lån + " kr "
						+ "Låneperiode: " + år + " år";
		drawString(inndata, M, H);
		drawString("Rente", M, 3*H-5);
		drawString("Pr. mnd", M+B, 3*H-5);
		drawString("Pr. år", M+2*B, 3*H-5);
		drawString("Totalt", M+3*B, 3*H-5);
		drawLine(M, 3*H, 4*B, 3*H);
		for (int i=0; i<12; i++) {
			double r = 0.01 + i*0.005;
			double faktor = Math.pow((1+r),år);
			double sluttverdi = lån*faktor;
			double årBeløp = sluttverdi*r/(faktor-1);
			double mndBeløp = årBeløp/12;
			drawString(""+(int)(r*1000+0.5)/10.0, M, (i+4)*H);
			drawString(""+(int)(mndBeløp+0.5), M+B, (i+4)*H);
			drawString(""+(int)(årBeløp+0.5), M+2*B, (i+4)*H);
			drawString(""+(int)(sluttverdi+0.5), M+3*B, (i+4)*H);
		}
	}
}