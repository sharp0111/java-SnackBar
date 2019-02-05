package javaSnack;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer (String name, double cashOnHand)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // getters
    public String getName()
    {
        return name;
    }
    public double getCash()
    {
        return cashOnHand;
    }

    // and setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void buySnack(int quantity, Snack snack)
    {
        snack.buySnack(quantity);
        this.cashOnHand -= snack.getCost(quantity);
    }
}