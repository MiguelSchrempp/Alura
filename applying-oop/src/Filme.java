public class Filme {
    String nome;
    int dataDeLancamento;
    boolean inclusoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeDadosDoFilme(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + dataDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + inclusoNoPlano);
    }

    void avaliarFilme(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double obterMediaDasNotas(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
