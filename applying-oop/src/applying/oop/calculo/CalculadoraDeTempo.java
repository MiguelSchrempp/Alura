package applying.oop.calculo;

import applying.oop.entidade.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        tempoTotal+= f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        tempoTotal+= s.getDuracaoEmMinutos();
//    }
    public void inclui(Titulo t) {
        tempoTotal+= t.getDuracaoEmMinutos();
    }
}
