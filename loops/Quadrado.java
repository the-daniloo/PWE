import java.util.Scanner;

public class Quadrado {
	public static void main(String[] args) {
		int input, n1, n2;

		Scanner scan = new Scanner(System.in);

		input = scan.nextInt();
		
		if((input < 1) || (input > 1000))
			System.out.println("Valor de entrada inválido");

		int index = 1;
		while(index <= input) {
			n1 = (int) Math.pow(index, 2);
			n2 = (int) Math.pow(index, 3);

			System.out.println(index + " " + n1 + " " + n2);
			
			index++;
		}
	}
}