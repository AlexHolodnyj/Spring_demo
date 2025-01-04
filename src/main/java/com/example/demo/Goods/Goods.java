package com.example.demo.Goods;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Goods {
    private String nameOfGoods;
    private float priceOfGoods;
    private LocalDate expiredDateOfGoods;
    private int amountsLeft;
    private int isDueBy;

    public Goods() {
    }

    public Goods(String nameOfGoods, float priceOfGoods, LocalDate expiredDateOfGoods, int amountsLeft) {
        this.nameOfGoods = nameOfGoods;
        this.priceOfGoods = priceOfGoods;
        this.expiredDateOfGoods = expiredDateOfGoods;
        this.amountsLeft = amountsLeft;
        this.isDueBy = (int) ChronoUnit.DAYS.between(LocalDate.now(), this.expiredDateOfGoods);
    }

    public String getNameOfGoods() {
        return nameOfGoods;
    }

    public void setNameOfGoods(String nameOfGoods) {
        this.nameOfGoods = nameOfGoods;
    }

    public float getPriceOfGoods() {
        return priceOfGoods;
    }

    public void setPriceOfGoods(float priceOfGoods) {
        this.priceOfGoods = priceOfGoods;
    }

    public LocalDate getExpiredDateOfGoods() {
        return expiredDateOfGoods;
    }

    public void setExpiredDateOfGoods(LocalDate expiredDateOfGoods) {
        this.expiredDateOfGoods = expiredDateOfGoods;
    }

    public void setAmountsLeft(int amountsLeft) {
        this.amountsLeft = amountsLeft;
    }

    public int getAmountsLeft() {
        return amountsLeft;
    }

    public int getIsDueBy() {
        return isDueBy;
    }

    public void setIsDueBy(int isDueBy) {
        this.isDueBy = isDueBy;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "nameOfGoods='" + nameOfGoods + '\'' +
                ", priceOfGoods=" + priceOfGoods +
                ", expiredDateOfGoods=" + expiredDateOfGoods +
                ", amountsLeft=" + amountsLeft +
                ", isDueBy=" + isDueBy +
                '}';
    }
}
