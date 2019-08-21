/*
 * This is free and unencumbered software released into the public domain.
 *
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 *
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * For more information, please refer to <http://unlicense.org>
 */

package net.crazycraftland.schule.projekt3;

import java.util.Scanner;

public class Main {

    //Wird beim Starten ausgeführt
    public static void main(String[] args) {
        showDesc();//Zeigt die Beschreibung
        rounds();//Das Game
    }

    private static void rounds() {
        int max = 10;//Maximale Zahl
        int count;//Versuche
        int rounds = 1;//Runde
        int r;//Random Zahl
        int i;//User Tipp
        while (true) {
            System.out.println("Game Runde: " + rounds);
            count = 1;//Versuche auf 1 Setzen
            r = random(max);//Random Zahl Speicher
            i = getInt(max);//User Tipp Speichern
            boolean check = check(r, i, count);//Status Speichern
            while (!check) {//Wen nicht richtig
                i = getInt(max);//User Tipp Speichern
                check = check(r, i, ++count);//Status Speichern
            }
            rounds++;//Runde+1
        }
    }

    //Zeigt die Beschreibung
    private static void showDesc() {
        System.out.println("Tipp Game");
        System.out.println("---------");
    }

    //Generiert Random Zahl
    private static int random(int max) {
        return 1 + (int)(Math.random() * max);
    }

    //User Tipp
    private static int getInt(int max) {
        String s = "Bitte geben sie eine Zahl zwischen 1 und " + max + " ein:";
        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i > max) { //Tipp zahl zu Gross
            System.out.println("Fehler: (0x001) Zahl Grösser als " + max);
            return 0;
        }
        return i;
    }

    //Prüft ob Tipp Stimmt
    private static boolean check(int r, int i, int count) {
        if (i == 0) //Für Fehler (0x001)
            return false;
        if (r == i) { //Gewonnen
            System.out.println("Herzlichen Glückwunsch, Sie haben richtig getippt");
            System.out.println("Sie haben " + count + " Versuche gebraucht.");
            System.out.println("-------------------------------------------------");
            return true;
        }
        //Verloren
        System.out.println("Ihr Tipp war leider falsch");
        return false;
    }
}
