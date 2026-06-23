package teste;

import lista.Lista;
import lista.ListaEncadeada;
import lista.ListaUtil;

public class Main {

    public static void main(String[] args) {
        testarListaEncadeada();
    }

    private static void testarListaEncadeada() {

        // =========================
        // CRIA LISTA
        // =========================
        Lista<String> lista = new ListaEncadeada<>();

        // =========================
        // INSERÇÃO
        // =========================
        System.out.println("=== INSERÇÃO ===");
        lista.add("Maria");
        lista.add("Ana");
        lista.add("Joao");
        lista.add("Carlos");
        lista.add("Ana");

        print(lista);

        // =========================
        // BUSCA (não fiz contains na interface, então coloquei aqui para testar)
        // =========================
        System.out.println("\n=== BUSCA ===");
        System.out.println("Existe Maria? " + buscar(lista, "Maria"));
        System.out.println("Existe Joao? " + buscar(lista, "Joao"));
        System.out.println("Existe Ana? " + buscar(lista, "Ana"));
        System.out.println("Existe Pedro? " + buscar(lista, "Pedro"));

        // =========================
        // REMOÇÃO
        // =========================
        System.out.println("\n=== REMOÇÃO ===");
        lista.remove("Joao");
        System.out.println("Removeu Joao");

        lista.remove("Pedro"); // teste de remoção inexistente
        System.out.println("Tentou remover Pedro (não existe)");

        print(lista);

        // =========================
        // LISTAUTIL
        // =========================
        System.out.println("\n=== MAX / MIN / COUNT ===");
        System.out.println("Maior (alfabético): " + ListaUtil.max(lista));
        System.out.println("Menor (alfabético): " + ListaUtil.min(lista));
        System.out.println("Ana aparece: " + ListaUtil.count(lista, "Ana"));

        // =========================
        // FINAL
        // =========================
        System.out.println("\n=== LISTA FINAL ===");
        print(lista);
    }

    // =========================
    // PRINT (LISTAR TODOS)
    // =========================
    private static <T> void print(Lista<T> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    // =========================
    // BUSCA (SIMULA CONTAINS)
    // =========================
    private static <T> boolean buscar(Lista<T> lista, T valor) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(valor)) {
                return true;
            }
        }
        return false;
    }
}