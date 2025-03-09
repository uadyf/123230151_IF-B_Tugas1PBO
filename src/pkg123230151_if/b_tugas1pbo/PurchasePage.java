package pkg123230151_if.b_tugas1pbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PurchasePage extends JFrame {
    private JTextField jumlahField;
    private JLabel totalHargaLabel;
    private JLabel jumlahLabel;
    private static final String[] LABEL_MAJALAH = {"Majalah Anak", "Majalah Remaja", "Majalah Dewasa"};
    private static final int[] HARGA_PER_PCS = {10800, 15200, 25400};

    public PurchasePage(int index) {
        setTitle("Halaman Pembelian");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0; gbc.gridy = 0;
        mainPanel.add(new JLabel("Kategori"), gbc);
        gbc.gridx = 1;
        mainPanel.add(new JLabel(LABEL_MAJALAH[index]), gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        mainPanel.add(new JLabel("Harga"), gbc);
        gbc.gridx = 1;
        mainPanel.add(new JLabel(HARGA_PER_PCS[index] + "/pcs"), gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        mainPanel.add(new JLabel("Jumlah"), gbc);
        gbc.gridx = 1;
        jumlahField = new JTextField(10);
        mainPanel.add(jumlahField, gbc);

        JPanel summaryPanel = new JPanel(new GridBagLayout());
        gbc.gridx = 0; gbc.gridy = 0;
        summaryPanel.add(new JLabel("Total Pembelian"), gbc);
        gbc.gridx = 1;
        summaryPanel.add(new JLabel("Harga Satuan"), gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        summaryPanel.add(new JLabel(HARGA_PER_PCS[index] + "/pcs"), gbc);
        gbc.gridx = 1;
        summaryPanel.add(new JLabel("Jumlah"), gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        jumlahLabel = new JLabel("- pcs");
        summaryPanel.add(jumlahLabel, gbc);
        gbc.gridx = 1;
        summaryPanel.add(new JLabel("Total Harga"), gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        totalHargaLabel = new JLabel("Rp0");
        summaryPanel.add(totalHargaLabel, gbc);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton kembaliButton = new JButton("Kembali");
        JButton beliButton = new JButton("Beli");
        buttonPanel.add(kembaliButton);
        buttonPanel.add(beliButton);

        JPanel containerPanel = new JPanel(new BorderLayout());
        containerPanel.add(mainPanel, BorderLayout.NORTH);
        containerPanel.add(summaryPanel, BorderLayout.CENTER);
        containerPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(new JLabel("Halaman Pembelian", SwingConstants.CENTER), BorderLayout.NORTH);
        add(containerPanel, BorderLayout.CENTER);

        kembaliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new HomePage("123230151").setVisible(true);
            }
        });

        beliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int jumlah = Integer.parseInt(jumlahField.getText());
                    int totalHarga = jumlah * HARGA_PER_PCS[index];
                    jumlahLabel.setText(jumlah + " pcs");
                    totalHargaLabel.setText("Rp" + totalHarga);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan jumlah yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }
}