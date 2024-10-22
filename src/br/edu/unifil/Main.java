package br.edu.unifil;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        System.out.println(pilha.push(10));
        System.out.println(pilha.push(20));
        System.out.println(pilha.push(30));
        System.out.println(pilha.print());
        System.out.println("Quantidade: " + pilha.tamanho());
        System.out.println(pilha.pop());
        System.out.println("Último removido: " + pilha.getRetorno());
        System.out.println(pilha.print());
        System.out.println(pilha.localizar(20));
        System.out.println("Posição do topo: " + pilha.posTopo());
    }
}
