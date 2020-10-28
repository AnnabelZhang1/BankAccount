public class BankAccount{

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int a, String p)
    {
      accountID = a;
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

}
