package com.aor.numbers;

public class PositiveFilter implements GenericListFilter{

    public boolean accept(Integer Int){
        if(Int > 0){
            return true;
        } else {
            return false;
        }
    }
}
