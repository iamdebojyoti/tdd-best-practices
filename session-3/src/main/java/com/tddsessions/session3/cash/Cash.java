package com.tddsessions.session3.cash;

public class Cash {
    private int amount;

    public Cash(int amount) {
        this.amount = amount;
    }

    public void plus(int addAmount) {
        amount += addAmount;
    }

    public boolean minus(int subAmount) {
        if (amount >= subAmount) {
            amount -= subAmount;
            return true;
        } else {
            return false;
        }
    }

    public int total() {
        return amount;
    }
}
