package de.fhdw.bfws412aka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMoritzRechnerMain {

    public static void main(String[] args) {
        new MaxMoritzRechnerMain().run();
    }

    private void run() {
        char selection = '.';
        do {
            switch (selection) {
                case 'a':
                    new Addierer().addiere(this);
                    break;
                case 's':
                    new Subtrahierer().subtrahiere(this);
                    break;
                case 'm':
                    // here be code
                    break;
                case 'd':
                    // here be code
                    break;
                default:
                    try {
                        // comment out if not on a windows machine
                        Runtime.getRuntime().exec("cls");
                    } catch (IOException e) {
                        System.out.println("something went horribly wrong");
                    }
                    showMenu();
                    break;
            }
            System.out.print("\nAuswahl: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                selection = br.readLine().charAt(0);
            } catch (IOException exc) {
                selection = '.';
                return;
            }
        } while (selection != 'e');
        System.out.print("Farewell!");
    }

    public void showMenu() {
        System.out.println("MaxMoritzRechner - für Spitzbuben, die nicht kopfrechnen können");
        System.out.println("\na)\tAddieren");
        System.out.println("s)\tSubtrahieren");
        System.out.println("m)\tMultiplizieren");
        System.out.println("d)\tDividieren");
        System.out.println("e)\tGet the hell out of here!");
    }
}
