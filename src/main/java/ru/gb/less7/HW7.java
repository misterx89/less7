package ru.gb.less7;

import java.util.Scanner;

public class HW7 {
    public static Scanner scaner = new Scanner(System.in);
    public static void main(String[] args) {
        int answer,feed;

        Cat[] allCats = new Cat[4]; //Создаем массив из 4 Котов
        allCats[0] = new Cat("Барсик", 5);
        allCats[1] = new Cat("Мурзик", 7);
        allCats[2] = new Cat("Пушистик", 12);
        allCats[3] = new Cat("Сажик", 18);

            Plate plate = new Plate(25);
            plate.info(); //Выводим информацию о количестве еды в тарелке
            for (int i = 0; i < allCats.length; i++) {
                if (allCats[i].getFull() == false && allCats[i].getAppetite() <= plate.getFood()) {
                    allCats[i].eat(plate);
                    allCats[i].setFull(true);
                    allCats[i].info();
                    plate.info();
                } else {
                    System.out.println(allCats[i].getName() + " не поел");
                }
            }
            System.out.println("Сколько положить в тарелку корма?");
            feed = scaner.nextInt();
            plate.increaseFood(feed);
            plate.info();
    }
}

