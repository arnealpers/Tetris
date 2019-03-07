package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit04.Punkt;

public class NormalesRechteck {

	Punkt punkt;
	int laenge;

	public NormalesRechteck(Punkt punkt) {

		this.punkt = punkt;

	}

	public NormalesRechteck(int laenge) {

		this.laenge = laenge;
	}

	public void zeichnen(Graphics graphics) {

		graphics.drawLine(punkt.getX(), punkt.getY(), punkt.getX() + laenge, punkt.getY() + laenge);
		// graphics.drawLine();
		// graphics.drawLine();
		// graphics.drawLine();

	}
}
