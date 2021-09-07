package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class ObligO3 {

	public static void main(String[] args) {

		String faktxt = showInputDialog("Skriv inn et tall");

		int n = parseInt(faktxt);

		int fak = 1;

		for (int i = 1; i <= n; ++i) {

			fak *= i;
		}
		System.out.println(fak);
	}
}
