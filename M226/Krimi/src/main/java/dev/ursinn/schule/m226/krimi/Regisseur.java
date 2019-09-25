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

package dev.ursinn.schule.m226.krimi;

public class Regisseur {

	public void go() {
		System.out.println("Klappe, die erste, Action...");

		Moerder bill = new Moerder();
		Opfer johnny = new Opfer();

		johnny.hilfeRufen();
		bill.zustechen();
		johnny.schreien();
		bill.sadistischGrinsen();

		for (int i = 0; i < 5; i++) {
			bill.zustechen();
		}

		johnny.stoehnen();
		bill.sadistischGrinsen();
		johnny.sterben();
		bill.wegrennen();

		Zeuge[] zeuge = new Zeuge[10];

		zeuge[0] = new Zeuge();
		zeuge[1] = new Zeuge();
		zeuge[0].setAussage("Er ist dorthin gerannt");
		zeuge[1].setAussage("Er ist gross und blond.");
		Polizist hercule = new Polizist();

		for (int i = 0; i < 2; i++) {
			hercule.zeugeBefragen(zeuge[i]);
		}

		hercule.verfolgen();
		bill.wegrennen();
		hercule.verfolgen();
		hercule.verhaften();
	}

	public void stop() {
		System.out.println("Alles im Kasten. Szene gestorben.");
	}

}
