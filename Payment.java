interface PaymentMethod
{
  void pay(double amount);
}
class CreditCard implements PaymentMethod
{ 
  public void pay(double amount)
  {
    System.out.println("Amount"+amount+"is paid by using credit card");
  }
}
class PayPal implements PaymentMethod
{
  public void pay(double amount)
  {
    System.out.println("Amount"+amount+" is paid by using paypal");
  }
}
public class Payment
{
  public static void main(String[] args)
  {
    CreditCard c=new CreditCard();
    c.pay(6000);
    PayPal p=new PayPal();
    p.pay(7800);
  }
}