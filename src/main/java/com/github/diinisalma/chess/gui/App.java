package com.github.diinisalma.chess.gui;

import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Membuat frame baru
        JFrame window = new JFrame("Chess");

        // Membuat GamePanel yang akan di tambahkan ke frame
        GamePanel gamePanel = new GamePanel();

        // Menambahkan GamePanel ke frame
        window.add(gamePanel);

        // Menyesuaikan ukuran frame dengan ukuran GamePanel
        window.pack();

        // Menentukan aksi yang akan dilakukan ketika frame di close
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menentukan apakah frame dapat di resize atau tidak
        window.setResizable(false);

        // Menentukan lokasi frame di layar
        window.setLocationRelativeTo(null);

        // Menampilkan frame
        window.setVisible(true);
    }
}
