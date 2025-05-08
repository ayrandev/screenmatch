package br.com.alura.screenmatch.calculos;

public class FiltroDeRecomendacao {

    public void filtra( Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else if (classificavel.getClassificacao() >= 1) {
            System.out.println("Assista depois!");
        }
    }
}
