import java.util.Scanner;
import java.util.ArrayList;

public class ListofPrimes {

    public static void main(String[] args) {

        ArrayList<Integer> primenumbers = new ArrayList<Integer>();
        primenumbers.add(2);
        int i; // iteration
        System.out.println("List of Prime Numbers Upto : ");
        Scanner input = new Scanner(System.in);
        int userinput = input.nextInt(); // outer limit to print values
        if (userinput > 2) {

            int index = 1;
            for (i = 3; i <= userinput; i++) {
                int factors = 0;
                for (int j = 2; j * j <=i; j++) {
                    if (i % j == 0) {
                        factors++;
                        break;
                    }
                }
                if (factors == 0) {
                    // a[0]=;
                    primenumbers.add(i);
					index = index + 1;
                }
            }
			//System.out.println("There are a total of " + index + " prime numbers upto less than " + userinput);
            System.out.println("The list of Prime Numbers upto " + userinput + " are as follows");
            //for (int k = 0; k <= index; k++) {
                System.out.println(primenumbers);
				System.out.println("Total Count: " +index);
            //}
        } else
            System.out.println("Enter a number greater than 2");

    }
}