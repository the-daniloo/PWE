import java.util.Scanner;

public class PreenchimentoVetor {
	public static void main(String[] args) {
		
		int[] n = new int[10];
		Scanner scan = new Scanner(System.in);
		
		int v = scan.nextInt();
		
		while(!(v <= 50 && v > 0)) {
			System.out.println("Coloque um valor menor que 50 e maior que 0");
			v = scan.nextInt();
		}
		
		n[0] = v;
		System.out.println("n[0] = " + n[0]);
		
		for(int i = 1 ; i < n.length ; i++) {
			n[i] = (n[i - 1] * 2);
			System.out.println("n[" + i + "] = " + n[i]);
		}
		
	}
}
