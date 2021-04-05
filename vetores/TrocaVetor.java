import java.util.Scanner;

public class TrocaVetor {
	public static void main(String[] args) {
		
		int[] n = new int[20];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < n.length ; i++)
			n[i] = scan.nextInt();
		
		int index = 0;
		int findex = n.length - 1;
		while(index < (n.length / 2)) {
			int a = n[findex];
			n[findex] = n[index];
			n[index] = a;
			
			index++;
			findex--;
		}
		
		for(int i = 0 ; i < n.length ; i++)
			System.out.println("N[" + i + "] = " + n[i]);
		
	}
}
