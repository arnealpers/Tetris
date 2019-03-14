package com.hoffrogge.lehreinheit01;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit04.GeometrischeFigur;
import com.hoffrogge.lehreinheit04.Punkt;
import com.hoffrogge.lehreinheit04.Quadrat;

public class LForm implements GeometrischeFigur {

	private Punkt mittelpunkt;
	private Quadrat quadrat;
	private int durchmesser;

	public LForm(Quadrat setQuadrat) {
		this.quadrat = setQuadrat;

	}

	@Override
	public void setMittelpunkt(Punkt setMittelpunkt) {
		this.mittelpunkt = setMittelpunkt;
	}

	@Override
	public Punkt getMittelPunkt() {
		return mittelpunkt;
	}

	@Override
	public void setDurchmesser(int d) {
		durchmesser = d;
	}

	@Override
	public Farbe getLinienFarbe() {
		return null;
	}

	@Override
	public void setLinienFarbe(Farbe farbe) {

	}

	@Override
	public void zeichnen(Graphics graphics) {
		quadrat.setDurchmesser(durchmesser);
		quadrat.setLinienFarbe(new Farbe(255, 0, 0));
		quadrat.zeichnen(graphics);
	}

}
