public class BankApplication1 {
    public static void main(String args[]) {
        Account a = new Account ("Viraj", 34353427, "abc@gmail.com", +551234765, 1000.0);
        a.Deposit(2000.0);
        a.Deposit(6000.0);
        a.WithDraw(4000.0);
        //a.WithDraw(6000.0);
    }
}