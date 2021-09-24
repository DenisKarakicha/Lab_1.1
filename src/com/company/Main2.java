package com.company;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.LocalDate;

        //Вывести сведения о товарах, срок годности которых менее
        //20-ти дней. Определить количество просроченных товаров.

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество товаров:");
        int inCountProduct = scan.nextInt();
        scan.nextLine();

        Shop[] product = new Shop[inCountProduct];

        for (int i = 0; i < product.length; i++) {
            product[i] = new Shop();
            System.out.print("Введите название продукта: ");
            product[i].nameProduct = scan.nextLine().trim();
            System.out.print("Введите дату производства Год/Месяц/День: ");
            product[i].year = scan.nextInt();
            product[i].setMonth(scan.nextInt());
            product[i].setDay(scan.nextInt());
            product[i].Time();
            System.out.print("Срок годности : ");
            product[i].setShelfLife(scan.nextInt());
            System.out.print("Введите цену: ");
            product[i].price = scan.nextInt();
            System.out.print("Введите количество экземпляров: ");
            product[i].count = scan.nextInt();
            System.out.print("Введите изготовителя: ");
            scan.nextLine();
            product[i].manufacturer = scan.nextLine().trim();
        }

        int countDelay = 0;

        for (int i = 0; i < product.length; i++) {
            if(product[i].Examination() == true){
                countDelay++;
            }
            if(product[i].lessDay() == true){
                product[i].Output();
            }

        }

        System.out.print("Количество просрочки: " + countDelay);

    }

}
