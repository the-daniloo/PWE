import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[scan.nextInt()];
		
		for(int i = 0 ; i < vetor.length ; i++) {
			vetor[i] = scan.nextInt();
		}
		
		int menor = vetor[0];
		int posMenor = 0;
		for(int i = 1 ; i < vetor.length ; i++) {
			if(vetor[i] < menor) {
				menor = vetor[i];
				posMenor = i;
			}
		}
		
		System.out.println("Menor valor: " + menor + "\nPosição: " + posMenor);
		
	}
}
