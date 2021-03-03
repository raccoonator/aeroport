package ru.airport;

public class Bagadge{
    private String carrier;
    private String classFlight;
    private int mass;

    public Bagadge(String carrier, String classFlight, int mass) {
        this.carrier = carrier;
        this.classFlight = classFlight;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Багаж: " +
                "Носильщик: " + carrier +
                ", класс: " + classFlight +
                ", вес: " + mass;
    }

    public String getCarrierAndClass() {
        return this.carrier+this.classFlight;
    }


    public int getMass() {
        return mass;
    }

    public int compareTo(Bagadge o) {
        if (this.mass > o.mass) {
            return 1;
        } else if (this.mass < o.mass) {
            return -1;
        } else {
            return 0;
        }
    }
}
