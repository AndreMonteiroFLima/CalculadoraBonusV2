package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class BonusView {
    private JLabel funcionarioLabel;
    private JTable funcionariosTable;
    private JButton proximaTelaBtn;
    private JButton exitBtn;
    private JPanel funcionariosJPanel;
    private JPanel btnPanel;

    public BonusView() {

    }

    public void exibir(){
        JFrame frame = new JFrame("Bonus");
        frame.setContentPane(funcionariosJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        criaTabelaFuncionarios();
        //funcionariosJPanel.add(funcionariosTable);
        frame.setVisible(true);
    }

    private void criaTabelaFuncionarios(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nome");
        model.addColumn("Salário");
        model.addColumn("Bonus");

        funcionariosTable.setModel(model);
    }

}
