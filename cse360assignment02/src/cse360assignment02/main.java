package cse360assignment02;

public class main {

	public static void main(String[] args) {
		AddingMachine calculator = new AddingMachine();
		calculator.add(4);
		calculator.subtract(2);
		calculator.add(5);
		System.out.println(calculator.toString());
	}

}
