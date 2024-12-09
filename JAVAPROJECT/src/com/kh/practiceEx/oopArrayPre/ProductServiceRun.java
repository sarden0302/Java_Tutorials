package com.kh.practiceEx.oopArrayPre;

import java.util.Scanner;

public class ProductServiceRun {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        Product p = new Product();
        // 제품명 가격 입력받기
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter product price: ");
        int productPrice = 0;
        try {
            productPrice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid product price");
        }
        p = new Product(productName, productPrice);
        String inputDescription = "";
        String inputCategory = "";
        // 제품 설명과 카테고리는 입력유무 물어본 후 yes 입력하면
        // 제품설명과 카테고리 작성
        // no 입력하면 제품명과 가격만 저장
        System.out.print("Would you like to add description and category? (yes or no) : ");
        String yesOrNo = scanner.nextLine();

        if (yesOrNo.equalsIgnoreCase("yes")) {
            System.out.print("Type description : ");
            inputDescription = scanner.nextLine();
            System.out.print("Type category : ");
            inputCategory = scanner.nextLine();
        } else if (yesOrNo.equalsIgnoreCase("no")) {
            System.out.println("추후에 수정 가능합니다.");
            inputDescription = "제품 설명이 존재하지 않습니다.";
            inputCategory = "없음";
        } else {
            System.out.println("잘못 입력했습니다. 다시 작성해주세요.");
        }
        p.setDescription(inputDescription);
        p.setCategory(inputCategory);
        productService.addProduct(p);

        /*
        // p1 제품 추가
        Product p1 = new Product("스마트폰", 100000);
        p1.setDescription("최신 스마트폰입니다. 12/24 출고 예정");
        p1.setCategory("전자기기");

        // p2 제품 추가
        Product p2 = new Product("노트북", 150000);
        if (p2.getDescription() == null) {
            p2.setDescription("없음");
        }

        if (p2.getCategory() == null) {
            p2.setCategory("없음");
        }

        productService.addProduct(p1);
        productService.addProduct(p2);
        */
        // 제품목록 보기
        productService.viewProducts();

        // 제품명으로 제품검색
        Product foundProduct = productService.searchProduct("노트북");
        if (foundProduct != null) {
            System.out.println("검색된 제품 : " + foundProduct);
        } else {
            System.out.println("해당 이름에 제품을 찾을 수 없습니다.");
        }
    }
}
