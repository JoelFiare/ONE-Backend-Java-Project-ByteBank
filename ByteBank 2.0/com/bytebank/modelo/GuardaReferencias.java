package com.bytebank.modelo;

public class GuardaReferencias {

    Object[] objeto = new Object[10];
    int indice = 0;

    //              [ cc |  |  |  |  |  |  |  |  |  ]
    public void adicionar(Object cc) {
        objeto[indice] = cc;
        indice++;
    }

    public Object obtener (int indice){
        return objeto[indice];
    }
}
