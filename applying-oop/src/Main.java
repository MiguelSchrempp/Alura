import applying.oop.calculo.CalculadoraDeTempo;
import applying.oop.calculo.FiltroRecomendacao;
import applying.oop.entidade.Episodio;
import applying.oop.entidade.Filme;
import applying.oop.entidade.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setDataDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setInclusoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duracao em minutos: " + meuFilme.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();

        outroFilme.setNome("Avatar");
        outroFilme.setDataDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);



        meuFilme.exibeDadosDoFilme();
        meuFilme.avaliarFilme(8);
        meuFilme.avaliarFilme(5);
        meuFilme.avaliarFilme(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.obterMediaDasNotas());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setDataDeLancamento(2004);
        lost.exibeDadosDoFilme();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracao em minutos: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calc = new CalculadoraDeTempo();

        calc.inclui(meuFilme);
        calc.inclui(outroFilme);
        calc.inclui(lost);
        System.out.println(calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(meuFilme);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(lost);
        ep.setTotalVisualizacoes(300);
        filtro.filtra(ep);
    }
}
