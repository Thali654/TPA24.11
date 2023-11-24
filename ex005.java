import java.util.Scanner;
public class ex005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 5;
		int a[], b[], i, j;
		a = new int[TAM];
		b = new int[TAM];
		
		
		
		//lendo vetor a
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"º valor:");
			a[i] = sc.nextInt();
		}

		
		
		
		
		//calculo
		for(i=0; i<TAM; i++) {
			int  fatorial=1;
			for(j=a[i]; j>0; j--) {
				fatorial*=j;
			}
			
			System.out.println(a[i]+"! = "+fatorial);
			b[i]=fatorial;
		}
		
		
		
		
		//apresentando vetores
		System.out.print("A = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
				
		// apresentando vetor B
		System.out.print("B = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("]");
		
		
	}

}
