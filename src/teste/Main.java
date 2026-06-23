package teste;

import lista.Lista;
import lista.ListaEncadeada;
import lista.ListaUtil;

public class Main {

    public static void main(String[] args) {
        testarListaEncadeada();
    }

    private static void testarListaEncadeada() {

        //  CRIA LISTA
        Lista<String> lista = new ListaEncadeada<>();

        //  INSERE VALORES
        lista.add("Maria");
        lista.add("Ana");
        lista.add("Joao");
        lista.add("Carlos");
        lista.add("Ana");

        System.out.println("=== LISTA INICIAL ===");
        print(lista);

        //  BUSCA / COUNT
        System.out.println("\n=== BUSCA ===");
        System.out.println("Existe Maria? " + (ListaUtil.count(lista, "Maria") > 0));
        System.out.println("Ana aparece: " + ListaUtil.count(lista, "Ana"));

        //  REMOVE
        System.out.println("\n=== REMOÇÃO ===");
        lista.remove("Joao");
        System.out.println("Removeu Joao");
        print(lista);

        //  USO DE MAX / MIN
        System.out.println("\n=== MAX / MIN ===");
        System.out.println("Maior (ordem alfabética): " + ListaUtil.max(lista));
        System.out.println("Menor (ordem alfabética): " + ListaUtil.min(lista));

        //  IMPRESSAO FINAL
        System.out.println("\n=== LISTA FINAL ===");
        print(lista);
    }

    // metodo auxiliar
    private static <T> void print(Lista<T> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}