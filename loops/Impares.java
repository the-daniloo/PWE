import java.util.Scanner;

public class Impares {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int menor, maior;
		
		if(x > y) {
			menor = y;
			maior = x;
		} else {
			menor = x;
			maior = y;
		}
		
		int impares = 0;
		for(int i = menor ; i != maior; i++) {
			if(i == maior || i == menor)
				continue;
			
			if(i % 2 != 0)
				impares += i;
		}
		
		System.out.println(impares);
		
	}
}