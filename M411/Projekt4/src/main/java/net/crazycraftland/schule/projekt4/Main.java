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

package net.crazycraftland.schule.projekt4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        a();
    }

    private static void a() {
        System.out.println("BMI Rechner");
        double b = b();
        int c = c();
        double d = d(b,c);
        e(d);
        f(d);
    }

    private static double b() {
        System.out.print("Grösse: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n");
        return scanner.nextDouble();
    }

    private static int c() {
        System.out.print("Gewicht: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n");
        return scanner.nextInt();
    }

    private static double d(double b, int c) {
        return c / (b*b);
    }

    private static void e(double d) {
        System.out.println("BMI: " + d);
    }

    private static void f(double d) {
        System.out.println("Ergebniss:");
        if (d <= 18.5)
            System.out.println("Untergewicht");
        if (d > 18.5 && d <= 25)
            System.out.println("Normalgewicht");
        if (d > 25 && d <= 30)
            System.out.println("Übergewicht");
        if (d > 30) {
            System.out.println("Adipositas (fettleibig)");
        }
    }

}
