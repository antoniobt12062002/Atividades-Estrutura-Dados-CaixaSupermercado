public class ListaLigada<TIPO> {
    private Node<TIPO> primeiro;
    private Node<TIPO> ultimo;
    private int tamanho;
    
    public ListaLigada(){
        this.tamanho = 0;
    }

    public Node<TIPO> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Node<TIPO> primeiro) {
        this.primeiro = primeiro;
    }

    public Node<TIPO> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Node<TIPO> ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void adicionar(TIPO novoValor){
        Node<TIPO> novoNode = new Node<TIPO>(novoValor);
        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = novoNode;
            this.ultimo = novoNode;            
        }else{
            this.ultimo.setProximo(novoNode);
            this.ultimo = novoNode;            
        }
        this.tamanho++;
    }
    
    public void remover(TIPO valorProcurado){
        Node<TIPO> anterior = null;
        Node<TIPO> atual = this.primeiro;
        for(int i=0; i < this.getTamanho(); i++){            
            if (atual.getValor().equals(valorProcurado)){
                if (this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }else if (atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }else if (atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
    
    public Node get(int posicao){
        Node atual = this.primeiro;
        for(int i=0; i < posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }
}
