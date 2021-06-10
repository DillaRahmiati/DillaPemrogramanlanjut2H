package org.javaGUI.TableSorting;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormSorting {
    private JTextField textInput;
    private JButton buttonHasil;
    private JTable tableSorting;
    private JPanel rootPanel;
    private JTextField textJumlah;
    private DefaultTableModel tableModel;
    private boolean added = false;
    private Object DefaultTableModel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public FormSorting() {
        this.initComponents();
        buttonHasil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DefaultTableModel model = (DefaultTableModel) tableSorting.getModel();
                String input = textInput.getText();
                int jumlah = Integer.parseInt(textJumlah.getText());
                String[] stmp = input.split(",");
                if (textJumlah.getText().length() > 3) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data Terlalu Banyak\nMax Input : 999",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (stmp.length > jumlah || stmp.length < jumlah) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Jumlah angka tidak sesuai jumlah yang diinput",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (!added) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow(new Object[]{});
                    }
                    added = true;
                }
                int a = 0;
                for (int i : Sorting.getas(input, jumlah)) {
                    model.setValueAt(i, a, 0);
                    a++;
                }
                int b = 0;
                for (int i : Sorting.getdes(input, jumlah)) {
                    model.setValueAt(i, b, 1);
                    b++;
                }
            }
        });
    }

    private void initComponents() {
        Object[] tableColom = {
                "Ascending",
                "Descending"
        };
        Object[][] initData = {};
        //set table model
        tableModel = new DefaultTableModel(initData, tableColom);
        tableSorting.setModel(tableModel);
        //menampilkan sorting di setiap kolom
        tableSorting.setAutoCreateRowSorter(true);
        //enable single selection
        tableSorting.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
}