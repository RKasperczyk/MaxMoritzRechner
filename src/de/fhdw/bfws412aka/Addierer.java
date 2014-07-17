package de.fhdw.bfws412aka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addierer {

    public void addiere(MaxMoritzRechnerMain mmrm) {
        String summand1, summand2;
        char selection = '.';
        System.out.println("Bitte die beiden Summanden eingeben; jeweils mit Return Taste bestaetigen!");
        do {
            System.out.println("Summanden:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                summand1 = br.readLine();
                summand2 = br.readLine();
            } catch (IOException exc) {
                System.out.println("something went horribly wrong");
                return;
            }
            System.out.println(summand1 + " + " + summand2 + " = " + (Integer.valueOf(summand1) + Integer.valueOf(summand2)));
            System.out.println("Fuer eine weitere Addition 'a' eingeben. Zum Hauptmenu mit beliebiger anderer Taste");
            System.out.print("Auswahl: ");
            try {
                selection = br.readLine().charAt(0);
            } catch (IOException exc) {
                System.out.println("something went horribly wrong");
                return;
            }
        } while (selection == 'a');
        mmrm.showMenu();
    }
}
