package applying.oop.calculo;

public class FiltroRecomendacao {

    public void filtra(Classificavel c) {
        if (c.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos");
        } else if (c.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
