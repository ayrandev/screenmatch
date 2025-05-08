import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Film thorFilme = new Film("O poderoso chefão");
        thorFilme.setDescricao("Um filme de comedia infantil");
        thorFilme.setAnoDeLancamento(2020);
        thorFilme.setDuracaoEmMinutos(180);
        thorFilme.exibeFichaTecnica();

        //---------------------------------------//

        Serie lostSerie = new Serie();
        lostSerie.setNome("Lost");
        lostSerie.setDescricao("Serie de suspense e terror");
        lostSerie.setAnoDeLancamento(2000);
        lostSerie.exibeFichaTecnica();
        lostSerie.setTemporadas(15);
        lostSerie.setEpisodiosPorTemporada(10);
        lostSerie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar: " + lostSerie.getDuracaoEmMinutos());

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(lostSerie);
        primeiro.setTotalDeAvaliacoes(300);

        //------------------------------------------------//

        Film lokiFilme = new Film("Loki");
        lokiFilme.setDescricao("Um filme da marvel");
        lokiFilme.exibeFichaTecnica();
        lokiFilme.setAnoDeLancamento(2020);
        lokiFilme.setDuracaoEmMinutos(220);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(lokiFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(lokiFilme);

        //--------------------------------------------------//

        var vingadores = new Film("Vingadores");
        vingadores.setDuracaoEmMinutos(200);
        vingadores.setNome("Vingadores");
        vingadores.setAnoDeLancamento(2010);
        vingadores.avalia(10);

        ArrayList<Film> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(vingadores);
        listaDeFilmes.add(lokiFilme);
        listaDeFilmes.add(thorFilme);
        System.out.println("Sua lista contém: "+ listaDeFilmes.size());
        System.out.println("Primeiro filme da dua lista é " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme é:  " + listaDeFilmes.get(0).toString());


    }
}
