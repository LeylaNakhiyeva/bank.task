import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (true){
String menu= "1. Müştəri üçün hesab yaratmaq\n" +
        "2. Müştəri üçün depozit əlavə etmək\n" +
        "3. Pul köçürülməsini təmin etmək (bir hesabdan digər hesaba)\n" +
        "4. Bankın ümumi depozit məbləğinin hesablanması təmin etmək";
            System.out.println(menu);
int option= sc.nextInt();
switch (option){
    case 1 -> {

    }
    case 2 ->{
         double amount= sc.nextDouble();

    }
    case 5 ->{
        Customer customer= new Customer();
           BankUtil.printCustomer(customer);

            System.out.println("Successful");

    }
    case 6 ->{
        System.out.println("name: ");
        String name= sc.next();
        System.out.println("id: ");
        String id= sc.next();
        Customer customer= new Customer();
        customer.setName(name);
        customer.setId(id);
        BankUtil.addCustomer(customer);
        System.out.println("Successful");
    }
}
    }
}
}