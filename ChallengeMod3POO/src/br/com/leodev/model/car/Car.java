package br.com.leodev.model.car;

public class Car {
    private String model;
    private double yearPrice1;
    private double yearPrice2;
    private double yearPrice3;

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearPrice1(double yearPrice1) {
        this.yearPrice1 = yearPrice1;
    }

    public void setYearPrice2(double yearPrice2) {
        this.yearPrice2 = yearPrice2;
    }

    public void setYearPrice3(double yearPrice3) {
        this.yearPrice3 = yearPrice3;
    }

    public void calculatePrice() {
        if (yearPrice1 < yearPrice2 && yearPrice1 < yearPrice3) {
                System.out.println("The lowest price's car is: " + yearPrice1);
                if (yearPrice2 > yearPrice3) {
                    System.out.println("The highest price's car is: " + yearPrice2);
                } else {
                    System.out.println("The highest price's car is: " + yearPrice3);
                }
        } else if (yearPrice2 < yearPrice1 && yearPrice2 < yearPrice3) {
            System.out.println("The cheapest price's car is: " + yearPrice2);
            if (yearPrice1 > yearPrice3) {
                System.out.println("The highest price's car is: " + yearPrice1);
            } else {
                System.out.println("The highest price's car is: " + yearPrice3);
            }
        } else {
            System.out.println("The lowest price's car is: " + yearPrice3);
            if (yearPrice1 > yearPrice2) {
                System.out.println("The highest price's car is: " + yearPrice1);
            } else  {
                System.out.println("The highest price's car is: " + yearPrice2);
            }
        }
    }


}
