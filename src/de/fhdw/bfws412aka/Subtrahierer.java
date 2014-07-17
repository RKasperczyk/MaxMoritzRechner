package de.fhdw.bfws412aka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subtrahierer {

    public void subtrahiere(MaxMoritzRechnerMain mmrm) {
        String minuend, subtrahend;
        char selection = '.';
        System.out.println("Bitte Minuend und Subtrahend eingeben; jeweils mit Return Taste bestaetigen!");
        do {
            System.out.println("Werte:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                minuend = br.readLine();
                subtrahend = br.readLine();
            } catch (IOException exc) {
                System.out.println("something went horribly wrong");
                return;
            }
            System.out.println(minuend + " - " + subtrahend + " = " + (Integer.valueOf(minuend) - Integer.valueOf(subtrahend)));
            System.out.println("Fuer eine weitere Subtraktion 's' eingeben. Zum Hauptmenu mit beliebiger anderer Taste");
            System.out.print("Auswahl: ");
            try {
                selection = br.readLine().charAt(0);
            } catch (IOException exc) {
                System.out.println("something went horribly wrong");
                return;
            }
        } while (selection == 's');
        mmrm.showMenu();
    }
}
