package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("enter cliente data:");
		 System.out.print("Nome:");
		 String nome = sc.nextLine();
		 System.out.print("Email:");
		 String email = sc.nextLine();
		 System.out.print("Birth date (DD/MMD/YYYY):");
		 double  data = sc.nextInt();
		
		 System.out.println("enter order data:");
		 System.out.print("Status:");
		 String status = sc.nextLine();
		 System.out.print("How many items to this order?");
		 int numP = sc.nextInt();
		 
		 ArrayList<Integer> minhaLista = new ArrayList<>();
		
		  
		
	sc.close();	
	}
     
}
