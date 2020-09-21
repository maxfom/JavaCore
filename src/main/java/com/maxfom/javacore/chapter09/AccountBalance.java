package main.java.com.maxfom.javacore.chapter09;
// Простой пакет

class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal > 0)
            System.out.print("--> ");
            System.out.println(name + ": $" + bal);
    }
}
public class AccountBalance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];

        current[0] = new Balance("K. J. Fielding", 123.23);
        current[1] = new Balance("Will Tomson", 157.53);
        current[2] = new Balance("King Kong", 500.1);
        
        for (int i = 0; i < 3; i++)
            current[i].show();
    }
}
