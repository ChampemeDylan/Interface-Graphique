import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Method;

public class Fenetre extends JFrame{

    public Fenetre() {
        // Définit un titre pour notre fenêtre
        this.setTitle("Fenetre Zaldivar");
        // Définit la taille de la fenetre
        this.setSize(500, 200);
        // Positionner l'objet au centre
        this.setLocationRelativeTo(null);
        // Empecher le redimensionnement de la fenetre
        this.setResizable(false);
        // Termine le processus lorsqu'on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Definir le content panel de la fenetre
        this.setContentPane( pan() );
        // Rendre la fenetre visible
        this.setVisible(true);
    }

    public JPanel pan() {

        // Création d'un panel
        JPanel pan = new JPanel();
        // Couleur de fond panel
        pan.setBackground(Color.DARK_GRAY);

        // Instanciation des boutons.
        JButton exoUn = new JButton("Exercice 1");
        JButton exoDeux = new JButton("Exercice 2");
        JButton exoTrois = new JButton("Exercice 3");

        // Ajout des boutons au Content Pane
        pan.add(exoUn);
        pan.add(exoDeux);
        pan.add(exoTrois);

        // Ajout des actions sur les boutons
        exoUn.addActionListener(actionEvent ->{
            System.out.println("Click ! btn1");
            ExerciceUn exerciceUn = new ExerciceUn();
        });

        exoDeux.addActionListener(actionEvent ->{
            System.out.println("Click ! btn2");
            ExerciceDeux exerciceDeux = new ExerciceDeux();
        });

        exoTrois.addActionListener(actionEvent ->{
            System.out.println("Click ! btn3");
            ExerciceTrois exerciceTrois = new ExerciceTrois();
        });

        return pan;
    }
}
