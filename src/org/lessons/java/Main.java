package org.lessons.java;

import java.util.Scanner;

import org.lessons.java.geometria.Rettangolo;

public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			
			System.out.println("inserire base per il rettangolo 1:");
			int base1 = sc.nextInt();
			System.out.println("inserire altezza per il rettangolo 1:");
			int altezza1 = sc.nextInt();
			
			System.out.println("inserire base per il rettangolo 2:");
			int base2 = sc.nextInt();
			System.out.println("inserire altezza per il rettangolo 2:");
			int altezza2 = sc.nextInt();
			
			System.out.println("inserire base per il rettangolo 3:");
			int base3 = sc.nextInt();
			System.out.println("inserire altezza per il rettangolo 3:");
			int altezza3 = sc.nextInt();
				
			Rettangolo ret1 = new Rettangolo(base1, altezza1);
			Rettangolo ret2 = new Rettangolo(base2, altezza2);
			Rettangolo ret3 = new Rettangolo(base3, altezza3);
					
			System.out.println("\n----Rettangolo 1----\n");
			ret1.Print();
			System.out.println("\n----Rettangolo 2----\n");
			ret2.Print();	
			System.out.println("\n----Rettangolo 3----\n");
			ret3.Print();		
			sc.close();
	}
}
