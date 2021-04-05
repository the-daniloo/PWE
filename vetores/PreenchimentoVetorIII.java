import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		double[] n = new double[100];
		Scanner scan = new Scanner(System.in);
		
		n[0] = scan.nextDouble();
		
		for(int i = 1 ; i < n.length ; i++) {
			n[i] = n[i - 1] / 2;
			System.out.println("N[" + i + "] = " + n[i]);
		}
		
	}
}
