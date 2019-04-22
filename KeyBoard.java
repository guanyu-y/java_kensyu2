import java.util.Scanner;

class KeyBoard {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Please input first integer:");
    int num1 = scan.nextlnt();
    System.out.println("Please input second integer: ");
    int num2 = scan.nextlnt();
    
    int sum = num1 + num2;
    System.out.println("the summation of inputed numbers is"+sum+".");

    }
}


