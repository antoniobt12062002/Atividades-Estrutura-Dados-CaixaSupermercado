public class Fila<TIPO> {
    private ListaLigada<TIPO> lista;
    
    public Fila(){
        this.lista = new ListaLigada<TIPO>();
    }
    
    public void adicionar(TIPO novoValor){
        this.lista.adicionar(novoValor);
    }
    
    public void remover(){
        this.lista.remover(this.get());
    }
    
    public TIPO get(){
        return this.lista.getPrimeiro().getValor();
    }
}