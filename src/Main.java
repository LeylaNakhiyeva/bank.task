import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (true){
           MenuUtil.printMenu();
            System.out.print("Choose: ");
            int option= sc.nextInt();
            System.out.println();
         switch (option){
            case 1 -> BankUtil.createAccount();
            case 2 -> MenuUtil.deposite();
            case 3 -> MenuUtil.transfer();
            case 4 -> BankUtil.totalDeposit();

         }
        }
    }
}