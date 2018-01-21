import javax.swing.*;
import java.awt.*;

public class ExerciceDeux extends JFrame {
    public ExerciceDeux() throws HeadlessException {
        JPanel exoDeux = new JPanel();

        // Définit un titre pour notre fenêtre
        this.setTitle("Fenetre Zaldivar");
        // Définit la taille de la fenetre
        this.setSize(500, 200);
        // Positionner l'objet au centre
        this.setLocationRelativeTo(null);
        // Empecher le redimensionnement de la fenetre
        this.setResizable(false);
        // Definir le content panel de la fenetre
        this.setContentPane( exoDeux );
        // Rendre la fenetre visible
        this.setVisible(true);

        exoDeux.setBackground(Color.DARK_GRAY);

        // Déclaration et initialisation des variables
        int a;
        a = 5;
        int b;
        b = 10;
        int c;
        c = 0;
        // Affichage du contenu des variables
        JLabel labA = new JLabel("Le contenu des variables est :");
        JLabel labB = new JLabel("a = " + a);
        JLabel labC = new JLabel("b = " + b);
        JLabel labD = new JLabel("c = " + c);

        exoDeux.add(labA);
        exoDeux.add(labB);
        exoDeux.add(labC);
        exoDeux.add(labD);

        // Inversion du contenu de var a et var b
        c = a;
        a = b;
        b = c;

        // Affichage du contenu des variables
        JLabel labE = new JLabel("Le nouveau contenu des variables est :");
        JLabel labF = new JLabel("a = " + a);
        JLabel labG = new JLabel("b = " + b);
        JLabel labH = new JLabel("c = " + c);

        exoDeux.add(labE);
        exoDeux.add(labF);
        exoDeux.add(labG);
        exoDeux.add(labH);
    }
}
