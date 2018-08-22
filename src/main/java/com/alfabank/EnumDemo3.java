package com.alfabank;

// Use an enum constructor, instance variable, and method.
enum Apple {
    Jonathan(10, "red"), GoldenDel(9, "yellow"), RedDel(12, "red"), Winesap(15, "green"), Cortland(8, "yellow");

    private int price; // price of each apple
    private String color;

    // Constructor
    Apple(int p, String c) { price = p; color = c;}

    int getPrice() { return price; }
    String getColor(){return color;}
}

class EnumDemo3 {
    public static void main(String args[])
    {
        Apple ap;

        // Display price of Winesap.
        System.out.println("Winesap costs " +
                Apple.Winesap.getPrice() +
                " cents.\n");

        // Display all apples and prices.
        System.out.println("All apple prices:");
        for(Apple a : Apple.values())
            System.out.println(a + " costs " + a.getPrice() +
                    " cents, color: " + a.getColor());
    }
}
