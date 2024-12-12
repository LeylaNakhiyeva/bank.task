import java.util.Scanner;

public class MenuUtil {
    public static void printMenu(){
        System.out.println("______________________________________");
        String menu= "1. Create account for customer \n" +
                "2. Add deposit for customer \n" +
                "3. Pul köçürülməsini təmin etmək (bir hesabdan digər hesaba) \n" +
                "4. Bankın ümumi depozit məbləğinin hesablanması təmin etmək";
        System.out.println(menu);
    }
 public static void deposite(){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter id: ");
     String id= sc.next();
     System.out.print("Enter the deposit amount: ");
     double amount= sc.nextDouble();
     BankUtil.addDeposite(id, amount);
 }
 public static void transfer(){
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter id: ");
     String id= sc.next();
     System.out.print("Enter the transfer amount: ");
     double amount= sc.nextDouble();
     BankUtil.transferMoney(id, amount);
 }
}
