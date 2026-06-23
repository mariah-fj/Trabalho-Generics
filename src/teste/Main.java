package teste;

import lista.Lista;
import lista.ListaEncadeada;
import lista.ListaUtil;
import lista.ListaVetor;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        testarListaEncadeada();
    }

    private static void testarListaEncadeada() {


        // CRIA LISTA COM STRING
        Lista<String> lista= new ListaVetor<>();

        System.out.println("=== INSERÇÃO ===");
        lista.add("Maria");
        lista.add("Ana");
        lista.add("Joao");
        lista.add("Carlos");
        lista.add("Ana");
        lista.add("Vitor");


        print(lista);

        // CRIA LISTA COM NUMERO
        Lista<Integer> listaNum = new ListaEncadeada<>();

        listaNum.add(3);
        listaNum.add(6);
        print(listaNum);

        //BUSCA POR NUMERO
        boolean existeNum = buscar(listaNum,3);
        System.out.println(existeNum);


        // BUSCA (não fiz contains na interface, então coloquei aqui para testar)
        System.out.println("\n=== BUSCA ===");
        boolean existeMaria = buscar(lista, "Maria");
        System.out.println("Existe Maria? " + existeMaria);


        // REMOCAO

        System.out.println("\n=== REMOÇÃO ===");
        boolean removeuJoao = lista.remove("Joao");
        System.out.println("Removeu João? " + removeuJoao);

        boolean removeuPedro = lista.remove("Pedro");
        System.out.println("Removeu Pedro? " + removeuPedro);

        print(lista);

        // LISTAUTIL

        System.out.println("\n=== MAX / MIN / COUNT ===");
        System.out.println("Maior (alfabético): " + ListaUtil.max(lista));
        System.out.println("Menor (alfabético): " + ListaUtil.min(lista));
        System.out.println("Ana aparece: " + ListaUtil.count(lista, "Ana"));

        // FINAL
        System.out.println("\n=== LISTA FINAL ===");
        print(lista);
    }

    // PRINT (LISTAR TODOS)
    private static <T> void print(Lista<T> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    // BUSCA (SIMULA CONTAINS)
    private static <T> boolean buscar(Lista<T> lista, T valor) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(valor)) {
                return true;
            }
        }
        return false;
    }
}