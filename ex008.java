import java.util.Scanner;
public class ex008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 10;
		int a[], x=0, i, j, vetor=0;
		a = new int[TAM];
		
		
		//lendo elemento X
		System.out.println("Escolha o número que será o elemento X:");
		x = sc.nextInt();
		
		
		//lendo vetor a
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"º valor do vetor:");
			a[i] = sc.nextInt();
		}
		
		
		
		
		//verificando os elementos
		boolean estaNoVetor = false;

		for(i=0; i<TAM; i++) {
			if(a[i]==x) {
				System.out.println("O elemento "+a[i]+" existe no vetor.");
				estaNoVetor = true;
			}
		}
		
		if(estaNoVetor == false) {
			System.out.println("Não há o elemento "+x+" no vetor.");
		}
		

		
		sc.close();
	}

}
