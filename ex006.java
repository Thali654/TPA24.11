import java.util.Scanner;
public class ex006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 10;
		int a[], b[], c[], i, j, contInterseccao=0, contVetorC=0, contJ=0;
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
		
		
		//interseccao
		for(i=0; i<TAM; i++) {
			for(j=0; j<TAM; j++) {
				if(a[i] == b[j]) {
					contInterseccao++;
				}
			}
			
		}
		
		
		//armazenamento dos valores que possuem interseccao
		c = new int[contInterseccao];
		
		for(i=0; i<TAM; i++) {
			for(j=0; j<TAM; j++) {
				if(a[i] == b[j]) {
					for(int atual : c) {
						if(atual == a[i]) {
							contVetorC++;
						}
					}
					
					
					if(contVetorC==0) {
						c[contJ] = a[i];
						contJ++;
					}
				}
			}
		}
		
System.out.println("-----");
		if(c.length==0) {
		   System.out.println("Nenhum elemento teve intersecção. ");
		} else {
	       System.out.println("Os valores que possuem intersecção são: ");
		
		
		   for(int interseccaoAtual : c) {
			   interseccaoAtual++;
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
	
		//vetor C
		System.out.print("C = [ ");
		for(i=0; i<=(c.length-1); i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println("]");
				
		
		
		
		
		
		
		sc.close();
		
	}

}
