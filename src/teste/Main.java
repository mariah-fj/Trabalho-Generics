package teste;
import lista.Lista;
import lista.ListaEncadeada;
import lista.ListaUtil;
import lista.ListaVetor;

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

        ListaUtil.print(lista);

        // CRIA LISTA COM NUMERO
        Lista<Integer> listaNum = new ListaEncadeada<>();

        listaNum.add(3);
        listaNum.add(6);

        ListaUtil.print(listaNum);

        //BUSCA POR NUMERO
        boolean existeNum = ListaUtil.contains(listaNum, 3);
        System.out.println(existeNum);


        // BUSCA (CONTAINS)
        System.out.println("\n=== BUSCA ===");
        boolean existeMaria = ListaUtil.contains(lista, "Maria");
        System.out.println("Existe Maria? " + existeMaria);


        // REMOCAO

        System.out.println("\n=== REMOÇÃO ===");
        boolean removeuJoao = lista.remove("Joao");
        System.out.println("Removeu João? " + removeuJoao);

        boolean removeuPedro = lista.remove("Pedro");
        System.out.println("Removeu Pedro? " + removeuPedro);

        ListaUtil.print(lista);

        // LISTAUTIL
        System.out.println("\n=== MAX / MIN / COUNT ===");
        System.out.println("Maior (alfabético): " + ListaUtil.max(lista));
        System.out.println("Menor (alfabético): " + ListaUtil.min(lista));
        System.out.println("Ana aparece: " + ListaUtil.count(lista, "Ana"));

        // FINAL
        System.out.println("\n=== LISTA FINAL ===");
        ListaUtil.print(lista);
    }
}