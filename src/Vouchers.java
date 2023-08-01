import java.util.*;

public class Vouchers {
    // não permite itens  duplicados
    Set<String> itens = new HashSet<>();
    //list<String> itens = new arraylist<>(); = lista
    public Vouchers(){
        itens.add("Etec-Teste");
        Random gerador = new Random();
        for (int i = 0 ; i < 20 ; i++){
            String chave = "Etec" + gerador.nextInt(30);
            itens.add(chave);
        }
    }

    void validar(String item){
        // stream que permite manipular listas
        // converter objetos, filtrar, buscar
        var result = itens.stream().filter(e->item.equalsIgnoreCase(e)).findAny();
        if(result.isPresent()){
            System.out.println("cupom valido");
        }
        else{
            System.out.println("cupom invalido");
        }
    }
    void exibir(){
        itens.forEach(e -> System.out.println(e));
    }

}
