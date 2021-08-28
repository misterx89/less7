package ru.gb.less7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public void info() {
        System.out.println(name + " СЫТОСТЬ: " + full);
    }

    public void eat(Plate plate) {
        if(plate.getFood() <= 0 && appetite != 0) {
            full = false;
            return;
        }
        plate.decreaseFood(appetite);
        full = true;
        System.out.println(name + " поел из тарелки!");
    }
}
