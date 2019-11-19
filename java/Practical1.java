import java.util.ArrayList;

public class Practical1 {
    public static void main(String args[]) {
        Bank bank = new Bank();
        for (int i = 0; i < 100; i++) {
            bank.addAccount(new Account("" + i, i * 1000));
        }
        System.out.println("Total balance is " + bank.getTotalBalance());
    }
}

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double balance) {
        this.balance -= balance;
    }

    public void taxDeduction(double percent) {
        this.balance -= (this.balance * percent) / 100;
    }
}

class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public double getTotalBalance() {
        double total = 0;
        for (Account acc : this.accounts) {
            total += acc.getBalance();
        }
        return total;
    }

    public String getAccountWithMaximumBalance() {
        double max = 0;
        String maxAccountNumber = "";
        for (Account acc : this.accounts) {
            if (acc.getBalance() > max) {
                max = acc.getBalance();
                maxAccountNumber = acc.getAccountNumber();
            }
        }
        return maxAccountNumber;
    }

    public String getAccountWithMinimumBalance() {
        double min = Integer.MAX_VALUE;
        String minAccountNumber = "";
        for (Account acc : this.accounts) {
            if (acc.getBalance() < min) {
                min = acc.getBalance();
                minAccountNumber = acc.getAccountNumber();
            }
        }
        return minAccountNumber;
    }

    public Account findAccount(String accountNumber) throws Exception {
        for (Account acc : this.accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        throw new Exception("account not found");
    }

    public int getNoOfAccountsHavingAtleastBalance(double balance) {
        int count = 0;
        for (Account acc : this.accounts) {
            if (acc.getBalance() >= balance) {
                count += 1;
            }
        }
        return count;
    }
}
