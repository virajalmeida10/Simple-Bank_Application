class Account {
    //Properties:
    private String name;
    private double account_number;
    private String email_id;
    private double phone_number;
    private double account_balance;

    //Constructor:
    public Account (String name, double account_number, String email_id, double phone_number, double account_balance) {
        this.name = name;
        this.account_number = account_number;
        this.email_id = email_id;
        this.phone_number = phone_number;
        this.account_balance = account_balance;
    }

    //Behaviours:
    public void Deposit (double Deposit_Money) {
        account_balance = account_balance + Deposit_Money;
        System.out.println("Balance after Depositing "+Deposit_Money +" is "+account_balance);
    }
    public void WithDraw (double Withdraw_Money) {
        if ((account_balance - Withdraw_Money) < 0) {
            System.out.println("Amount cannot be withdrwan, Account Balnce is: "+account_balance);
        }
        else {
            account_balance = account_balance - Withdraw_Money;
            System.out.println(+Withdraw_Money +" Debited, Current Balance is: "+account_balance);
        }
    }
}