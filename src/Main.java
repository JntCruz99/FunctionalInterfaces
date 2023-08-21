import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Consumer<Integer> imprimirNumeroImpar = numero ->{
            if (numero % 2 == 1){
                System.out.println(numero);
            }
        };
        numeros.stream().forEach(imprimirNumeroImpar);

        List<String> nomes = Arrays.asList("Jonatas" , "Rebeca", "Maria");

        Consumer<String> excluirNomes = nome ->{
            if (nome == "Jonatas"){
                nome = "Pedro";
            }
            System.out.println(nome);
        };

        nomes.stream().forEach(excluirNomes);
        
    }
}