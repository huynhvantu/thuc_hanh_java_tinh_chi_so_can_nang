package thuc_hanh_tinh_chi_so_can_nang;

import java.util.Scanner;

public class thuchanhtinhchisocannang {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double weight, height, bmi;
		System.out.println("Your weight(in kilogram):");
		weight = scanner.nextDouble();
		
		System.out.println("Your height (in meter):");
		height = scanner.nextDouble();
		
		bmi = weight/Math.pow(height,2);
		
		
		if(bmi< 18) {
			System.out.println("Chi so can nang la: " + bmi + " Underweight");			
		}else if(bmi<25.0) {
			System.out.println("Chi so can nang la: " + bmi + " Normal");
		}else if(bmi<30.0) {
			System.out.println("Chi so can nang la: "+ bmi + " Overweight");
		}else {
			System.out.println("Chi so can nang la: "+bmi+" Obese");
		}

	}

}
