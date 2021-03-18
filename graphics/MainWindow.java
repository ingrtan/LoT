package graphics;

import java.io.IOException;
import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {
    private final JPanel cardPane;
    private final CardLayout card;
    
    private JPanel homeScreenPanel;
    private JPanel gameScreenPanel;
    
    public MainWindow() throws IOException {
        setTitle("LoT");
        setSize(new Dimension(1400, 700));
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        card = new CardLayout();
        cardPane = new JPanel();
        cardPane.setLayout(card);
        add(cardPane);
        
        initHomeScreen();
        initGameScreen();
        
        cardPane.add(homeScreenPanel, "homeScreenPanel");
        cardPane.add(gameScreenPanel, "gameScreenPanel");
        
        card.show(cardPane, "homeScreenPanel");
        setVisible(true);
    }

    private void initHomeScreen(){
        //TODO
    }

    private void initGameScreen(){
        //TODO
    }
} 