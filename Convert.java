import java.util.Scanner;

public class Convert{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Select an option (1-3):");
    System.out.println();
    System.out.println("1. Break");
    System.out.println("2. Switch");
    System.out.println("3. Methods");
    System.out.println("4. Shadowing");
    System.out.println("5. Arithmetic");
    System.out.println("6. Reverse");
    System.out.println("7. First Array");
    System.out.println("8. Second Array");
    System.out.println("9. Enhanced for");
    System.out.println("10. Try Catch");
    System.out.println("11. Search");
    System.out.println("12. Exit");

    System.out.println();

    System.out.print("Choice: ");
    int choice = input.nextInt();
    System.out.println();

    switch(choice){
      case 1:
        System.out.println("Break lab");
        Break_Ex2.main(null); //static method call, no instance required.
        break;