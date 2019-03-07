package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.Quadrat;

/*
 * Zeichenfläche mit einer Größe von 800 x 800 Pixeln
 * @formatter:off
 *  
 *  0,0 ----------------------------------------- 800,0
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  |                                               |
 *  0,800 --------------------------------------- 800,800
 *  
 * @formater:on 
 */
public class Zeichenflaeche extends Quadrat {
	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);

		for (int i = 0; i < 800; i = i + 50) {

			Rechteck rechteck = new Rechteck(i, 0);
			rechteck.zeichnen(graphics);
		}
		for (int i = 0; i < 800; i = i + 50) {

			Rechteck rechteck = new Rechteck(0, i);
			rechteck.zeichnen(graphics);
		}

	}
}