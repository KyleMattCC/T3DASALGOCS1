import java.util.Scanner;

public class nonrecursive{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	long a = 1,
	     b = 1,
	     temp;


	System.out.print("Enter nth number: ");
	int n = input.nextInt();
	

  	int ctr = 1;
        long time1 = System.nanoTime();
	for(int i=1; i<n; i++){
		temp = a + b;
		a = b;
		b = temp;
		ctr += 7;
	}
	ctr++;
	System.out.println("\n" + n + " Fibonnaci number is: " + a);

        long time2 = System.nanoTime();
        long elapsed = time2 - time1;
	System.out.println("\nTotal operation count: " + ctr);
	System.out.println("Elapsed time: " + elapsed + " nanoseconds");


	input.close();	
	}
}

