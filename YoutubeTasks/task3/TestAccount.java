public class TestAccount {
    public static void main(String[] args){
    long accountId = 2323132;
    String cnic = "34892823";
    String name = "ali";
    int age = 34;
    double amount = 10000;

    Account id1 = new Account(accountId);
    id1.setCnic(cnic);
    id1.setName(name);
    id1.setAge(age);

    Account id2 = new Account(cnic,name,age);

    id2.setCnic(cnic);
    id2.setName(name);
    id2.setAge(25);
    System.out.println("amount = " + id2.getBalance());
    id2.depositAmount(amount);
    System.out.println("amount = " + id2.getBalance());
    id2.withdrawAmount(amount);
    System.out.println("amount = " + id2.getBalance());
    } 
}
