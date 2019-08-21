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

package net.crazycraftland.schule.projekt1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------------");
        System.out.println("Menu:");
        System.out.println("1 - Uebung Nr. 1");
        System.out.println("2 - Uebung Nr. 2");
        System.out.println("3 - Uebung Nr. 3");
        System.out.println("4 - Uebung Nr. 4");
        System.out.println("5 - Benden");
        System.out.println("--------------------------------------------");

        i = scanner.nextInt();

        switch (i) {
            case 1:
                auf1();
                break;
            case 2:
                auf2();
                break;
            case 3:
                auf3();
                break;
            case 4:
                auf4();
                break;
            case 5:
                System.exit(1);
                break;
            default:
                System.out.println("Unbekannte Zahl!");
                break;
        }
        menu();
    }

    private static void auf1() {
        int i, j;
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------------");
        System.out.println("Uebung Nr. 1");
        System.out.println("--------------------------------------------");

        System.out.print("Geben sie eine Zahl (1) ein: ");
        i = scanner.nextInt();
        System.out.print("Geben sie eine Zahl (2) ein: ");
        j = scanner.nextInt();

        System.out.println("Die Zahl (1) hat den Wert " + i);
        System.out.println("Die Zahl (2) hat den Wert " + j);

        System.out.println("Summe: " + (i+j));
        System.out.println("Differenz: " + (i-j));
        System.out.println("Produkt: " + (i*j));
        System.out.println("Quotient: " + (i/j));
        menu();
    }

    private static void auf2() {
        int i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------------");
        System.out.println("Uebung Nr. 2:");
        System.out.println("1 - [1 - 5]");
        System.out.println("2 - [5 - 1]");
        System.out.println("3 - [1 - 100]");
        System.out.println("4 - [100 - 1]");
        System.out.println("5 - Menu");
        System.out.println("--------------------------------------------");

        i = scanner.nextInt();

        switch (i) {
            case 1:
                for (int j=1;j<6;j++) {
                    System.out.println(j);
                }
                break;
            case 2:
                for (int j=1;j<6;j++) {
                    System.out.println(j);
                }
                break;
            case 3:
                for (int j=1;j<101;j++) {
                    System.out.println(j);
                }
                break;
            case 4:
                for (int j=100;j>0;j--) {
                    System.out.println(j);
                }
                break;
            case 5:
                menu();
                break;
            default:
                System.out.println("Unbekannte Zahl!");
                break;
        }
        auf2();
    }

    private static void auf3() {
        int i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------------");
        System.out.println("Uebung Nr. 3:");
        System.out.println("1 - [12 - 88]");
        System.out.println("2 - [312 - 637]");
        System.out.println("3 - Menu");
        System.out.println("--------------------------------------------");

        i = scanner.nextInt();
        switch (i) {
            case 1:
                for(int j=12;j<89;j++) {
                    if (j%2 == 0)
                        System.out.println(j);
                }
                break;
            case 2:
                for(int j=312;j<638;j++) {
                    if (j%17 == 0)
                        System.out.println(j);
                }
                break;
            case 3:
                menu();
                break;
        }
        auf3();
    }

    private static void auf4() {
        int r;
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------------");
        System.out.println("Uebung Nr. 4");
        System.out.println("1 - Umfang");
        System.out.println("2 - Flaeche");
        System.out.println("3 - Menu");
        System.out.println("--------------------------------------------");

        r = scanner.nextInt();
        switch (r) {
            case 1:
                System.out.print("Radius: ");
                r = scanner.nextInt();

                System.out.println("Umfang: " + 2*r*Math.PI);
                break;
            case 2:
                System.out.print("Radius: ");
                r = scanner.nextInt();

                System.out.println("Flaeche: "+ r*r*Math.PI);
                break;
            case 3:
                menu();
                break;
        }
        auf4();
    }

}
