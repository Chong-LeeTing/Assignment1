package assignment1;

import java.util.*;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Personal Background" );
		System.out.print("Enter your name");
		String name = in.next();
		System.out.println("Name: "+name);
		
		System.out.print("Enter your gender");
		String str = in.next();
		char gender = str.charAt(0);
		System.out.println("Gender: "+gender);
		
		System.out.print("Enter your age");
		int age = in.nextInt();
		System.out.println("Age: "+age);
		
		System.out.print("Enter your IC number");
		String ic = in.next();
		System.out.println("IC no: "+ic);
		
		System.out.print("Enter your matric number");
		int matric = in.nextInt();
		System.out.println("Matric no: "+matric);
		
		System.out.print("Enter your phone number");
		String phone = in.next();
		System.out.println("Phone no: "+phone);
		
		System.out.print("Enter your email");
		String email = in.next();
		System.out.println("Email: "+email);
		
		System.out.println("Services provided in University Health Centre");
		for(int i = 0;i < 5;i++) {
			String service = in.next();	
		}
		
		System.out.println("Charges");
		
		
		
		
		
		
	}

}
