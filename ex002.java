import java.util.Scanner;
public class ex002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 5;
		int a[], i, numTabu, tabuada;
		a = new int[TAM];
		
		// vetor A
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"º valor");
			a[i]= sc.nextInt();
		}
		
		
		//Apresentando vetor A
		System.out.print("A [] = "+"[ ");
		for(i = 0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		
		
		
		// Tabuada
		for(i=0; i<TAM; i++) {
			System.out.println("Tabuada do "+a[i]);
			for(numTabu=0; numTabu <= 10; numTabu++) {
				tabuada = a[i]*numTabu;
				System.out.println(a[i]+" * "+numTabu+" = "+tabuada);
			}	
		}
		
		
		
		
		
	}

}