package com.company;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Shop {

    public static final int SHELF_TERM = 20;
    public static final int MAX_DAYS_PER_MONTH = 31;
    String nameProduct;
    int price;
    int day;
    int month;
    int year;
    LocalDate dateOfManufacture;
    int shelfLife;
    int count;
    String manufacturer;

    Scanner scan = new Scanner(System.in);

    public void setPrice(int price){
        int truePrise = day;
        if(truePrise < 0 || truePrise > MAX_DAYS_PER_MONTH) {
            System.out.print("Ошибка ввода. Попробуйте снова: ");
            truePrise = scan.nextInt();
        }

        this.price = truePrise;
    }

    public  int getPrice(){
        return price;
    }

    public void setDay(int day){
        int trueDay = day;
        if(trueDay < 0 || trueDay > MAX_DAYS_PER_MONTH) {
            System.out.print("Ошибка ввода. Попробуйте снова: ");
            trueDay = scan.nextInt();
        }

        this.day = trueDay;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month){
        int trueMonth = month;
        if(trueMonth < 0 || trueMonth > 12) {
            System.out.print("Ошибка ввода. Попробуйте снова: ");
            trueMonth = scan.nextInt();
        }

        this.month = trueMonth;
    }

    public int getMonth() {
        return month;
    }

    public void setShelfLife(int shelfLife){
        int trueShelfLife = shelfLife;
        if(trueShelfLife < 0) {
            System.out.print("Ошибка ввода. Попробуйте снова: ");
            trueShelfLife = scan.nextInt();
        }

        this.shelfLife = shelfLife;
    }

    public int getShelfLife(){
        return shelfLife;
    }

    public void Time(){
        dateOfManufacture = LocalDate.of(year , month , day);
    }

    public boolean Examination(){
        // Метод для определение просрочки
        LocalDate todayTime = LocalDate.now();
        boolean trueDate = false;
        if(ChronoUnit.DAYS.between(dateOfManufacture, todayTime) > SHELF_TERM)
            trueDate = true;

        return trueDate;
    }

    public boolean lessDay(){
        LocalDate todayTime = LocalDate.now();
        boolean trueLessDay = false;
        if(ChronoUnit.DAYS.between(dateOfManufacture, todayTime) < SHELF_TERM)
            trueLessDay = true;

        return  trueLessDay;

    }



    public void Output() {
        System.out.println("\n");
        System.out.println("Испортевшиеся продукты на сегодняшний день");
        System.out.println();
        System.out.println("Название : " + nameProduct);
        System.out.println("Дата производства : " + dateOfManufacture);
        System.out.println("Срок годности : " + shelfLife);
        System.out.println("Цена : " + price);
        System.out.println("Количество : " + count);
        System.out.println("Изготовитель : " + manufacturer);
        System.out.println();
    }
}
