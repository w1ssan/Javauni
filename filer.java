import java.io.*;
import static java.lang.System.*;

public class filer{
	public static void main(String[] args) throws Exception {
		File katalog = new File(katNavn);
		if ( !katalog.exists() )
			out.println(katNavn + "finnes ikke.");
		else
			if (!katalog.isDirectory())
				out.println(katNavn + " er en fil.");
			else {
				String[] filer = katalog.list();
				for (String filnavn: filer)
					out.println(filnavn);
			}
	}
}