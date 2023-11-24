import java.util.Scanner;
public class ex004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		final int TAM = 11;
		int a[], i;
		a = new int[TAM];
		
		
		
		//ler vetor A e acrescentar vetor B		
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
			a[i] = (2*2)*i;
		}
		
		
		//apresentando vetor A
		System.out.println("Vetor com expoente de base dois: ");
		System.out.print("A = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		
		
		
		
		sc.close();
	}
}
