import java.util.Scanner;

public class Exercicio1079 {

	public static void main(String[] args) {
		
		int N;
		float valor1, valor2, valor3;
		float media;
		Scanner input =new Scanner(System.in);
		N = input.nextInt();
		
		for (int i = 1; i <= N; i++) {
			value1 = input.nextFloat();
			value2 = input.nextFloat();
			value3 = input.nextFloat();
			media = ( valor1*2 + valor2*3 + valor3*5 ) / 10;
			System.out.printf("%.1f\n", media);
		}
	}

}