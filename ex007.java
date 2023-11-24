import java.util.Scanner;
public class ex007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 10;
		int a[], b[], c[], i, j;
		a = new int[TAM];
		b = new int[TAM];
		
		
		//lendo vetores
		//vetor A
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"º valor do vetor A:");
			a[i] = sc.nextInt();
		}
		
		//vetor B
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"º valor do vetor B:");
			b[i] = sc.nextInt();
		}
		
		
		//verificando se ha diferenca
		
		
	
		
		sc.close();
		
	}

}
