

package controller;
 
 import model.TarefaModel;
 import java.util.ArrayList;

public class TarefaController {
    //Lista
    private ArrayList<TarefaModel> lista = new ArrayList<>();
     
    //adicionar obj
    
    public void adicionar(String nome){
        
        TarefaModel tarefa = new TarefaModel(nome);
        lista.add(tarefa);
          
    }
    //remover obj
    public void remover(String nome){
        
        lista.remove(nome);
          
    }
    //metodo listar
    public ArrayList<TarefaModel> listar(){
        return lista;
    }
    
    
}

