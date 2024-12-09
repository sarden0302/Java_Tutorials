package com.kh.practiceEx.arrayPre;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Object Arrays
* */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CarArrayPreService {
    public void carMethod1() {
        CarArrayPre[] cars = new CarArrayPre[3];
        cars[0] = new CarArrayPre("현대", "소나타", 2020);
        cars[1] = new CarArrayPre("기아", "쏘렌토", 2019);
        cars[2] = new CarArrayPre("아우디", "A6", 2022);

        // todo 1. Arrays.toString을 이용해 car 배열 출력
        System.out.println(cars);
        System.out.println("Arrays toString을 이용한 차 종류들 출력 : " + Arrays.toString(cars));

        // todo 2. cars 배열을 브랜드 이름을 기준으로 오름차순 정렬
        // DB에서 ORDER BY ASC를 이용하는게 속도 ↑
        // 버블 정렬 알고리즘
        /*for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length - 1; j++) {
                if (cars[j].brand.compareTo(cars[j + 1].brand) > 0) {
                    CarArrayPre carArrayPre = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = carArrayPre;
                }
            }
        }*/
        List<CarArrayPre> carsList = Arrays.asList(cars);
        carsList.sort(Comparator.comparing(CarArrayPre::getBrand));
        //carsList.stream().sorted(Comparator.comparing(CarArrayPre::getBrand)).forEach(System.out::println);
        System.out.println("sort 후 : " + Arrays.toString(cars));
        System.out.println(Arrays.toString(carsList.toArray()));

        cars = carsList.toArray(new CarArrayPre[carsList.size()]);
        // todo 3. cars 배열의 모든 요소를 동일한 객체로 모두 변경
        Arrays.fill(cars, new CarArrayPre("BMW", "X5", 2018));
        System.out.println("todo 3, BMW로 모두 변경되었는지 확인 : " + Arrays.toString(cars));

        // todo 4. 다른 배열 값과 같은지 비교
        CarArrayPre[] carsEquals = {
                new CarArrayPre("현대", "소나타", 2020),
                new CarArrayPre("기아", "쏘렌토", 2019),
                new CarArrayPre("아우디", "A6", 2022)
        };

        boolean areEquals = Arrays.equals(carsEquals, cars);
        System.out.println("cars 와 carsEquals는 같은가? : " + areEquals);
    }

    public static void main(String[] args) {
        CarArrayPreService carArrayPreService = new CarArrayPreService();
        carArrayPreService.carMethod1();
    }

}
