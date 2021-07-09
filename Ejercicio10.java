import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño de la lista");
		int a = sc.nextInt();
		
		recorrer(rellenar(a));

	}
	
	public static void recorrer(int lista[]) {
		int mayor = 0;
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
			if (lista[i] > mayor) {
				mayor = lista[i];
			}
		}
		System.out.println("El mayor numero de la lista es: " + mayor);
	}
	
	public static int [] rellenar (int a) {
		int max = 1000;
		int min = 0;
		int random = 0;
		boolean primo = false;
		int num[]= new int [a];
		for(int i = 0; i < num.length; i++) {
			while (primo == false) {
				random = num_rand(max, min);
				num[i]= random;
				if(primo(random)) {
					primo = true;
				}
			}
			primo = false;
		}
		
		return num;
	}
	
	public static boolean primo (int num) {
		boolean primo = false;
		int c = 0;
		
		for (int i = 1; i<=num; i++) {
			if ((num%i) == 0) {
				c++;
			}
		}
		if (c <= 2) {
			primo = true;
		}
			
		return primo;	
	}
	
	public static int num_rand  (int max, int min) {
		return (int) (Math.random() * (max - min - 1) + (min)) + 1;
	}

}
