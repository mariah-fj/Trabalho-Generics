package lista;

public class ListaVetor <T> implements Lista<T>{
    private T[]itens;    // vetor onde os elementos serao guardados
    private int size;   // quantidade de elementos da lista


    // criando  vetor com capacidade para 10 elementos
    @SuppressWarnings("unchecked")
    public ListaVetor(){
        itens = (T[]) new Object[10];   // java nao permite criar vetor generico direto, entao usamos cast (conversao de tipo)
        size = 0;
    }

    @Override
    public void add(T valor) {
        add(valor,size);
    }

    @Override
    public void add(T valor, int pos) {
        if (pos < 0 || pos > size){
            throw new IllegalArgumentException("Posicao invalida");
        }
        for (int i = size; i > pos; i--){
            itens[i] = itens [i - 1];
        }

        itens[pos] = valor;
        size++;
    }

    @Override
    public T get(int pos) {
        return itens[pos];
    }

    @Override
    public T remove(int pos) {
        if (pos < 0 || pos >= size){
           throw new IllegalArgumentException("Posicao invalida");
        }
        T removido = itens [pos];
        for (int i = pos; i < size - 1; i++){             // desloca os elementos para esquerda
            itens[i] = itens [i + 1];
        }
        itens [size - 1] = null;                         // limpa a ultima posicao
        size--;                                          // atualiza o tamanho

        return removido;                                 // retorna o elemento removido
    }

    @Override
    public boolean remove(T valor) {
        for (int i = 0; i < size; i++){
            if (itens[i].equals(valor)){                        // compara cada elemento com o valor recebido usando equals
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;          // retorna quantos elementos estao na lista
    }
}
