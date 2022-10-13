package Calculator;

public class Equation {
	double num1;
	double num2;
	
	public Equation(double a, double b){
		num1 = a;
		num2 = b;
	}
	
	public double addition(double a, double b) {
		double addResult = a+b;
		return addResult;
	}
	public double subtract(double a, double b) {
		double subtractResult = a-b;
		return subtractResult;
	}
	public double multiply(double a, double b) {
		double multiplyResult = a*b;
		return multiplyResult;
	}
	public double divide(double a, double b) {
		double divideResult = a/b;
		return divideResult;
	}
}
