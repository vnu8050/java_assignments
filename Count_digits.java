package Count_digits;

public class Count_digits {

	public static void main(String[] args) {
		
				int num = 2345678;
				System.out.println("The number is "+ num);
				int count = 0;
				while (num!=0) {
					num = num/10;
					count++;
				}
				System.out.println("The no. of digits are " + count);
				
			}
			
		}
	


