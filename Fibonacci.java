import java.util.Scanner;
class Fibonacci {
	
	public static void main(String [] args){

		System.out.println("inserisci un numero:\n");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int a=1;
		int b=1;
		int ris;

		System.out.print("1 1 ");

		for(int count=1;count<=(n-2);count++){


			ris=a+b;
			a=b;
			b=ris;

			System.out.print(ris+" ");

		}	
	}
}