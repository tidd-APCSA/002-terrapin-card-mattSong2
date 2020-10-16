public class TerrapinCard {
  private double balance;
    public TerrapinCard(double balanceAtStart){
      balance = balanceAtStart;
    }
    public String toString(){
      return "This card has " + balance + " dollars";
    }
    public void payEconomical(){
      if(balance > 2.5){
        balance -= 2.5;
      }
    }
    public void payGourmet(){
      if(balance > 4){
        balance -= 4;
      }
    }
    public void loadMoney(double amount){
      if(amount < 0){
        amount  = 0;
        balance += amount;
      }
      if(amount > 150){
        balance += 150;
      } else {
        balance += amount;
      }
    }
    public double getBalance(){
      return balance;
    }
}
