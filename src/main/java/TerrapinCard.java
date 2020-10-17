public class TerrapinCard {

  private double balance;

  public TerrapinCard(double balanceAtStart){
    balance = balanceAtStart;
  }

  public String toString(){
    return "The card has " + balance + " dollars";
  }

  public void payEconomical(){
    if (balance > 2.5){
      balance -= 2.5;
    }
  }
  public void payGourmet(){
    if (balance > 4.0){
      balance -= 4.0;
    }
  }
  public void loadMoney(double amount){
    double addedAmount = amount;
    if (addedAmount > 0){
      balance += addedAmount;
      if (balance > 150 ){
      balance = 150;
       }
    }else{
      balance = balance;
    }
  }
  public double getBalance(){
    return balance;
  }
}
