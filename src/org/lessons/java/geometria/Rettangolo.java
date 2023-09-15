package org.lessons.java.geometria;

public class Rettangolo {
		public	int base;
		public	int altezza;
		int perimetro;
		int area;

		public Rettangolo (int base, int altezza) {
			this.base = base;
			this.altezza = altezza;
	
		}
		
		public void calcolaPerimetro() {
			
			perimetro = (base + altezza)*2;
							
		}
		
		public void calcolaArea () {
			 area = base*altezza;
		}
		
		public void Print() {
			calcolaPerimetro();
			calcolaArea();
			
			System.out.println("base: " + base);
			System.out.println("altezza: " + altezza);
			System.out.println("\nperimetro: " + perimetro);
			System.out.println("area: " + area + "\n");
			
			Disegna();
		}
		
		public void Disegna() {
		    for (int i = 0; i < base; i++) {
		        System.out.print("0");
		    }
		    System.out.println();
		    
		    for (int i = 1; i < altezza - 1; i++) {
		        System.out.print("0");
		        for (int x = 1; x < base - 1; x++) {
		            System.out.print(" ");
		        }
		        System.out.println("0");
		    }
		    
		    for (int i = 0; i < base; i++) {
		        System.out.print("0");
		    }
		    System.out.println(); 
		}


}
