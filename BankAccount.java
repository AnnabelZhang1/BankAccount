public class BankAccount{

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int id, String p)
    {
      accountID = id;
      password = p;
      balance = 0;
    }

  public String toString()
    {
      return "#" + accountID + "\t$" + balance;
    }

  public double getBalance()
    {
      return balance;
    }

      public int getAccountID()
    {
      return accountID;
    }

  public void setPassword(String newPass)
    {
      password = newPass;
    }

  public boolean deposit(double amount)
    {
      if (amount < 0)
        return false;
      else
        balance += amount;
        return true;
    }

  public boolean withdraw(double amount)
    {
      if (amount < 0 || balance - amount < 0)
        return false;
      else
        balance -= amount;
        return true;
    }

//10-29-2020
  private boolean authenticate(String password)
    {
      return this.password.equals(password);
    }

  public boolean transferTo(BankAccount other, double amount, String password)
    {
      if (authenticate(password) && this.withdraw(amount) && other.deposit(amount))
        return true;
      else
        return false;
    }

}
