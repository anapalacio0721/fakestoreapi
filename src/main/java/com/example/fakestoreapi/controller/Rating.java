package com.example.fakestoreapi.controller;

public class Rating {
    private String rate;
    private Integer count;
    
    public Rating(String rate, Integer count) {
        this.rate = rate;
        this.count = count;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    
}
