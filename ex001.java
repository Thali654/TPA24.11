import java.util.Scanner;
public class ex001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 20;
		int a[], b[], par = 0, impar = TAM-1, i;
		a = new int[TAM];
		b = new int [TAM];
		
		//ler vetor A e acrescentar vetor B
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"� valor:");
			a[i] = sc.nextInt();
					
				
			if(a[i]%2==0) {
				b[par]=a[i];
				par++;
			}else {
				b[impar]=a[i];
				impar--;
			}
			
		}
		//apresentando vetores
		System.out.print("A = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		
		//vetor B
		System.out.print("B = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("]");
		
		sc.close();
	}

}
