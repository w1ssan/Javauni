/* Leksjon 3 oppgave 7
*Test av metoder av min-klassen
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class TestMetodeSamling {

  public static void main(String[] args) {

    out.println("skrivtegn-metoden");
    Min.skrivTegn('+',8);
    out.println();
//-----------------------------------------------------------------
    out.println("erBokstav-metoden");
    char b = '5';
    if (Min.erBokstav(b))
        out.println(b + " er en bokstav!");
    else
        out.println(b + " er ikke en bokstav");
//-----------------------------------------------------------------
    out.println("avrund1-metoden");
    out.println("123.456 = " + Min.avrund1(123.456));
    out.println();
//-----------------------------------------------------------------
    out.println("avrund2-metoden");
    out.println("123.456 = " + Min.avrund2(123.456));
    out.println();
//-----------------------------------------------------------------
    out.println("trekkTall-metoden");
    for (int i=1; i<=6; i++)
        out.print(Min.trekkTall(2,7) + " ");
//-----------------------------------------------------------------
    out.println("lesHeltall-metoden");
    int helTall = Min.lesHeltall(0,9);
    out.println("heltall lest : " + helTall);
//-----------------------------------------------------------------




/*	talltxt= showInputDialog("gi et siffer(2-9):");
	siffer = parseInt(talltxt);
*/


  }
}