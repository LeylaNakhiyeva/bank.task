import java.util.Scanner;

public class BankUtil {
    public static void addCustomer(Customer customer){
        Bank.customers[Bank.customerCount++]=customer;
    }
    public static void addAccount(Account account){
        Bank.accounts[Bank.accountCount++]=account;
    }

    public static void createAccount(){
        Scanner sc= new Scanner(System.in);
        Account account= new Account();
        System.out.println("name: ");
        String name= sc.next();
        System.out.println("id: ");
        String id= sc.next();
        System.out.println("Balance: ");
        double balance= sc.nextDouble();
        Customer customer= new Customer();
        customer.setName(name);
        customer.setId(id);
        account.setBalance(balance);
        addAccount(account);
        addCustomer(customer);
        System.out.println("Successful");
    }
//    public static void printCustomer(Customer customer){
//        for (int i=0; i<Bank.customerCount; i++){
//            customer= Bank.customers[i];
//            System.out.println("name: "+customer.getName());
//        }
//    }
    public static void addDeposite(String id, double amount){
        boolean check=false;
        for (int i=0; i<Bank.accountCount; i++){
            Customer customer= Bank.customers[i];
            if (id.equals(customer.getId())){
            Account account=Bank.accounts[i];
            if(amount>0){
                System.out.println("first balance: "+account.getBalance());
                double balance=account.getBalance();
                balance+=amount;
                account.setBalance(balance);
                System.out.println("New balance: "+account.getBalance());
                check=true;
            }
            else System.out.println("Balance must be positive!");
        }}
            if (check) System.out.println("Successful deposit!");
            else System.out.println("Invalid deposit!");

    }
    public static void transferMoney(String id, double amount){
        boolean check= false;
        for (int i=0; i<Bank.accountCount; i++){
            Customer customer=Bank.customers[i];
            if (id.equals(customer.getId())){
            Account account= Bank.accounts[i];
            if (amount>0 && amount<=account.getBalance()){
                System.out.println("first balance: "+account.getBalance());
                double balance= account.getBalance();
                balance-=amount;
                account.setBalance(balance);
                System.out.println("Balance after transfer: "+account.getBalance());
                check= true;
            }
            else if (amount<0)System.out.println("Balance must be positive!");
            else System.out.println("Balance is not enough!");
            }

        }
        if (check) System.out.println("Successful transfer!");
        else System.out.println("Invalid transfer!");
    }
    public static void totalDeposit(){
        double totalDeposit=0;
        for (int i=0; i<Bank.accountCount; i++){
        Account account=Bank.accounts[i];
        totalDeposit+=account.getBalance();
    }
        System.out.println("Total deposit amount of the bank: "+totalDeposit);
    }
}
