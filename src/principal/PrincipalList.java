package principal;

import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalList {
    public static void main(String[] args) {
        Serie lostSerie = new Serie("Lost", 2000);
        lostSerie.avalia(9);
        Film thorFilme = new Film("Thor", 2020);
        thorFilme.avalia(10);
        Film lokiFilme = new Film("Loki", 2000);
        lokiFilme.avalia(8);
        var vingadores = new Film("Vingadores", 2010);
        vingadores.avalia(10);
        Film avatarFilme = new Film("Avatar", 2012);
        avatarFilme.avalia(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(vingadores);
        lista.add(lokiFilme);
        lista.add(thorFilme);
        lista.add(lostSerie);
        lista.add(avatarFilme);

        for (Titulo item : lista){
            System.out.println(item.getNome());
            if (item instanceof Film film && lokiFilme.getClassificacao() > 2) {
                System.out.println("Classificacao " + ((Film) item).getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Ayran Vieira");
        buscaPorArtista.add("Paulo Vieira");
        buscaPorArtista.add("Caio Costa");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Ordenando" + buscaPorArtista);
        Collections.sort(lista);
        System.out.println("Aqui estão todos os titulos em ordem alfabética: " + lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano " + lista);
    }

}
