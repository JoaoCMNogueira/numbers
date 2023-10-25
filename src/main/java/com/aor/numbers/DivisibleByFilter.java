package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{

    private Integer number_div;

    public DivisibleByFilter(Integer number_div){
        this.number_div = number_div;
    }

    public boolean accept(Integer Int){
        if(number_div % Int == 0){
            return true;
        } else {
            return false;
        }
    }
}
