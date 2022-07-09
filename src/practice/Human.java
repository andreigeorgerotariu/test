package practice;

public class Human {

    private String name;
    private int age;
    private double money;
    private BankAccount bankAccount;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", bankAccount=" + bankAccount +
                '}';
    }
}

class BankAccount {

    private int accountMoney;
    private int debts;

    public int getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(int accountMoney) {
        this.accountMoney = accountMoney;
    }

    public int getDebts() {
        return debts;
    }

    public void setDebts(int debts) {
        this.debts = debts;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountMoney=" + accountMoney +
                ", debts=" + debts +
                '}';
    }
}


class TestHuman {

    public static void main(String[] args) {
        Human humanAlex = new Human();
        humanAlex.setAge(25);
        humanAlex.setName("Alex");
        humanAlex.setMoney(234.34);

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountMoney(1000);
        bankAccount.setDebts(0);

        humanAlex.setBankAccount(bankAccount);

        System.out.println(humanAlex);
    }
}