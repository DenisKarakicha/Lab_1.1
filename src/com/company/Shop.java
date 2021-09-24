package com.company;

import java.util.Scanner;
import java.time.LocalDate;

public class Shop {

    String nameProduct;
    int count;
    int price;
    String manufacturer;
    LocalDate date;
    int day;
    int month;
    int year;

    Scanner scan = new Scanner(System.in);

    public void setPrice(int price) {
        int truePrise = price;
        if(price < 0) {
            System.out.print("Вы ввели некоректные значения. Попробуйте снова: ");
            truePrise = scan.nextInt();
        }

        this.price = truePrise;
    }

    public int getPrice(){
        return price;
    }

    public void setCount(int count){
        int trueCount = count;
        if(count < 0) {
            System.out.print("Вы ввели некоректные значения. Попробуйте снова: ");
            trueCount = scan.nextInt();
        }
        this.count = trueCount;
    }

    public int getCount(){
        return count;
    }

    public void Date(){
        date = LocalDate.of(year , month , day);
    }


    public void Input(){
        System.out.println("\n");
        System.out.println("Название : " + nameProduct);
        System.out.println("Количество : " + count);
        System.out.println("Цена : " + price);
        System.out.println("Изготовитель : " + manufacturer);
        System.out.println("Дата выпуска :" + date);
    }
}
