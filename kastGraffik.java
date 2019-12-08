/* Leksjon3 :eksamenoppgave oppgave 13
*simulerer kast med to terninger og
*teller sum øyne(2-12)
*presenterer kastresultat i et diagram,
*der lengden på søylene tilsvarer antall
*av hver opnådd mål
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class kastGraffik extends EasyGraphics {

  public static void main(String[] args) {
    launch(args);
  }

  public void run() {
    final int WIN_X = 600, WIN_Y = 600;
    makeWindow("sum øyne i to terningskast", WIN_X, WIN_Y);
    //telle tabell
    int [] antallAv = new int[13]; //indekser 2-12 0 og 1 er ubrukt


    //les inn
    String tallTxt = getText("Gi en antall");
    int antkast = parseInt(tallTxt);

    //teller sum øyner
    for (int i = 1; i<=antkast; i++) {
      int øyne1 = Min.trekkTall(1, 6);
      int øyne2 = Min.trekkTall(1, 6);
      int sumØyne = øyne1+øyne2;
      antallAv[sumØyne]++; 
    }
    // grafisk presentasjon 
    setFont("arial",32);
    drawString("kastresultat: sum øyne", 50, 50);
    int h = 25;
    for (int sumØyne = 2; sumØyne <= 12; sumØyne++) {  
      setColor(0, 0, 0);
      drawString(""+ sumØyne, 50, 40 *sumØyne);
      int b = antallAv[sumØyne]*5;
      setColor(0, 0, 255);
      fillRectangle(50+50, 40* sumØyne-h, b, h);
    }
  }
}
