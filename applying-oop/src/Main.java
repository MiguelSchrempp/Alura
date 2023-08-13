public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "O poderoso chefão";
        meuFilme.dataDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.inclusoNoPlano = true;

        meuFilme.exibeDadosDoFilme();
        meuFilme.avaliarFilme(8);
        meuFilme.avaliarFilme(5);
        meuFilme.avaliarFilme(10);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.obterMediaDasNotas());
    }
}
