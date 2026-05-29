

package controller;
 
 import model.TarefaModel;
 import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TarefaController {
    //Lista
    private ArrayList<TarefaModel> lista = new ArrayList<>();
     
    //adicionar obj
    
    public boolean adicionar(String nome){
        // boolean para 
        try {
            
            if(nome.isEmpty()){
                return false;
            }else{
            
                for (TarefaModel t : lista) {
                   if( t.getNome().equalsIgnoreCase(nome)){
                   
                    return false;
                   }

                    //Verifica se é igual cada um da lista por toda a lista! 
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro no for !");
        }
        
        TarefaModel tarefa = new TarefaModel(nome);
        lista.add(tarefa);
        return true;
          
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

