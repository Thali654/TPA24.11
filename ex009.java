import java.util.Scanner;
public class ex009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 10;
		boolean palindromo = true;
		int a[], i, j;
		a = new int[TAM];
		
		//lendo vetor A
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"� valor:");
			a[i] = sc.nextInt();
		}
		
		//apresentando vetor A
		System.out.print("A = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		
		
		
		//verificando se � palindromo ou n�o
		j = TAM-1;
		for(i=0; i<TAM; i++) {
				if(a[i]!=a[j]) {
					palindromo = false;
				}
			j--;
		}
		

		if(palindromo == true) {
			System.out.println("� um palindromo.");
		}else {
			System.out.println("N�o � um palindromo.");
		}
		
		
		
		
		
		sc.close();
		
	}

}
