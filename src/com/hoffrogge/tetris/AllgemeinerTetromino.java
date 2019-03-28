package com.hoffrogge.tetris;

import java.util.List;

import com.hoffrogge.lehreinheit03.Farbe;
import com.hoffrogge.lehreinheit04.Punkt;

public abstract class AllgemeinerTetromino implements TetrominoSpielstein {
	protected int koordinateX;
	protected int koordinateY;
	protected int durchmesser;
	protected Punkt mittelPunkt;
	protected Farbe linienFarbe;
	protected int hoechstesX;
	protected int hoechstesY;

	@Override
	public void setMittelpunkt(Punkt mittelpunkt) {
		this.mittelPunkt = mittelpunkt;
	}

	@Override
	public Punkt getMittelPunkt() {
		return this.mittelPunkt;
	}

	@Override
	public void setDurchmesser(int d) {
		this.durchmesser = d;
	}

	public int getDurchmesser() {
		return durchmesser;
	}

	@Override
	public Farbe getLinienFarbe() {
		return linienFarbe;
	}

	@Override
	public void setLinienFarbe(Farbe farbe) {
		this.linienFarbe = farbe;
	}

	@Override
	public int compareTo(TetrominoSpielstein o) {
		return 0;
	}

	@Override
	public int getHoechstesY() {
		return hoechstesY;
	}

	@Override
	public int getTiefstesY() {
		return 0;
	}

	@Override
	public int getKanteLinksX() {
		return 0;
	}

	@Override
	public int getKanteRechtsX() {
		return 0;
	}

	@Override
	public int getX() {
		return 0;
	}

	@Override
	public void setX(int x) {

	}

	@Override
	public int getY() {
		return 0;
	}

	@Override
	public void setY(int y) {

	}

	@Override
	public void bewegeNachUnten() {

	}

	@Override
	public void bewegeNachRechts() {

	}

	@Override
	public void bewegeNachLinks() {

	}

	@Override
	public void rotiereNachLinks() {

	}

	@Override
	public void rotiereNachRechts() {

	}

	@Override
	public boolean faelltAuf(TetrominoSpielstein tetrominoSpielstein) {
		return false;
	}

	@Override
	public List<TetrominoSpielstein> getViertelBloecke() {
		return null;
	}

	@Override
	public Farbe getFuellFarbe() {
		return null;
	}

	@Override
	public void setFuellFarbe(Farbe farbe) {

	}

}