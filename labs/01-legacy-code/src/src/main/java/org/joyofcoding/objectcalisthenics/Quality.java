package org.joyofcoding.objectcalisthenics;

public class Quality {
    private int quality;

    public Quality(int quality) {
        this.quality = quality;
    }

    @Deprecated
    public int getQuality() {
        return quality;
    }

    @Deprecated
    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void modifyQuality(int delta){
        quality += delta;
    }

    public void resetQualityToZero() {
        this.quality = 0;
    }

    public boolean qualityGreaterThen(int reference) {
        return this.quality > reference;
    }

    public boolean qualityLessThen(int reference) {
        return this.quality < reference;
    }

}
