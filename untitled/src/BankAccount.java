public class BankAccount implements AccountOperations {
    private double AccountValue;

    @Override
    public void ShowAccountValue(){
        System.out.println(this.AccountValue);
    }
    @Override
    public void transfer(double transferValue, BankAccount b ){
        this.AccountValue = this.AccountValue - transferValue;
        b.AccountValue = b.AccountValue + transferValue;
    }

    @Override
    public void transfer(double value) {

    }

    @Override
    public void addToAccount(double value){
        this.AccountValue +=value;
        System.out.println("Stan konta:" + this.AccountValue);
    }
}
