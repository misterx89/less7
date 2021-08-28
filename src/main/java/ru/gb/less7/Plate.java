package ru.gb.less7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void increaseFood(int amount) {
        food += amount;
    }

    public void info() {
        System.out.printf("Еды в тарелке: %d \n", food);
    }
}
