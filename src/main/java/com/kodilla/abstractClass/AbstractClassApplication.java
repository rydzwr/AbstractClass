package com.kodilla.abstractClass;

abstract class ATM
{
    abstract protected void enterCard();
    abstract protected void enterPIN();
    abstract protected void enterAmount();
    abstract protected void withdraw();
    abstract protected void thanks();

    private void request()
    {
        System.out.println("Request Accepted");
    }

    private void checking()
    {
        System.out.println("Checking Account Balance...");
    }

    private void accept()
    {
        System.out.println("You Can Make A Withdraw");
    }

    public void process()
    {
        this.enterCard();//1
        this.enterPIN();//2
        this.enterAmount();//3
        this.request();//4
        this.checking();//5
        this.accept();//6
        this.withdraw();//7
        this.thanks();//8
    }

}

class Bank extends ATM
{
    @Override
    protected void enterCard()
    {
        System.out.println("Enter Card");
    }

    @Override
    protected void enterPIN()
    {
        System.out.println("Enter PIN:");
    }

    @Override
    protected void enterAmount()
    {
        System.out.println("Enter Amount To Be Withdraw:");
    }

    @Override
    protected void withdraw()
    {
        System.out.println("Cash Withdraw");
    }

    @Override
    protected void thanks()
    {
        System.out.println("Thank You For Using Our Services!");
    }
}

class Application
{
    public static void main(String args[])
    {
        Bank bank = new Bank();
        bank.process();
    }
}
















