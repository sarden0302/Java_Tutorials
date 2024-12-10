package com.kh.practiceEx.oopArrayPre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GoodsServiceRun {
    public static void main(String[] args) {
        GoodsService goodsService = new GoodsService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== 상품 설정 시스템 =====");
            System.out.println("1. 상품추가하기");
            System.out.println("2. 모든 상품보기");
            System.out.println("3. 원하는 상품 보기 (상품번호로 조회)");
            System.out.println("4. 원하는 상품 보기 (상품이름으로 조회)");
            System.out.println("5. 상품 제거하기 (상품번호로 제거)");
            System.out.println("6. 종료하기");

            try {
                System.out.print("번호를 선택하세요 : ");
                int choice = Integer.parseInt(scanner.nextLine());
                int index;
                switch(choice) {
                    case 1:
                        System.out.println("----- 상품 추가하기 -----");
                        System.out.print("상품 번호 : ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("상품 이름 : ");
                        String name = scanner.nextLine();
                        System.out.print("상품 가격 : ");
                        double price = Double.parseDouble(scanner.nextLine());
                        System.out.print("상품 수량 : ");
                        int quantity = Integer.parseInt(scanner.nextLine());
                        goodsService.addGoods(new Goods(id, name, price, quantity));
                        break;
                    case 2:
                        System.out.println("-----  모든 상품 조회하기 -----");
                        goodsService.displayAllGoods();
                        break;
                    case 3:
                        System.out.println("----- 상품 찾기 서비스 -----");
                        System.out.print("찾고자하는 상품 번호를 입력하세요 : ");
                        index = Integer.parseInt(scanner.nextLine());
                        goodsService.getGoodsById(index);
                        break;
                    case 4:
                        System.out.println("----- 상품 찾기 서비스 -----");
                        System.out.print("찾고자하는 상품 번호를 입력하세요 : ");
                        String findName = scanner.nextLine();
                        goodsService.getGoodsByName(findName);
                        break;
                    case 5:
                        System.out.println("----- 상품 제거 서비스 -----");
                        System.out.print("삭제하고 싶은 상품 번호를 입력하세요 : ");
                        index = Integer.parseInt(scanner.nextLine());
                        goodsService.removeGoods(index);
                        break;
                    case 6:
                        System.out.println("시스템 종료를 선택하셨습니다.");
                        return;
                    default:
                        System.out.println("잘못 입력했습니다. 숫자만 입력 가능합니다.");
                        break;
                }
            // NumberFormatException : String을 문자열로 변경시 문제 발생
            } catch (NumberFormatException e) {
                System.out.println("숫자 형식만 가능합니다. " + e.getMessage());
            // InputMismatchException : Input 값이 잘못 들어올 때 문제 발생
            } catch (InputMismatchException e) { // 숫자칸에 문자를 넣었을 때 보여줄 출력문
                System.out.println("숫자 형식만 가능합니다." + e.getMessage());
                scanner.nextLine(); // Integer.parseInt() 사용 안할 시 scanner.nextInt() 이후
                                    // scanner.nextLine() 실행이 안되어
                //                  // cuz Buffer가 그대로 남아 있어 입력값이 ""로 계속 받게 돼 무한루프가 발생할 수 있다
            } catch (Exception e) {
                System.out.println("문제가 발생했습니다.");
            } finally {
                System.out.println("프로그램을 종료합니다.");
            }
        }
    }
}
