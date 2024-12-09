package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;

public class ProductService {

    private ArrayList<Product> products = new ArrayList<Product>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + "제품이 추가되었습니다.");
    }

    // 제품 목록 보기
    public void viewProducts() {
        if (!products.isEmpty()) {
            System.out.println("=== 제품 목록 ===");
            for (Product product : products) {
                System.out.println(product.toString());
                System.out.println("------------------");
            }
        }
    }

    // 특정 제품 검색 기능 (제품명)
    public Product searchProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

}
