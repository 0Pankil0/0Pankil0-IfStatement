import java.util.Scanner;

class IfStatement {
  public static void main(String[] args) {
    // Giving gritings ...
      System.out.println("Hello, Good morning...");
      System.out.println("How are you ?");
      Scanner input1 = new Scanner(System.in);
      String n1 = input1.nextLine();
      System.out.println( n1 + ", That's good... :)");
    // Asking for making username ...
      System.out.println("To creat your account first enter your Username.");
      System.out.print("Username : ");
      Scanner input2 = new Scanner(System.in);
      String n2 = input2.nextLine();
    // Asking for password...
      System.out.println("Now you have to enter password...");
      System.out.print("Password : ");
      Scanner input3 = new Scanner(System.in);
      String n3 = input3.nextLine();
    // Asking for login...
      System.out.println("To login please enter your Username and Passowrd.");
      System.out.print("Username : ");
      Scanner input4 = new Scanner(System.in);
      String n4 = input4.nextLine();
      System.out.print("Password : ");
      Scanner input5 = new Scanner(System.in);
      String n5 = input5.nextLine();
    // Checking Username and Password through if/else...
      if(n2.equalsIgnoreCase(n4)){
        if(n3.equals(n5)){
          System.out.println("Congratulation. You have successfully entered in your accout...");
        }
        else if(n2.equalsIgnoreCase(n4)){
          System.out.println("You have entered wrong Password.");
        } 
      } else if(n3.equals(n5)){
          System.out.println("You have entered wrong Username.");
      } else{
        System.out.println("You have entered wrong Username and Password");
      }
    // Closing all input...
      input1.close();
      input2.close();
      input3.close();
      input4.close();
      input5.close();
    System.out.println("This is the end of program...");
  }
}