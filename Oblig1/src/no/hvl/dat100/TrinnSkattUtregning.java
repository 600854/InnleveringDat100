package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class TrinnSkattUtregning {

	public static void main(String[] args) {

		String lonntxt = showInputDialog("Skriv inn bruttolønn");
		
		int lonn = parseInt(lonntxt);
		
		double trinn1 = 0.0093;
		double trinn2 = 0.0241;
		double trinn3 = 0.1152;
		double trinn4 = 0.1452;
		
		int skattefritt = 164100;
		
		if (lonn >= 0 && lonn <= 164100) {
			
			System.out.println("Du må ikke betale trinnskatt");
		}
		
		else if (lonn >= 164101 && lonn <= 230950) {
			
			System.out.println("Du har nivå 1 trinnskatt og må betale: " + (lonn-skattefritt)*trinn1 + " i skatt");
		}
		
		else if (lonn >= 230951 && lonn <= 580650) {
			
			System.out.println("Du har nivå 2 trinnskatt og må betale: " + (lonn-skattefritt)*trinn2 + " i skatt");
		}
		else if (lonn >= 580651 && lonn <= 934050) {
			
			System.out.println("Du har nivå 3 trinnskatt og må betale: " + (lonn-skattefritt)*trinn3 + " i skatt");
		}
		
		else if (lonn >= 934051) {
			
			System.out.println("Du har nivå 4 trinnskatt og må betale: " + (lonn-skattefritt)*trinn4 + " i skatt");
		}
		
		else {
			System.out.println("Ugyldig bruttolønn");
		}
	}

}
