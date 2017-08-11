package controll;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("Numero:");
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		double raiz = raizQ(num);
		System.out.println(raiz);

	}
	
	public static double raizQ(double num){
		double mediumPoint;
		double limitMin = 0;
		double limitMax = num;
		do{
			mediumPoint = (limitMax + limitMin)/2;
			double result = mediumPoint*mediumPoint;
			if(result < num){
				limitMin = mediumPoint;
			}else{
				limitMax = mediumPoint;
			}
		}
		while((limitMax - limitMin) > 0.0000001);
		
		return mediumPoint;		
	}
}
