package br.edu.unifil;

public class Pilha {
    private Integer[] elementos;
    private Integer topo;
    private Integer capacidade;
    private Integer ultimoRemovido;

    public Pilha(Integer capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Integer[capacidade];
        this.topo = -1;
        this.ultimoRemovido = null;
    }

    public String push(Integer valor) {
        if (full()) {
            return "Pilha cheia! Não é possível empilhar o elemento.";
        }
        elementos[++topo] = valor;
        return "Elemento " + valor + " empilhado.";
    }

    public String pop() {
        if (empty()) {
            return "Pilha vazia! Não é possível remover o elemento.";
        }
        ultimoRemovido = elementos[topo--];
        return "Elemento " + ultimoRemovido + " removido.";
    }

    public Boolean full() {
        return topo >= capacidade - 1;
    }

    public Boolean empty() {
        return topo < 0;
    }

    public Integer tamanho() {
        return topo + 1;
    }

    public String print() {
        if (empty()) {
            return "Pilha vazia.";
        }
        StringBuilder sb = new StringBuilder("Pilha: ");
        for (int i = 0; i <= topo; i++) {
            sb.append(elementos[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public Integer getRetorno() {
        return ultimoRemovido;
    }

    public Integer posTopo() {
        return empty() ? -1 : topo;
    }

    public String localizar(Integer valor) {
        for (Integer i = 0; i <= topo; i++) {
            if (elementos[i] == valor) {
                return "O elemento " + valor + " está na posição " + i + ".";
            }
        }
        return "O elemento " + valor + " não está na pilha.";
    }
}
