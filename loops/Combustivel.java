import java.util.Scanner;

public class Combustivel {
	public static void main(String[] args) {

		final int cod_alcool = 1, cod_gas = 2, cod_diesel = 3, cod_sair = 4;
		int alcool = 0, gas = 0, diesel = 0;

		int input = 0;

		Scanner scan = new Scanner(System.in);

		do {
			input = scan.nextInt();

			if(input == cod_alcool)
				alcool++;
			else if(input == cod_gas)
				gas++;
			else if(input == cod_diesel)
				diesel++;
		} while(input != cod_sair);

		System.out.println("Alcool: " + alcool + "\nGasolina: " + gas + "\nDiesel: " + diesel);

	}
}