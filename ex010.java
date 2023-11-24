import java.util.Scanner;
public class ex010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 10;
		int a[], b[], i, j, menor=0, maior=0, aux=0;
		a = new int[TAM];
		b = new int [TAM];
		
		//ler vetor A e calcular B
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"º valor:");
			a[i] = sc.nextInt();
			
		}
		
		
		
		
		//apresentando vetor A
		System.out.print("A = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		
		
		
		
		
		for(i=0; i<TAM; i++) {
			for(j=0; j<TAM; j++) {
				if(a[i] < a[j]) {
					aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
			}
		}
		
		
		
		
				
		//apresentando vetor B
		System.out.print("B = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		
		
		
	}

}
