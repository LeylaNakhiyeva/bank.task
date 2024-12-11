public class Customer {
    private String name;
    private String id;
    private Account account;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id=id;
    }
    public Account getAccount(){
        return account;
    }
    public void setAccount(Account account){
        this.account=account;
    }
    @Override
    public String toString(){
        return "name: "+name +"id: "+id+"\n";
    }
}
