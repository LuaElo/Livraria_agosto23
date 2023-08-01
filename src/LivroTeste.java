public class LivroTeste {

    public static void main(String[] args) {
        RegistroVendas venda = new RegistroVendas();

        LivroFisico meuLivro = new LivroFisico( "J. R. Tolkien", 9.99);
        meuLivro.setNome( "O Hobbit");
        meuLivro.setPaginas(521);
        meuLivro.setResumo( "bla ");
        meuLivro.setAutor( "J. R. Tolkien");

        Editora editora1 = new Editora();
       // editora1.nome = "Erika";
        editora1.email= "edErika@erika.com.br";
        meuLivro.setEditora(editora1);

        //meuLivro.aplicarDesconto(0.5);

        meuLivro.exibirDados();
        venda.adicionar(meuLivro);

        LivroDigital livroFavorito = new LivroDigital("Dan Brown", 9.99);
        livroFavorito.setNome("O Código Da Vinci");
        livroFavorito.setResumo("bla bla bla bla bla");
        livroFavorito.setPaginas( 500);
        livroFavorito.setAutor("Dan Brown");
        livroFavorito.setMarcaDAgua("email@teste.com");
        Editora editora2 = new Editora("Editora Erika");
        // editora1.nome = "Erika";
        editora1.email= "edErika@erika.com.br";
        meuLivro.setEditora(editora2);
        livroFavorito.setTipoCapa(TipoCapaEnum.PERSONALIZADA);


        //livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();
        venda.adicionar(livroFavorito);

        Vouchers cupons = new Vouchers();
        cupons.validar("Etec19");
        cupons.exibir();


    }

}
