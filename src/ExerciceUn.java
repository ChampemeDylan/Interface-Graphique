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

        exoUn.setBackground(Color.DARK_GRAY);

        // Déclaration des Strings
        String sad;
        String happy;

        // Initialisation des Strings
        sad = "Au revoir monde cruel";
        happy = "Hello World !";

        JLabel a = new JLabel(sad);
        JLabel b = new JLabel(happy);

        exoUn.add(a);
        exoUn.add(b);
    }
}
