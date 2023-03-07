package selenium;

import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			System.out.println("enter first number");
			int a=scan.nextInt();
			System.out.println("enter second number");
			int b=scan.nextInt();
			if(a>b) {
				System.out.println("given big number:"+a);
			}
			else {
				System.out.println("given big number:"+b);
			}
		}
			

	}

}
