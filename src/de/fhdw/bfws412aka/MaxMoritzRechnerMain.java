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
                    // here be code
                    break;
                case 's':
                    // here be code
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
                    System.out.println("MaxMoritzRechner - fuer Spitzbuben, die nicht kopfrechnen koennen");
                    System.out.println("\na)\tAddieren");
                    System.out.println("s)\tSubtrahieren");
                    System.out.println("m)\tMultiplizieren");
                    System.out.println("d)\tDividieren");
                    System.out.println("e)\tGet the hell out of here!");
                    System.out.print("\nAuswahl: ");
                    break;
            }
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
}
