import java.util.Scanner;

public class recursive{
	public static void getFibonacci(long a, long b, int n, int ctr){
		if(n==1){
			System.out.println(a);
			System.out.println("\nTotal function call/s: " + ctr);
		}
		else
			getFibonacci(b, a+b, n-1, ctr+1);
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter nth number: ");
		int n = input.nextInt();

        	long time1 = System.nanoTime();
		System.out.print(n + " Fibonacci number is: ");
		getFibonacci(1, 1, n, 0);
		long time2 = System.nanoTime();
        	long elapsed = time2 - time1;
		System.out.println("Elapsed time: " + elapsed + " nanoseconds");

		input.close();	
	}
}


			
