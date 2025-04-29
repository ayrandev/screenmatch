public class Film {
    String nome;
    String descricao;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    int duracaoEmMinutos;

    int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Avaliacao: " + somaDasAvaliacoes);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    double obtemMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
