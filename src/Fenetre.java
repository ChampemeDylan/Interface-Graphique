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
        JButton exoQuatre = new JButton("Exercice 4");
        JButton exoCinq = new JButton("Exercice 5");
        JButton exoSix = new JButton("Exercice 6");
        JButton exoSept = new JButton("Exercice 7");
        JButton exoHuit = new JButton("Exercice 8");
        JButton exoNeuf = new JButton("Exercice 9");

        // Ajout des boutons au Content Pane
        pan.add(exoUn);
        pan.add(exoDeux);
        pan.add(exoTrois);
        pan.add(exoQuatre);
        pan.add(exoCinq);
        pan.add(exoSix);
        pan.add(exoSept);
        pan.add(exoHuit);
        pan.add(exoNeuf);

        // Ajout des actions sur les boutons
        exoUn.addActionListener(actionEvent ->{
            System.out.println("Click ! btn1");
            panA();
        });

        exoDeux.addActionListener(actionEvent ->{
            System.out.println("Click ! btn2");
            this.setContentPane(panB());
        });

        exoTrois.addActionListener(actionEvent ->{
            System.out.println("Click ! btn3");
        });

        exoQuatre.addActionListener(actionEvent ->{
            System.out.println("Click ! btn4");
        });

        exoCinq.addActionListener(actionEvent ->{
            System.out.println("Click ! btn5");
        });

        exoSix.addActionListener(actionEvent ->{
            System.out.println("Click ! btn6");
        });

        exoSept.addActionListener(actionEvent ->{
            System.out.println("Click ! btn7");
        });

        exoHuit.addActionListener(actionEvent ->{
            System.out.println("Click ! btn8");
        });

        exoNeuf.addActionListener(actionEvent ->{
            System.out.println("Click ! btn9");
        });
        return pan;
    }



    // Exercice 1 Methode
    public void panA() {

        JPanel panA = new JPanel();
        panA.setBackground(Color.DARK_GRAY);
        this.setTitle("Exercice 1");


        // Déclaration/Initialisation des String
        String sad = "Au revoir monde cruel";
        String happy = "Hello World !";

        // Affichage des du contenu des String
        JLabel labelA = new JLabel(sad);
        JLabel labelB = new JLabel(happy);
        panA.add( labelA );
        panA.add( labelB );

        //

        this.setContentPane(panA);
        // this.revalidate();
        this.setVisible(true);
    }



    // Exercice 2 Methode
    public JPanel panB() {

        JPanel panB = new JPanel();

        // Déclaration et initialisation des variables
        int a;
        a = 5;
        int b;
        b = 10;
        int c;
        c = 0;
        // Affichage du contenu des variables
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c + "\n");
        // Inversion du contenu de var a et var b
        c = a;
        a = b;
        b = c;
        // Affichage du contenu des variables
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c + "\n");

        this.setTitle("Exercice 2");
        this.setVisible(true);

        return panB;
    }

    // Exercice 3 Methode

    // Exercice 4 Methode

    // Exercice 5 Methode

    // Exercice 6 Methode

    // Exercice 7 Methode

    // Exercice 8 Methode

    // Exercice 9 Methode
}
