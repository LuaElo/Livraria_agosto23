import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RepositorioLivros{
   private List<Livro> livros = new ArrayList<>();

    public RepositorioLivros(){
        LivroFisico lf1 = new LivroFisico("titulo1", 15.00);
        livros.add(lf1);

        LivroFisico lf2 = new LivroFisico("titulo2", 45.00);
        livros.add(lf2);

        LivroDigital ld1 = new LivroDigital("titulo3", 16.00);
        livros.add(ld1);

        LivroDigital ld2 = new LivroDigital("titulo4", 17.00);
        livros.add(ld2);

        LivroBolso ldb1 = new LivroBolso("titulo5", 55.00);
        livros.add(ldb1);

        LivroBolso ldb2 = new LivroBolso("titulo6", 99.00);
        livros.add(ldb2);


    }
    public Optional<Livro> buscarPorTitulo (String titulo){
        var result = livros.stream().filter(a->titulo.equalsIgnoreCase(String.valueOf(a))).findAny();
        if(result.isPresent()){
            System.out.println("Nome valido");
        }

        else{
            System.out.println("Nome invalido");
        }
    }
    void exibir(){
        livros.forEach(a -> System.out.println(a));
    }

}
