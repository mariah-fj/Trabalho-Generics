package lista;

public class ListaEncadeada <T> implements Lista<T> {
    private int tamanho;
    private No  inicio;
    private No  fim;

    public ListaEncadeada(){
        this.tamanho =0;
        this.inicio=null;
        this.fim=null;
    }
    //adiciona no final
    @Override
    public void add(T info){
        add(info, this.tamanho);
    }
    // metodo add(valor,int pos)
    @Override
    public void add(T info, int pos) {
        if (pos < 0 || pos > this.tamanho){
            throw new IllegalArgumentException("Posicao invalida!");
        }
        No novo = new No(info);
        if (pos == 0){
            novo.prox = this.inicio;
            this.inicio = novo;
            if (this.tamanho == 0){
                this.fim = novo;
            }
        }
        else if (pos == this.tamanho){

            if (this.fim != null){
                this.fim.prox = novo;
            }
            this.fim = novo;
        }
        else {
            No anterior = this.getNodo(pos -1);

            novo.prox = anterior.prox;
            anterior.prox = novo;
        }
        this.tamanho++;
    }

    //retorna elemento na Pos
    @Override
    public T get(int pos) {
        return this.getNodo(pos).info;
    }
    private No getNodo(int pos) {
        validaPos(pos);
        No aux = this.inicio;
        int cont=0;
        while(aux != null && cont!=pos) {
            cont++;
            aux= aux.prox;
        }
        return aux;
    }
    //remove na posicao
    @Override
    public T remove(int pos){
        //remover no inicio
        T ret;
        if(pos==0) {
            this.validaPos(pos);
            ret = this.inicio.info;
            this.inicio = this.inicio.prox;
            if(this.tamanho==1) {
                this.fim = null;
            }
        }
        //remover no final
        else if(pos==this.tamanho -1) {
            No nodoPenultimo = this.getNodo(this.tamanho-2);
            ret = this.fim.info;
            this.fim = nodoPenultimo;
            nodoPenultimo.prox = null;
        } else {
            //remover no meio
            No nodoAnterior = this.getNodo(pos-1);
            ret = nodoAnterior.prox.info;
            nodoAnterior.prox = nodoAnterior.prox.prox;
        }
        this.tamanho--;
        return ret;
    }


    @Override
    public boolean remove(T valor){
        for (int i = 0; i < this.tamanho; i++){ // percorre todas as posicoes da lista

            if (this.get(i).equals(valor)){
                remove(i);
                return true;
            }
        }
        return false;
    }

    private void validaPos(int pos) {
        if(pos<0 || pos> this.tamanho-1)
            throw new IllegalArgumentException("Posição da lista inválida!");
    }
    @Override
    public int size() {
        return this.tamanho;
    }
    //classe interna
    private class  No {                    // nó da lista encadeada
        T info;
        No prox;

        No(T informacao){
            this.info = informacao;
            this.prox = null;
        }
    }

    @Override
    public String toString() {
        String aux = "";
        for(int i=0;i<this.tamanho;i++){
            aux = aux+this.get(i);
            if(i!=this.tamanho-1) aux+=", ";
        }
        return aux;
    }
}

