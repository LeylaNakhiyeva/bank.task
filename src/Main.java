import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
String menu= "1. Müştəri üçün hesab yaratmaq\n" +
        "2. Müştəri üçün depozit əlavə etmək\n" +
        "3. Pul köçürülməsini təmin etmək (bir hesabdan digər hesaba)\n" +
        "4. Bankın ümumi depozit məbləğinin hesablanması təmin etmək";
int option= sc.nextInt();
switch (option){
    case 1 -> {
        System.out.println("name: ");
        String name= sc.next();
        System.out.println("id: ");
        String id= sc.next();
       Customer customer= new Customer();
       for (int i=0; i<Bank.customerCount;i++){
           Bank.customers[i]=customer;
       }
       customer.setName(name);
       customer.setId(id);
       customer.getAccount().getBalance();
       System.out.println(customer);
    }
    case 2 ->{

    }
}
    }
}