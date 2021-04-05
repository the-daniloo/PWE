import java.util.Scanner;

public class SelecaoEmVetor {
	public static void main(String[] args) {
		
		int[] a = new int[100];
		Scanner scan = new Scanner(System.in);
		
		String saida = "";
		for(int i = 0 ; i < a.length ; i++) {
			int input = scan.nextInt();
			a[i] = input;
			if(input <= 10)
				saida += "A[" + i + "] = " + input + "\n";
		}
		
		System.out.println(saida);
		
	}
}