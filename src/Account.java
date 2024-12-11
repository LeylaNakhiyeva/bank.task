public class Account {
    private double balance=0;
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance=balance;

    }public static void addDeposite(double amount){

    }
    @Override
    public String toString(){
        return "Balance: "+balance;
    }
}
