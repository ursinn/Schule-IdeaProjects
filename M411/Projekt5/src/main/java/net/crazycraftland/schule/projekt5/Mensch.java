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

package net.crazycraftland.schule.projekt5;

public class Mensch {

    private int groesse;
    private double gewicht;
    private String haarfarbe, augenfarbe, geschlecht, vorname, nachname;

    public Mensch(int groesse, double gewicht, String haarfarbe, String augenfarbe, String geschlecht, String vorname, String nachname) {
        this.groesse = groesse;
        this.gewicht = gewicht;
        this.haarfarbe = haarfarbe;
        this.augenfarbe = augenfarbe;
        this.geschlecht = geschlecht;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public void printMensch() {
        System.out.println("Groesse: " + groesse);
        System.out.println("Gewicht: " + gewicht);
        System.out.println("Haarfarbe: " + haarfarbe);
        System.out.println("Augenfarbe: " + augenfarbe);
        System.out.println("Geschlecht: " + geschlecht);
        System.out.println("Vorname: " + vorname);
        System.out.println("Nachname: " + nachname);
    }
}
