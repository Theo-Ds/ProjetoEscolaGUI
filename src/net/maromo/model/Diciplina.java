package net.maromo.model;

public class Diciplina {
    private int codigo;
    private String nome;
    private String professores;
    private String descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessores() {
        return professores;
    }

    public void setProfessores(String professores) {
        this.professores = professores;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Diciplina{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", professores='" + professores + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
