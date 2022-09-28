public class Node<TIPO> {
    private TIPO valor;
    private Node<TIPO> proximo;
    
    public Node(TIPO novoValor){
        this.valor = novoValor;
    }

    public TIPO getValor() {
        return valor;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }

    public Node<TIPO> getProximo() {
        return proximo;
    }

    public void setProximo(Node<TIPO> proximo) {
        this.proximo = proximo;
    }
}
