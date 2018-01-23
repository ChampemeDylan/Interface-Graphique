import javax.swing.*;
import java.awt.*;

public class ExerciceUn extends JFrame {
    public ExerciceUn() throws HeadlessException {

        JPanel exoUn = new JPanel();

        // Définit un titre pour notre fenêtre
        this.setTitle("Fenetre Zaldivar");
        // Définit la taille de la fenetre
        this.setSize(500, 200);
        // Positionner l'objet au centre
        this.setLocationRelativeTo(null);
        // Empecher le redimensionnement de la fenetre
        this.setResizable(false);
        // Definir le content panel de la fenetre
        this.setContentPane( exoUn );
        // Rendre la fenetre visible
        this.setVisible(true);
        // Defini la couleur de fond du JPanel
        exoUn.setBackground(Color.DARK_GRAY);

        // Definition de la grille
        this.setLayout(new GridLayout(2, 1));

        // Déclaration des Strings
        String sad;
        String happy;

        // Initialisation des Strings
        sad = "Au revoir monde cruel";
        happy = "Hello World !";

        // Ajout du contenu des JLabel
        JLabel a = new JLabel(sad);
        JLabel b = new JLabel(happy);

        // Ajout des JLabel au JPanel
        exoUn.add(a);
        exoUn.add(b);
    }
}
