package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer{

    private GenericListFilter filtro;

    public ListFilterer(GenericListFilter filter){
        filtro = filter;
    }

    public List<Integer> filter(List<Integer> list){

        List<Integer> lista_res = new ArrayList<>();

        for (Integer integer : list) {
            if (filtro.accept(integer)) {
                lista_res.add(integer);
            }
        }

        return lista_res;
    }
}
