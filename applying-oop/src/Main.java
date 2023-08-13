import applying.oop.entidade.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setDataDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setInclusoNoPlano(true);

        meuFilme.exibeDadosDoFilme();
        meuFilme.avaliarFilme(8);
        meuFilme.avaliarFilme(5);
        meuFilme.avaliarFilme(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.obterMediaDasNotas());
    }
}
