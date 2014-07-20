package de.fhdw.bfws412aka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplizierer {

    public void multipliziere(MaxMoritzRechnerMain mmrm) {
        String faktor1, faktor2;
        char selection = '.';
        System.out.println("Bitte die beiden Faktoren eingeben; jeweils mit Return Taste bestaetigen!");
        do {
            System.out.println("Faktoren:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                faktor1 = br.readLine();
                faktor2 = br.readLine();
            } catch (IOException exc) {
                System.out.println("something went horribly wrong");
                return;
            }
            System.out.println(faktor1 + " * " + faktor2 + " = " + (Integer.valueOf(faktor1) * Integer.valueOf(faktor2)));
            System.out.println("Fuer eine weitere Multiplikation 'm' eingeben. Zum Hauptmenu mit beliebiger anderer Taste");
            System.out.print("Auswahl: ");
            try {
                selection = br.readLine().charAt(0);
            } catch (IOException exc) {
                System.out.println("something went horribly wrong");
                return;
            }
        } while (selection == 'm');
        mmrm.showMenu();
    }
}
