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

package net.crazycraftland.schule.projekt2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //u5();
        //u6a();
        //u6b();
        //u6c();
        u6d();
    }

    private static void u5() {
        // a)
        System.out.println("Method a)");
        for(int i=1; i<26; i++) {
            System.out.println(i);;
        }

        // b)
        System.out.println("Method b)");
        int b = 1;
        while(b<26) {
            System.out.println(b);
            b++;
        }

        // c)
        System.out.println("Method c)");
        int c = 1;
        do {
            System.out.println(c);
            c++;
        } while (c<26);
    }

    private static void u6a() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();
        if (i<50) {
            i = i+3;
        } else {
            i = i-50;
        }

        System.out.println(i);
    }

    private static void u6b() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();
        if (i<50) {
            i = i+3;
            System.out.println(i);
        } else if (i==50) {
            System.out.println("Zahl ist 50");
        } else {
            i = i-50;
            System.out.println(i);
        }
    }

    private static void u6c() {
        u6cd();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 0:
                System.out.println("Programm wird beendet");
                break;
            case 1:
                System.out.print("Zahl eingeben: ");
                Scanner sc1 = new Scanner(System.in);
                int j1 = sc1.nextInt();
                sc1.close();
                System.out.println(j1*j1*j1);
                break;
            case 2:
                System.out.print("Zahl eingeben: ");
                Scanner sc2 = new Scanner(System.in);
                int j2 = sc2.nextInt();
                sc2.close();
                System.out.println(1/j2);
                break;
            case 3:
                for(int j=3; j<=60; j=j+3) {
                    System.out.println(j);
                }
                break;
        }
    }

    private static void u6d() {
        u6cd();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            default:
                System.out.println("Fehler: Zahl nicht bekannt");
                u6d();
                break;
            case 0:
                System.out.println("Programm wird beendet");
                break;
            case 1:
                System.out.print("Zahl eingeben: ");
                Scanner sc1 = new Scanner(System.in);
                int j1 = sc1.nextInt();
                sc1.close();
                System.out.println(j1*j1*j1);
                break;
            case 2:
                System.out.print("Zahl eingeben: ");
                Scanner sc2 = new Scanner(System.in);
                int j2 = sc2.nextInt();
                sc2.close();
                System.out.println(1/j2);
                break;
            case 3:
                for(int j=3; j<=60; j=j+3) {
                    System.out.println(j);
                }
                break;
        }
    }

    private static void u6cd() {
        System.out.println("0 - Programm wird beendet");
        System.out.println("1 - Zahl Eingeben - x*x*x");
        System.out.println("2 - Zahl Eingeben - 1/x");
        System.out.println("3 - 3er Reihe bis 60");
    }

}
