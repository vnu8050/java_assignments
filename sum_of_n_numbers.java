package com;

public class sum_of_n_numbers {

	public static void main(String[] args) {
		int arr[] = {23,35,62,78,65};
		int l = arr.length;
		int sum=0;
		for (int i=0; i<l ;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
