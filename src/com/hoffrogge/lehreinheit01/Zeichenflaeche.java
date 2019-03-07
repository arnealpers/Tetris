package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.Quadrat;

public class Zeichenflaeche extends Quadrat {

	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);

		int laenge = 100;

		NormalesRechteck rechteck = new NormalesRechteck(laenge);
		rechteck.zeichnen(graphics);

	}

}
// NormalesRechteck rechteck = new NormalesRechteck(0, i);
// rechteck.zeichnen(graphics);

// zeichnet ein Dreieck
// new Dreieck(200, 200).zeichnen(graphics);

// zeichnet ein gleichseitiges Dreieck
// new GleichseitigesDreieck(300, 300).zeichnen(graphics);

// github.com/HInformatikAG/Lehreinheiten.git
