package SuppllierExample;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {
        Supplier<String> saudacoes = () -> "Ola, seja bem-vindo !";

        List<String> listaSaudacoes = Stream.generate(saudacoes)
                .limit(11).toList();
        listaSaudacoes.forEach(System.out::println);
    }
}
