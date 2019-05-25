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

public class macheAuto {

    public static void main(String[] args) {
        Auto auto = new Auto();
        System.out.println(auto.getFarbe());
        System.out.println(auto.getMaxGeschw());
        System.out.println(auto.getPs());
        System.out.println(auto.getPreis());

        auto.setFarbe("blau");
        auto.setMaxGeschw(300);
        auto.setPs(200);
        auto.setPreis(100000.00);
        System.out.println(auto.getFarbe());
        System.out.println(auto.getMaxGeschw());
        System.out.println(auto.getPs());
        System.out.println(auto.getPreis());

        auto.abschreiben(9);

        Auto auto2 = new Auto("gelb", 300, 500, 200000.00);
        System.out.println(auto2.getFarbe());
        System.out.println(auto2.getMaxGeschw());
        System.out.println(auto2.getPs());
        System.out.println(auto2.getPreis());
    }

}
