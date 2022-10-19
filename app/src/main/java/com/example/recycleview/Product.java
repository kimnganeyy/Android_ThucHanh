package com.example.recycleview;

public class Product {
    private int resourceid;
    private String title;
    private String price;

    public Product(int resourceid, String title, String price) {
        this.resourceid = resourceid;
        this.title = title;
        this.price = price;
    }

    public int getResourceid() {
        return resourceid;
    }

    public void setResourceid(int resourceid) {
        this.resourceid = resourceid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
