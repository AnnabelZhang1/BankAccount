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
      System.out.println("Account" \t balance);
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
      if (amount < 0 || balance - amount < 0)
        return false;
      else
        balance += amount;
        return true;
    }

  public boolean withdraw(double amount)
    {
      ~~
    }
}
