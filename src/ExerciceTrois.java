import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class ExerciceTrois extends JFrame {

    public ExerciceTrois() throws HeadlessException {

        JPanel exoTrois = new JPanel();

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

        exoTrois.setBackground(Color.DARK_GRAY);

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez du texte : ");
        String phrase = sc.nextLine();
        System.out.println(phrase);
        */
    }

}
