import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class ExerciceTrois extends JFrame {

    public ExerciceTrois() throws HeadlessException {

        JPanel exoTrois = new JPanel();
        JLabel labA = new JLabel("Saisissez du texte :");
        JLabel labB = new JLabel();
        JLabel labOk = new JLabel();
        JTextField jText = new JTextField();
        JButton ok = new JButton("Ok");

        // Définit un titre pour notre fenêtre
        this.setTitle("Fenetre Zaldivar");
        // Définit la taille de la fenetre
        this.setSize(500, 200);
        // Positionner l'objet au centre
        this.setLocationRelativeTo(null);
        // Empecher le redimensionnement de la fenetre
        this.setResizable(false);
        // Definir le content panel de la fenetre
        this.setContentPane( exoTrois );
        // Rendre la fenetre visible
        this.setVisible(true);
        // Definir la couleur de fond du panel
        exoTrois.setBackground(Color.DARK_GRAY);

        // Definition de la grille
        this.setLayout(new GridLayout(4, 1));

        // saisissez du texte
        exoTrois.add(labA);
        // champ de saisie
        exoTrois.add(jText);
        // definition taille champ saisie
        jText.setPreferredSize(new Dimension(100,20));

        // Ajout du bouton Ok au JPanel
        exoTrois.add(ok);

        // Ajout d'actions sur le bouton OK
        ok.addActionListener(actionEvent ->{

            // Verifier fonctionnement du click dans la console
            System.out.println("Click ! btn ok");

            // Ajout du contenu du champ de saisie dans le JLabel
            labOk.setText(jText.getText());
            //Ajouter le JLabel a l'interface graphique
            exoTrois.add(labOk);

            // Mise a jour contenu fenetre
            exoTrois.repaint();
            exoTrois.revalidate();
        });

    }

}
