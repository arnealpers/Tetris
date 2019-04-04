package com.hoffrogge.lehreinheit07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JLabel;

public class DemoKeyListener implements KeyListener {
	private ArrayList<Integer> arrayList = new ArrayList<Integer>();
	private int input;
	private JLabel textLabel;
	private int zaehler = 0;
	private int summe = 0;

	public DemoKeyListener(JLabel textLabel) {
		this.textLabel = textLabel;
	}

	@Override
	public void keyPressed(KeyEvent e) {

		setInput(e, "gedrückt");

		/* Mit der Esc-Taste das Programm beenden */
		if (KeyEvent.VK_ESCAPE == e.getKeyCode())
			System.exit(0);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// gebeTasteAus(e, "losgelassen");
	}

	private void setInput(KeyEvent e, String eventArt) {

		input = e.getKeyChar() - 48;
		if (input > 0 && input < 9) {
			arrayList.add(input);
		} else if (input == -5) {
			System.out.println("leerzeichen gedrückt");
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// nichts machen
	}

	public void addiereZahlen() {

	}
}