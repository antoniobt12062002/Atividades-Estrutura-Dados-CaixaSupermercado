import java.util.Random;
public class Programa {
    public static void main(String[] args) {
        
        Fila<Integer> fila = new Fila<Integer>();
        Random random = new Random();

        while(true){
            int numero = random.nextInt(100) + 1;
            fila.adicionar(numero);
        }

        
        




    }
}
