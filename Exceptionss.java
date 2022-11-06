import java.util.Scanner;

public class Exceptionss {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

//       try{
//           System.out.println("please enter a number :");
//           int x = scanner.nextInt();
//       }
//       catch (Exception e){
//           System.out.println("ERROR enter a number next time");
//       }

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x / y);
        }
        catch (ArithmeticException e){
            System.out.println("you cannot divide by zero");
        }
        catch (java.util.InputMismatchException e){
            System.out.println("enter a number ±!±!!!!");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("always print this ");
        }




    }
}
