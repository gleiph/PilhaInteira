package br.ufjf.dcc.dcc025.pilha;

import java.util.Arrays;

public class PilhaInteiro {
    private Integer[] pilha;
    private Integer tamanhoMaximo;
    private Integer indiceTopo;

    public PilhaInteiro() {

        this.tamanhoMaximo = 2;
        this.pilha = new Integer[tamanhoMaximo];
        this.indiceTopo = -1;
    }

    public void push(int i) {
        if (indiceTopo >= tamanhoMaximo - 1) {
            pilha = Arrays.copyOf(pilha, tamanhoMaximo * 2);
            tamanhoMaximo *= 2;
        }

        pilha[++indiceTopo] = i;

    }

    public Integer pop() {
        return indiceTopo >= 0 ? pilha[indiceTopo--] : null;
    }

    public Integer peek() {
        return indiceTopo >= 0 ?
                pilha[indiceTopo] : 
                null;
    }

    public int size() {
        return indiceTopo + 1;
    }
}
