package com.kh.practiceEx.arrayPre;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
Object Array
* */
@NoArgsConstructor
@Setter
public class CarArrayPre {
    String brand;
    String model;
    int year;

    public CarArrayPre(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "brand=" + brand + ", model=" + model + ", year=" + year;
    }
}
