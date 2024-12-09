package com.kh.practiceEx.oopArrayPre;

public class Product {
    private String name;
    private int price;
    private String description;
    private String category;

    public Product() {}

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "제품명=" + name + "\n제품가격=" + price + "\n제품설명=" + description + "\n카테고리=" + category;
    }
}
