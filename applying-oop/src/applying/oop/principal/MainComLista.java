package applying.oop.principal;

import applying.oop.entidade.Filme;
import applying.oop.entidade.Serie;
import applying.oop.entidade.Titulo;

import java.util.ArrayList;

public class MainComLista {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avaliarFilme(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avaliarFilme(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avaliarFilme(10);
        Serie lost = new Serie("Lost", 2004);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(filmeDoPaulo);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo titulo : lista) {
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }


        }
    }
}
