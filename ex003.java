import java.util.Scanner;
public class ex003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 10;
		int a[], i, j;
		a = new int[TAM];
		
		
		
		//lendo vetor
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"º valor:");
			a[i] = sc.nextInt();	
			
			int  numDivisores = 0;
			//acrescentando numero de divisores
			for(j=1; j<=a[i]; j++) {
				if(a[i]%j == 0) {
					numDivisores++;
				}
			}
			
			if(numDivisores==2) {
				System.out.println(a[i]+" É um número primo");
			}else if(numDivisores != 2 || a[i] < 1){
				System.out.println(a[i]+" Não é um número primo");
			}
		
		}
		

		
		//apresntando vetor
		System.out.print("A = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
				
	
		sc.close();	
	}
		
}