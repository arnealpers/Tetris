package com.hoffrogge.tetris;

import java.awt.Graphics;
import java.util.ArrayList;

import com.hoffrogge.lehreinheit04.Punkt;
import com.hoffrogge.lehreinheit04.Quadrat;

public class TetrominoL extends AllgemeinerTetromino {

	public TetrominoL(int KoordinateX, int KoordinateY) {

		this.koordinateX = KoordinateX;
		this.koordinateY = KoordinateY;
	}

	@Override
	public void zeichnen(Graphics graphics) {
		ArrayList<Quadrat> arrayList = new ArrayList<Quadrat>();

		for (int i = 0; i < 4; i++) {

			Quadrat quadrat = new Quadrat();
			quadrat.setDurchmesser(durchmesser);
			quadrat.setLinienFarbe(linienFarbe);

			arrayList.add(quadrat);
		}

		arrayList.get(0).setMittelpunkt(new Punkt(koordinateX, koordinateY));
		arrayList.get(0).zeichnen(graphics);
	}

}