package teste;
import lista.ListaVetor;

public class Main{
    public static void main(String[] args) {
        ListaVetor<String> lista = new ListaVetor<>();

        lista.add("Maria");
        lista.add("Ana");
        lista.add("Joao");

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));

        System.out.println("Tamanho: " + lista.size());
    }
}

