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

package net.crazycraftland.schule.projekt6;

public class Auto {

    private String farbe;
    private int ps;
    private int maxGeschw;
    private double preis;

    public Auto() {
        farbe = "rot";
        maxGeschw = 200;
        preis = 23000.00;
        ps = 180;
    }

    public Auto(String farbe, int ps, int maxGeschw, double preis) {
        this.farbe = farbe;
        this.ps = ps;
        this.maxGeschw = maxGeschw;
        this.preis = preis;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public void setMaxGeschw(int maxGeschw) {
        this.maxGeschw = maxGeschw;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getPs() {
        return ps;
    }

    public int getMaxGeschw() {
        return maxGeschw;
    }

    public double getPreis() {
        return preis;
    }

    public void abschreiben(int alter) {
        if (alter < 10)
            System.out.println(preis - preis/10 * alter);
        else System.out.println(0);
    }
}
