package lista;

public class ListaUtil {

    public static <T> int count(Lista<T> lista, T elemento) {                       // conta quantas vezes o elemento aparece na lista
        int contador = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) != null && lista.get(i).equals(elemento)) {                  //percorre a lista e usa equals para contar quantas vezes o elemento aparece
                contador++;
            }
        }
        return contador;
    }

    public static <T extends Comparable<? super T>> T max(Lista<T> lista) {                    // "?" - qualquer tipo que se encaixe nessa regra

        if (lista.size() == 0) {
            throw new IllegalArgumentException("Lista vazia");
        }

        T maior = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).compareTo(maior) > 0) {
                maior = lista.get(i);
            }
        }

        return maior;
    }

    public static <T extends Comparable<? super T>> T min(Lista<T> lista) {

        if (lista.size() == 0) {
            throw new IllegalArgumentException("Lista vazia");
        }

        T menor = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).compareTo(menor) < 0) {
                menor = lista.get(i);
            }
        }

        return menor;
    }

    public static <T> void print(Lista<T> lista) {                            //imprime todos os elementos da lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public static <T> boolean contains(Lista<T> lista, T valor) {               //verifica se um valor existe dentro da lista
        for (int i = 0; i < lista.size(); i++) {
            if (valor.equals(lista.get(i))) {
                return true;
            }
        }
        return false;
    }
}