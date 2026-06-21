package lista;

public class ListaVetor <T> implements Lista<T>{
    private T[]itens;    // vetor onde os elementos serao guardados
    private int size;   // quantidade de elementos da lista


    // criando  vetor com capacidade para 10 elementos
    @SuppressWarnings("unchecked")
    public ListaVetor(){
        itens = (T[]) new Object[10];
        size = 0;
    }

    @Override
    public void add(T valor) {
        itens[size] = valor;
        size++;
    }

    @Override
    public void add(T valor, int pos) {

    }

    @Override
    public T get(int pos) {
        return itens[pos];
    }

    @Override
    public T remove(int pos) {
        return null;
    }

    @Override
    public boolean remove(T valor) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}
