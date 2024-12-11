import java.util.Scanner;

public class MenuUtil {
    public static void printMenu(){
        System.out.println("______________________________________");
        String menu= "1. Müştəri üçün hesab yaratmaq \n" +
                "2. Müştəri üçün depozit əlavə etmək \n" +
                "3. Pul köçürülməsini təmin etmək (bir hesabdan digər hesaba) \n" +
                "4. Bankın ümumi depozit məbləğinin hesablanması təmin etmək";
        System.out.println(menu);
    }
 public static void deposite(){
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter the deposite amount: ");
     double amount= sc.nextDouble();
     BankUtil.addDeposite(amount);
 }
 public static void transfer(){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the transfer amount: ");
     double amount= sc.nextDouble();
     BankUtil.transferMoney(amount);
 }
}
