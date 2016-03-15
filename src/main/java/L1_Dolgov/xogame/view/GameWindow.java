package L1_Dolgov.xogame.view;

import L1_Dolgov.xogame.controller.GameController;
import L1_Dolgov.xogame.model.*;
import L1_Dolgov.xogame.model.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ксения on 15.03.2016.
 */
public class GameWindow extends JFrame {
    private static final long serialVersionUID = -7965916416316493178L;

    GameController gameController = GameController.instance();

    JButton buttons[][];

    JPanel panel = new JPanel();



    public GameWindow() {
        buttons = new JButton[3][3];
    }

    public void start(){
        setResizable(false);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();

                final int finalI = i;
                final int finalJ = j;
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        gameController.doShoot(new Point(finalI, finalJ), gameController.getUser().getType());
                        buttons[finalI][finalJ].setText(gameController.getUser().getType().toString());
                    }
                });
            }
        }
        panel.setLayout(new GridLayout(3,3));
        add(panel);


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
