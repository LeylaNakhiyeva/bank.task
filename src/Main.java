import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println("______________________________________");
            String menu= "1. Müştəri üçün hesab yaratmaq \n" +
        "2. Müştəri üçün depozit əlavə etmək \n" +
        "3. Pul köçürülməsini təmin etmək (bir hesabdan digər hesaba) \n" +
        "4. Bankın ümumi depozit məbləğinin hesablanması təmin etmək";
            System.out.println(menu);
            System.out.print("Choose: ");
            int option= sc.nextInt();
            System.out.println();
         switch (option){
            case 1 -> {
               BankUtil.createAccount();
            }
            case 2 ->{
               System.out.print("Enter the deposite amount: ");
               double amount= sc.nextDouble();
               BankUtil.addDeposite(amount);
            }
            case 3 ->{
               System.out.println("Enter the transfer amount: ");
               double amount= sc.nextDouble();
               BankUtil.transferMoney(amount);
            }
            case 4 -> {
               BankUtil.totalDeposit();
            }


         }
        }
    }
}