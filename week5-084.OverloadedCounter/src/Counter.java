/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrPotatoman
 */
public class Counter {

    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.startingValue = startingValue;
        check = false;
    }

    public Counter(boolean check) {
        this.startingValue = 0;
        this.check = check;
    }

    public Counter() {
        this.startingValue = 0;
        this.check = false;
    }

    public int value() {
        if(startingValue<0 && check == true){
        return 0;
        } else
        return startingValue;
    }

    public void increase() {
        this.startingValue = startingValue + 1;
    }

    public void decrease() {
        if (check == true) {
            if (startingValue > 0) {
                this.startingValue = startingValue - 1;
            }
        } else {
            this.startingValue = startingValue - 1;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount < 0) {
        } else {
            this.startingValue = startingValue + increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount >= 0) {
            if (check == true) {
                while (startingValue > 0) {
                    this.startingValue = startingValue - decreaseAmount;
                }
            } else {
                this.startingValue = startingValue - decreaseAmount;
            }
        } else {

        }
    }
}
