public class BankUtil {
    public static void addCustomer(Customer customer){
        Bank.customers[Bank.customerCount++]=customer;
    }
    public static void printCustomer(Customer customer){
        for (int i=0; i<Bank.customerCount; i++){
            customer= Bank.customers[i];
            System.out.println("name: "+customer.getName());
        }
    }
    public static void addDeposite(double amount){
        for (int i=0; i<Bank.accountCount; i++){
            Account account=Bank.accounts[i];
            if(amount>0){
//                Account.+=amount;
            }
        }
    }
}
