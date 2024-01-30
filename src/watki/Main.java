package watki;

import java.io.*;

class mojWatek extends Thread
{
    @Override //adnotacja
    public void run()
    {
        System.out.println("Mój pierwszy wątek");
    }
}
public class Main {
    public static void main(String[] args)
    {
        Thread nowyWatek = new mojWatek();
        nowyWatek.start();
    }
}
