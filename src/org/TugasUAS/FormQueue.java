package org.TugasUAS;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.*;

public class FormQueue{
    private JButton btnProsesAntrian;
    private JButton btnAmbilNomorAntrian;
    private JLabel txtAtas1;
    private JLabel txtAtas2;
    private JLabel txtAtas3;
    private JLabel txtAtas4;
    private JTextArea textAntrian;
    private JLabel lbTotalAntrian;
    private JLabel lbJmlAntrian;
    private JLabel lbPanggilanAntrian;
    private JPanel rootPanel;
    private JLabel txtAtas;

    //membuat dan menginisialisasikan objec queue dengan menggunakan linked list
    Queue<Object> antrian = new LinkedList<>();
    int nomor = 0;

    public FormQueue() {
        btnAmbilNomorAntrian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                nomor++; //menambahkan nomor antrian
                String antr = "Antrian "+nomor; //menyimpan variabel antr kedalam variabel nomor
                antrian.add(antr); //menambahkan antrian ke list
                String cvt = String.valueOf(antrian.size());
                lbJmlAntrian.setText(cvt);
                lbPanggilanAntrian.setText(""+antrian.peek()); //menampilkan data yang paling atas
                lbTotalAntrian.setText(""+nomor);
                textAntrian.append(antr + "\n"); //mencetak semua antrian kedaftar antrian dengan menggunakan textarea list

                //inisialisasi waktu
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat s = new SimpleDateFormat("EEEE,dd-MMMM-YYYY HH:mm:ss");
                String tgl = s.format(cal.getTime());

                txtAtas.setText(tgl);
                txtAtas1.setText("Nomor Antrian");
                txtAtas2.setText("  " + nomor);
                txtAtas3.setText("Silahkan Menunggu " + cvt + " Antrian Lagi ");
                txtAtas4.setText("Mohon untuk bersabar");
            }
        });
        btnProsesAntrian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (antrian.isEmpty()) { //mengecek antrian kosong atau tidak
                    JOptionPane.showMessageDialog(rootPanel, "Silahkan Ambil No.Antrian terlebih dahulu !");
                }
                textAntrian.setText(""); //mengosongkan text area list antrian
                antrian.poll();
                antrian.forEach((Object element) -> {
                    textAntrian.append("" + element + "\n"); //mencetak semua antrian kedaftar antrian dengan menggunakan textarea list
                });
                if (antrian.isEmpty()) {
                    lbJmlAntrian.setText("0");
                    lbTotalAntrian.setText("0");
                    lbPanggilanAntrian.setText("-----");
                } else {
                    lbPanggilanAntrian.setText("" + antrian.peek()); //menampilkan data yang paling atas
                }
                String cvt = String.valueOf(antrian.size());
                lbJmlAntrian.setText(cvt);

                txtAtas1.setText("Nomor Antrian");
                txtAtas2.setText(" " + nomor);
                txtAtas3.setText("Mohon Tunggu Sebentar " + cvt + " Antrian Lagi");
                txtAtas4.setText("Mohon Untuk Bersabar");

            }
        });
    }

    public JPanel getRootPanel() {

        return rootPanel;
    }
}