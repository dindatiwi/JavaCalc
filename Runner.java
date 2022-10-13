package Calculator;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    double a = 0;
	    double b = 0;
		try {
			System.out.println("Masukan angka pertama :");
			a = input.nextDouble();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Masukan angka benar");
		}
	    
		try {
			System.out.println("Masukan angka kedua :");
			b = input.nextDouble();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Masukan angka benar");
		}
	    
	    Equation equation = new Equation(a,b); //construction


		int operator = 0;
	    
	    do {
			System.out.println("1. Pertambahan");
			System.out.println("2. Pengurangan");
			System.out.println("3. Perkalian");
			System.out.println("4. Pembagian");
			System.out.println("5. Keluar");
			try {
				System.out.println("Pilih operasi yang ingin dilakukan :");
				operator = input.nextInt();
				switch (operator) {
				// performs addition between numbers
				case 1:
					double addOutput = equation.addition(a, b);
					System.out.println("Hasilnya adalah " + a + " + " + b + " = " + addOutput);
					break;

				// performs subtraction between numbers
				case 2:
					double subtractOutput = equation.subtract(a, b);
					System.out.println("Hasilnya adalah " + a + " - " + b + " = " + subtractOutput);
					break;

				// performs multiplication between numbers
				case 3:
					double multiplyOutput = equation.multiply(a, b);
					System.out.println("Hasilnya adalah " + a + " x " + b + " = " + multiplyOutput);
					break;
				// performs division between numbers
				case 4:
					double divideOutput = equation.divide(a, b);
					System.out.println("Hasilnya adalah " + a + " / " + b + " = " + divideOutput);
					break;
					
				case 5:
					break;

				default:
					System.out.println("Masukan pilihan yang benar");
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Masukan angka pilihan yang benar");
			} 
		} while (operator != 5);
	}

}
