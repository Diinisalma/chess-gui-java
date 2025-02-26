package com.github.diinisalma.chess.gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
    public static final int BOARD_WIDTH = 1700;
    public static final int BOARD_HEIGHT = 1700;

    public GamePanel() {
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        setBackground(Color.WHITE);

    }
}
