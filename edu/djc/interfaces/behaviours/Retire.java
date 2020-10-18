package edu.djc.interfaces.behaviours;

public class Retire implements Working
{
    @Override
    public void work()
    {
        System.out.println("I am retired and relaxing.");
    }
}
