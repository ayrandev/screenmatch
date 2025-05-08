package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private String descricao;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    //-------------------------------------------------//

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    //-------------------------------------------------//

    public void exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Avaliacao: " + somaDasAvaliacoes);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double obtemMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}

