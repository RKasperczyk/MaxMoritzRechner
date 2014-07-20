package de.fhdw.bfws412aka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dividierer {

    public void dividiere(MaxMoritzRechnerMain mmrm) {
        String dividend, divisor;
        char selection = '.';
        System.out.println("Bitte Dividend und Divisor eingeben; jeweils mit Return Taste bestaetigen!");
        do {
            System.out.println("Werte:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                dividend = br.readLine();
                divisor = br.readLine();
            } catch (IOException exc) {
                System.out.println("something went horribly wrong");
                return;
            }
            System.out.println(dividend + " / " + divisor + " = " + (Integer.valueOf(dividend) / Integer.valueOf(divisor)));
            System.out.println("Fuer eine weitere Multiplikation 'd' eingeben. Zum Hauptmenu mit beliebiger anderer Taste");
            System.out.print("Auswahl: ");
            try {
                selection = br.readLine().charAt(0);
            } catch (IOException exc) {
                System.out.println("something went horribly wrong");
                return;
            }
        } while (selection == 'd');
        mmrm.showMenu();
    }
}
