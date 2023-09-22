import java.util.Scanner;

public class Accountant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, type the first parameter: ");
        int firstParameter = scan.nextInt();

        System.out.print("Please, type the second parameter: ");
        int secondParameter = scan.nextInt();

        try {
            //calling count method to execute the workflow
            count(firstParameter, secondParameter);

        }catch (CustomInvalidParameterException exception) {
            //print message: The second parameter must be greater than the first parameter
            System.out.printf("The second parameter (%s) must be greater than the first parameter (%s)!",
                              secondParameter, firstParameter);
        }

    }
    static void count(int firstParameter, int secondParameter ) throws CustomInvalidParameterException {
        //validating that the first parameter is GREATER than the second parameter, then throws the exception if needed
        if (secondParameter <= firstParameter){
            throw new CustomInvalidParameterException();
        }

        int difference = secondParameter - firstParameter;

        //do a for loop to print the numbers based on the "difference" variable
        for (int index=0; index<difference; index++){
            System.out.println("Printing number " + (index + 1));
        }
    }
}
