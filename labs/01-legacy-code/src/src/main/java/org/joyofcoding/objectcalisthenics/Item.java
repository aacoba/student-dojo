package org.joyofcoding.objectcalisthenics;

public class Item {
    private String name;
    private SellIn sellIn;
    private Quality quality;

    public Item(String name, SellIn sellIn, Quality quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void updateProperties() {
        if (!isAgedBrie() && !isTAFKAL80ETC() && qualityIsGreaterThanZero() && !isSulfuras())
            quality.modifyQuality(-1);

        if ((isAgedBrie() || isTAFKAL80ETC()) && qualityIsLessThanFifty())
            quality.modifyQuality(1);

        if (isTAFKAL80ETC() && sellInIsLessThan(11) && qualityIsLessThanFifty())
            quality.modifyQuality(1);

        if (isTAFKAL80ETC() && sellInIsLessThan(6) && qualityIsLessThanFifty())
            quality.modifyQuality(1);

        if (!isSulfuras())
            sellIn.modifySellin(-1);

        if (sellInLessThanZero() && !isAgedBrie() && !isTAFKAL80ETC()
                && qualityIsGreaterThanZero() && !isSulfuras())
            quality.modifyQuality(-1);

        if (isTAFKAL80ETC() && !isAgedBrie() && sellInLessThanZero())
            quality.resetQualityToZero();

        if (sellInLessThanZero() && !isAgedBrie() && qualityIsLessThanFifty() && isAgedBrie())
            quality.modifyQuality(1);

    }

    private boolean isSulfuras() {
        return "Sulfuras, Hand of Ragnaros".equals(name);
    }

    private boolean isAgedBrie() {
        return "Aged Brie".equals(name);
    }

    private boolean isTAFKAL80ETC() {
        return "Backstage passes to a TAFKAL80ETC concert".equals(name);
    }

    private boolean qualityIsLessThanFifty(){
        return quality.qualityLessThen(50);

    }

    private boolean qualityIsGreaterThanZero(){
        return quality.qualityGreaterThen(0);
    }

    private boolean sellInLessThanZero() {
        return this.sellInIsLessThan(0);
    }

    private boolean sellInIsLessThan(int reference){
        return sellIn.sellinLessThen(reference);
    }

    public String getName() {
        return name;
    }

    public int getSellIn() { return sellIn.getSellIn(); }

    public int getQuality() { return quality.getQuality(); }
}
