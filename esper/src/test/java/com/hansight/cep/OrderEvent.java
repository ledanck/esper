package com.hansight.cep;

public class OrderEvent {
    public long occur_time = System.currentTimeMillis();
    public double price;
    public String itemName;

    public OrderEvent() {
        super();
    }

    public OrderEvent(double price, String itemName) {
        super();
        this.price = price;
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }

    public long getOccur_time() {
        return occur_time;
    }

    public byte[] buf = new byte[1024*10];
}