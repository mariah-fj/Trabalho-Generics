package teste;

import lista.Lista;
import lista.ListaEncadeada;
import lista.ListaUtil;

public class Main {

    public static void main(String[] args) {

        testListaString();
        testListaNumeros();
    }

    // =========================
    // TESTES COM STRING
    // =========================
    private static void testListaString() {

        Lista<String> lista = new ListaEncadeada<>();

        lista.add("Maria");
        lista.add("Ana");
        lista.add("Joao");

        System.out.println("=== TESTE ADD ===");
        printLista(lista);

        lista.add("Pedro", 1);

        System.out.println("\n=== TESTE ADD(POS) ===");
        printLista(lista);

        System.out.println("\n=== TESTE BUSCA ===");
        System.out.println("Contém Maria? " + (ListaUtil.count(lista, "Maria") > 0));
        System.out.println("Contém Carlos? " + (ListaUtil.count(lista, "Carlos") > 0));

        System.out.println("\n=== TESTE COUNT ===");
        System.out.println("Maria aparece: " + ListaUtil.count(lista, "Maria") + " vez(es)");

        System.out.println("\n=== TESTE REMOVE(VALOR) ===");
        System.out.println("Removeu Ana? " + lista.remove("Ana"));
        printLista(lista);

        System.out.println("\n=== TESTE REMOVE(POS) ===");
        System.out.println("Removido: " + lista.remove(1));
        printLista(lista);

        System.out.println("Tamanho: " + lista.size());
    }

    // =========================
    // TESTES COM INTEIROS
    // =========================
    private static void testListaNumeros() {

        Lista<Integer> numeros = new ListaEncadeada<>();

        numeros.add(10);
        numeros.add(5);
        numeros.add(20);
        numeros.add(8);

        System.out.println("\n=== TESTE MAX/MIN ===");
        printLista(numeros);

        System.out.println("Maior: " + ListaUtil.max(numeros));
        System.out.println("Menor: " + ListaUtil.min(numeros));
    }

    // =========================
    // MÉTODO AUXILIAR
    // =========================
    private static <T> void printLista(Lista<T> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}