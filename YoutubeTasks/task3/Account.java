// Junaid has decided to open new bank that would encourage savings and discourage expenses or spending; his target is to attract younger people. He has seed/surplus money to spend to gain customers. He has made following initial policies about the bank account:
// Create two constructor of Account class to enforce that object shall  be created by only two ways i.e. passing accountId (for existing accounts) or by passing CNIC, name and age (for new account). There should be no other way to create the Account class object.
// When a new account is created, if age is greater than 35, the balance shall be initialized to 0 because Junaid decided to give no money to people greater than 35. For rest, Junaid want to apply following policy for initial balance: 50,000 PKR initial balance for customers who have age between [20-25} years, 25000 PKR for age between [25-30} years and only 10,000 for age between [30-35] years. Account should not be created for age below 20.
// Make deposit and withdraw methods to handle deposit and withdraw operations. Standard way, no special policy to enforce.
// Create an Account class with above listed attributes, constructors, deposit, withdraw methods.  Encapsulate all fields and provide access via get/set methods but do not provide write access to balance field, as the balance shall be updated via deposit and withdraw methods only. Write main method to demonstrate how it works for given input.
public class Account {
    private long accountId;
    private String cnic;
    private String name;
    private int age;
    private double balance;

    public Account(long accountId){
        setAccountId(accountId);
    }
    public Account(String cnic,String name,int age){
        setCnic(cnic);
        setName(name);
        setAge(age);
    }
    public void setAccountId(long accountId){
        this.accountId = accountId;
    }
    public long getAccountId(){
        return this.accountId;
    }


    public void setCnic(String cnic){
        this.cnic = cnic;
    }
    public String getCnic(){
        return this.cnic;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        if (age > 20)
            this.age = age;
        else
            throw new IllegalArgumentException("Minimum age limit for opening       account is 20");
        initialBalance();
    }

    public int getAge(){
        return this.age;
    }

    public double getBalance(){
        return this.balance;
    }
    public void initialBalance(){
        if(age > 35)
            balance = 0;
        else{
            if(age >= 20 && age <= 25)
                balance = 50000;
            else if(age > 25 && age <= 30)
                balance = 25000;
            else if(age > 30 && age <= 35)
                balance = 10000;
        }
    }

    public void depositAmount(double amount){
        balance += amount;
    }
    
    public void withdrawAmount(double amount){
        balance -= amount;
    }  
}
