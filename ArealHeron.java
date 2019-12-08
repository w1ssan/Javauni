// Skipper programforklaring her
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class ArealHeron {
	public static void main(String[] args) {
		double a, b, c;
		do {
			a = parseInt( showInputDialog("Gi første sidelengde: a = ") );
			b = parseInt( showInputDialog("Gi andre sidelengde: b = ") );
			c = parseInt( showInputDialog("Gi tredje sidelengde: c = ") );
		} while (a <= 0 || b <= 0 || c <= 0);
		double s = (a + b + c)/2;
		double produkt = s*(s-a)*(s-b)*(s-c);
		String ut = "";
		if ( produkt <= 0 )
			ut = "Dette er ikke sidelengder i en trekant!";
		else {
			double areal = Math.sqrt(produkt);
			areal = (int)(areal*100 + 0.5)/100; // Min.avrund2(areal);
			ut = "Trekant med sidelengder: "+a+", "+b+" og "+c+ "\n"
			+ "Areal: " + areal;
		}
		showMessageDialog(null, ut);
	}
}