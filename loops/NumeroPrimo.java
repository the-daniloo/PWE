public class NumeroPrimo {
	public static void main(String[] args) {
		
		int input = 0;

		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();

		String resultado = "";
		for(int index = 1 ; index <= input ; index++) {
			int num = scan.nextInt();
			
			int contador = 0;
			for(int i  = num ; i > 0 ; i--) {
				if(num % i == 0)
					contador++;
			}
			
			if(contador == 2) // divisivel por 1 e ele mesmo
				resultado += num + " é um numero primo\n";
			else 
				resultado += num + " não é um numero primo\n";
		}
		
		System.out.println(resultado);

	}
}