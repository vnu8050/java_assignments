package com;

public class Primenumber {

	public static void main(String[] args) {
		int n=18;
		int m=n/2;
		boolean flag=false;
		if(n == 0 || n == 1) {
			System.out.println("Number is not a prime");
			
		}
		else {
			for(int i=2; i<=m; i++) {
				if(n%i ==0) {
					System.out.println("Number is not a prime");
					flag = true;
					break;
				}
			}
			if(flag == false)
			{
				System.out.println("Number is a prime");
				}
			}

	}

}
