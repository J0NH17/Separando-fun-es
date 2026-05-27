package view;

import controller.TarefaController;
import javax.swing.JOptionPane;
import model.TarefaModel;

public class TarefaView extends javax.swing.JFrame {

    TarefaController controller = new TarefaController();
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TarefaView.class.getName());

    public TarefaView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txfNome = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taLista = new javax.swing.JTextArea();
        btListarTarefa = new javax.swing.JButton();
        cbListaTarefas = new javax.swing.JComboBox<>();
        btOK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Tarefas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Novas Tarefas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setText("Nome da tarefa: ");

        txfNome.addActionListener(this::txfNomeActionPerformed);

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(this::btAdicionarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btAdicionar)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Tarefa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        taLista.setColumns(20);
        taLista.setRows(5);
        jScrollPane1.setViewportView(taLista);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );

        btListarTarefa.setText("Listar Tarefas");
        btListarTarefa.addActionListener(this::btListarTarefaActionPerformed);

        cbListaTarefas.addActionListener(this::cbListaTarefasActionPerformed);

        btOK.setText("ok");
        btOK.addActionListener(this::btOKActionPerformed);

        jLabel2.setText("Selecione uma tarefa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbListaTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btListarTarefa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbListaTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListarTarefa)
                    .addComponent(btOK))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNomeActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
      if(txfNome.getText().isEmpty()||txfNome.getText().contains(" ")){
            JOptionPane.showMessageDialog(null,"O campo do nome da tarefa está vazio ou contém espaços!");
            txfNome.setText("");
        }else{
            String nome = txfNome.getText();
            controller.adicionar(nome);
            JOptionPane.showMessageDialog(null,"Tarefa cadastrada!");
            txfNome.setText("");
            cbListaTarefas.addItem(nome);
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btListarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarTarefaActionPerformed
        
        // percorrer lista
        taLista.setText("");
        for(TarefaModel t : controller.listar() ){
            taLista.append(t.toString());
            taLista.append("\n");
        }
        
    }//GEN-LAST:event_btListarTarefaActionPerformed

    private void cbListaTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaTarefasActionPerformed
       
    }//GEN-LAST:event_cbListaTarefasActionPerformed

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
      if(controller.listar().isEmpty()){
      
      JOptionPane.showMessageDialog(null, "Nehuma tarefa cadastrada!");
      
      }else{ String[] opcoes = {"concluir", "remover"};

        int escolha = JOptionPane.showOptionDialog(
                null,
                cbListaTarefas.getSelectedItem().toString(), 
                "Oque fazer com essa tarefa ? ",    //Titulo da caixa
                JOptionPane.DEFAULT_OPTION,         //Botões desabilitados
                JOptionPane.OK_OPTION,              //Icones
                null,                               //Sempre null
                opcoes,                             //Vetor 
                opcoes[0]);                         //Inicio do vetor
        
         if (escolha == 0) {
             controller.listar().get(cbListaTarefas.getSelectedIndex()).setConcluida(true);
            JOptionPane.showMessageDialog(null, "tarefa concluida");
        } else if (escolha == 1) {
             controller.listar().remove(cbListaTarefas.getSelectedIndex());
             cbListaTarefas.removeItem(cbListaTarefas.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "TAREFA REMOVIDA !.");
        }
        
      }
        
    }//GEN-LAST:event_btOKActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new TarefaView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btListarTarefa;
    private javax.swing.JButton btOK;
    private javax.swing.JComboBox<String> cbListaTarefas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taLista;
    private javax.swing.JTextField txfNome;
    // End of variables declaration//GEN-END:variables

}
