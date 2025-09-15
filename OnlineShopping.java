interface Payments
{
  void PaymentProcess(double amount);
}
interface Shipping
{
  void ShippingArrangement(String address);
}
class OnlineShoppingSystem implements Payments,Shipping
{
  public void PaymentProcess(double amount)
  {
    System.out.println("The Processed Payment is:"+amount);
  }
  public void ShippingArrangement(String address)
  {
    System.out.println("The Shipping Address is:"+address);
  }
}
class OnlineShopping
{
  public static void main(String[] args)
  {
    OnlineShoppingSystem os=new OnlineShoppingSystem();
    os.PaymentProcess(5000);
    os.ShippingArrangement("4-56/d,Gandhi Nagar,Hyderabad");
  }
}