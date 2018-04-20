package com.hoffrogge.lehreinheit04;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;

public class Quadrat implements GeometrischeFigur {

	private int mittelpunktX;
	private int mittelpunktY;
	private int kantenLaenge;

	private Farbe farbe;

	public Quadrat() {
	}

	@Override
	public void zeichnen(Graphics graphics) {

		graphics.setColor(farbe.konvertiereZuColor());

		int halbeKantenlaenge = kantenLaenge / 2;

		int linksObenX = mittelpunktX - halbeKantenlaenge;
		int linksObenY = mittelpunktY - halbeKantenlaenge;

		int rechtsObenX = mittelpunktX + halbeKantenlaenge;
		int rechtsObenY = mittelpunktY - halbeKantenlaenge;

		int rechtsUntenX = mittelpunktX + halbeKantenlaenge;
		int rechtsUntenY = mittelpunktY + halbeKantenlaenge;

		int linksUntenX = mittelpunktX - halbeKantenlaenge;
		int linksUntenY = mittelpunktY + halbeKantenlaenge;

		graphics.drawLine(linksObenX, linksObenY, rechtsObenX, rechtsObenY);
		graphics.drawLine(rechtsObenX, rechtsObenY, rechtsUntenX, rechtsUntenY);
		graphics.drawLine(rechtsUntenX, rechtsUntenY, linksUntenX, linksUntenY);
		graphics.drawLine(linksUntenX, linksUntenY, linksObenX, linksObenY);

	}

	@Override
	public void setMittelpunkt(int x, int y) {
		this.mittelpunktX = x;
		this.mittelpunktY = y;
	}

	public void setKantenLaenge(int kantenLaenge) {
		this.kantenLaenge = kantenLaenge;
	}

	@Override
	public void setLinienFarbe(Farbe farbe) {
		this.farbe = farbe;
	}
}