package javaSnack;

public class Snack 
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineID;

    public Snack (String name, int quantity, double cost, int vendingMachineID)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineID = vendingMachineID;
    }

    // getters
    public int getQuantity()
    {
        return quantity;
    }

    public double getCost(int quantity)
    {
        return quantity * cost;
    }

    //  and setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void addQuanity(int quantity)
    {
        this.quantity += quantity;
    }

    public void buySnack(int quantity)
    {
        this.quantity -= quantity;
    }
}