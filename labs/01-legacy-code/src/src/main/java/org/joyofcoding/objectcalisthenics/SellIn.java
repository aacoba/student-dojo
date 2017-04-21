package org.joyofcoding.objectcalisthenics;


public class SellIn {
    private int sellIn;

    public SellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    @Deprecated
    public int getSellIn() {
        return this.sellIn;
    }

    @Deprecated
    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void modifySellin(int delta) {
        this.sellIn += delta;
    }

    public void resetSellinToZero() {
        this.sellIn = 0;
    }

    public boolean sellinGreaterThen(int reference) {
        return sellIn > reference;
    }

    public boolean sellinLessThen(int reference) {
        return sellIn < reference;
    }
}
