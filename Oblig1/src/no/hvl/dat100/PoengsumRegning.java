package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class PoengsumRegning {

	public static void main(String[] args) {

			
			for (int i=1; i<=10; i++) {
				
				String poengtxt = showInputDialog("Skriv inn din poengsum");
				
				int poeng = parseInt(poengtxt);
			
				if (poeng >= 0 && poeng <= 39) {
					
					System.out.println("Du får karakteren F");
				}
				
				else if (poeng >= 40 && poeng <= 49) {
					
					System.out.println("Du får karakteren E");
				}
				
				else if (poeng >= 50 && poeng <= 59) {
					
					System.out.println("Du får karakteren D");
				}
				else if (poeng >= 60 && poeng <= 79) {
					
					System.out.println("Du får karakteren C");
				}
				
				else if (poeng >= 80 && poeng <= 89) {
					
					System.out.println("Du får karakteren B");
				}
				
				else if (poeng >= 90 && poeng <= 100) {
					
					System.out.println("Du får karakteren A");
				}
				
				else {
					System.out.println("Ugyldig poengsum, tast inn på nytt");
					i--;
				}

			}
		
	}

}
