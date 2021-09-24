package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int minPrice;
        double average = 0;

        System.out.print("Введите количество товаров:");
        int inCountProduct = scan.nextInt();
        scan.nextLine();

        Shop[] product = new Shop[inCountProduct];

        for (int i = 0; i < product.length; i++) {
            product[i] = new Shop();
            System.out.print("Введите название продукта: ");
            product[i].nameProduct = scan.nextLine();
            System.out.print("Введите количество экземпляров: ");
            product[i].setCount(scan.nextInt());
            System.out.print("Введите цену: ");
            product[i].setPrice(scan.nextInt());
            System.out.print("Введите изготовителя: ");
            scan.nextLine();
            product[i].manufacturer = scan.nextLine();
            System.out.println("Введите дату выпуска День.Месяц.Год: ");
            product[i].year = scan.nextInt();
            product[i].month = scan.nextInt();
            product[i].day = scan.nextInt();
            product[i].Date();
            scan.nextLine();

            average = average + product[i].price;
        }

        for (int i = 0; i < product.length; i++) {
            product[i].Input();
        }

        int countWhile = 1;
        minPrice = product[0].price;
        do {
            if (product[countWhile].price < minPrice) {
                minPrice = product[countWhile].price;
            }
        } while (++countWhile < inCountProduct);

        average = average / inCountProduct;

        System.out.println("\n");
        System.out.println("Минимальное: " + minPrice);
        System.out.println("Средняя цена: " + average);

    }
}
