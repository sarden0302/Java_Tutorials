package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;

public class GoodsService {
    // 상품들을 담을 목록 리스트
    private ArrayList<Goods> goodsList = new ArrayList<>();

    /** void addGoods(Goods goods) 상품 추가 기능
     *
     * @param goods
     */
    public void addGoods(Goods goods) {
        goodsList.add(goods);
        System.out.println(goods.getName() + "상품이 추가되었습니다.");
    }

    /** Goods getGoodsById(int id) 상품전달 상품번호로 상품 가져오기 기능
     *
     * @param id 상품 번호
     * @return   상품 번호에 해당하는 Goods 상품을 사용자에게 전달
     */
    public Goods getGoodsById(int id) {
        for (Goods goods : goodsList) {
            if (goods.getId() == id) {
                return goods;
            }
        }
        System.out.println("상품 " + id + "번 에 해당하는 상품을 찾을 수 없습니다.");
        return null; // 상품번호로 해당하는 상품이 없을 경우 빈 값 전달하기
    }

    /** Goods getGoodsByName(String name) 상품명으로 상품 조회
     *
     * @param name 검색할 상품 이름
     * @return
     */
    public Goods getGoodsByName(String name) {
        for (Goods goods : goodsList) {
            if (goods.getName().equalsIgnoreCase(name)) {
                return goods;
            }
        }
        System.out.println(name + " 존재하는 상품이 없습니다.");
        return null;
    }

    /** void displayAllGoods() 모든 상품 보기 기능
     *  매개변수 없음
     */
    public void displayAllGoods() {
        // 만약에 상품 리스트가 존재하지 않는다면, 존재한다면
        if (goodsList.isEmpty()) {
            System.out.println("존재하는 상품이 없습니다.");
            return;
        }
        System.out.println("===== 상품 리스트 =====");
        for (Goods goods : goodsList) {
            System.out.println(goods.toString());
        }
    }

    /** void removeGoods(int id) 상품 삭제하기 기능
     *
     * @param id 상품번호
     */
    public void removeGoods(int id) {
        if (goodsList.isEmpty()) {
            System.out.println();
            return;
        }

        Goods toGoods = null;

        for (Goods goods : goodsList) {
            if (goods.getId() == id) {
                toGoods = goods;
                goodsList.remove(goods);
                break;
            }
        }
        if (toGoods == null) {
            System.out.println("상품번호 " + id + "로 조회된 상품이 존재하지 않아 삭제할 수 없습니다.");
            return;
        }
        System.out.println("상품번호 " + id + "에 해당하는 상품을 제거했습니다.");
    }


}
