package model;


 

public class TarefaModel {
    //atributos 
 
    private String nome;
    private boolean concluida;

    
    //construtores
    public TarefaModel() {
    }

    public TarefaModel(String nome) {
        this.nome = nome;
        this.concluida = concluida = false;
    }
    
    //GET E SET
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "TarefaModel{" + "nome=" + nome + ", concluida=" + concluida + '}';
    }
    
    
}

