public class LivroFisico extends Livro{
    public LivroFisico(String nome, double preco) {
        super(nome, preco);
    }
     public double getTaxaInpressao(){
        return preco * 0.05;
    }

    public void aplicarDesconto(){
        preco -= preco* 0.35;
    }

    void aplicarDesconto(double percentual)
    {
        if (percentual > 0.3)
            System.out.println("Desconto não permitido");
        else
            preco = preco - (preco * percentual);

    }




}
