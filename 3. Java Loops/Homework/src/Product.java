import java.util.Scanner;


public class Product {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int numberAx = input.nextInt();
		int numberAy = input.nextInt();
		int numberBx = input.nextInt();
		int numberBy = input.nextInt();
		int numberCx = input.nextInt();
		int numberCy = input.nextInt();
		int area = (numberAx*(numberBy-numberCy) 
				+ numberBx*(numberCy-numberAy) 
				+ numberCx*(numberAy-numberBy))/2;
		
		System.out.println(area);
	}

}
