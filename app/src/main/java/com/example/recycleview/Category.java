package com.example.recycleview;

import java.util.List;

public class Category {
    private String namecategory;
    private List<Product> Products;

    public Category(String namecategory, List<Product> Products) {
        this.namecategory = namecategory;
        this.Products = Products;
    }

    public String getNamecategory() {
        return namecategory;
    }

    public void setNamecategory(String namecategory) {
        this.namecategory = namecategory;
    }

    public List<Product> getProducts() {
        return Products;
    }

    public void setProducts(List<Product> Products) {
        this.Products = Products;
    }
}
