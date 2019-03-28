package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit04.Quadrat;
import com.hoffrogge.tetris.TetrominoL;

public class Zeichenflaeche extends Quadrat {

	public void zeichnen(Graphics graphics) {
		super.zeichnen(graphics);
		TetrominoL l = new TetrominoL(100, 100);
		l.setDurchmesser(50);
		l.setLinienFarbe(new Farbe(0, 0, 0));
		l.zeichnen(graphics);
	}

}

// github.com/HInformatikAG/Lehreinheiten.git
