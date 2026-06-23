package teste;

import lista.ListaVetor;

public class Main {
    public static void main(String[] args) {

        ListaVetor<String> lista = new ListaVetor<>();

        // Adicionando elementos
        lista.add("Maria");
        lista.add("Ana");
        lista.add("Joao");

        System.out.println("Lista inicial:");
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println("Tamanho: " + lista.size());

        // Teste add(valor, pos)
        lista.add("Pedro", 1);

        System.out.println("\nDepois de adicionar Pedro na posição 1:");
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));
        System.out.println("Tamanho: " + lista.size());

        // Teste remove(valor)
        System.out.println("\nRemoveu Ana? " + lista.remove("Ana"));

        System.out.println("\nDepois de remover Ana:");
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println("Tamanho: " + lista.size());

        // Teste remove(pos)
        System.out.println("\nRemovido da posição 1: " + lista.remove(1));

        System.out.println("\nLista final:");
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println("Tamanho: " + lista.size());
    }
}