package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.Punkt;
import com.hoffrogge.lehreinheit04.Quadrat;

public class Zeichenflaeche extends Quadrat {

	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);

		Punkt punkt = new Punkt(1, 1);

		Quadrat quadrat = new Quadrat();
		LForm lForm = new LForm(quadrat);
		// lForm.setMittelpunkt(setMittelpunkt);
		lForm.setDurchmesser(100);
		lForm.zeichnen(graphics);

		// NormalesRechteck rechteck = new NormalesRechteck(laenge);
		// rechteck.zeichnen(graphics);

	}

}
// NormalesRechteck rechteck = new NormalesRechteck(0, i);
// rechteck.zeichnen(graphics);

// zeichnet ein Dreieck
// new Dreieck(200, 200).zeichnen(graphics);

// zeichnet ein gleichseitiges Dreieck
// new GleichseitigesDreieck(300, 300).zeichnen(graphics);

// github.com/HInformatikAG/Lehreinheiten.git
