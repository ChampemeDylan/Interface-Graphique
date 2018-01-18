package testPackage;

import java.lang.System.Logger;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean azer;
		azer = true;
		while (azer = true) {

			System.out.println("Entre le numéro de l'exercice a tester : ");
			Scanner summary = new Scanner(System.in);
			int numeroExercice = summary.nextInt();
			System.out.println("Tu as choisi l'exercice : " + numeroExercice);

		switch (numeroExercice) {
// Exercice 1
			case 1:
				// Déclaration des String
				String sad;
				String happy;
				// Initialisation des String
				sad = "Au revoir monde cruel";
				happy = "Hello World !";
				//Affichage des String
				System.out.println(sad);
				System.out.println(happy);
				break;
// Exercice 2
			case 2:
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
				break;
// Exercice 3
			case 3:
				Scanner sc = new Scanner(System.in);
				System.out.println("Saisissez du texte : ");
				String phrase = sc.nextLine();
				System.out.println(phrase);
				break;
// Exercice 4
			case 4:
				Scanner scd = new Scanner(System.in);
				System.out.println("Saisissez votre adresse : ");
				String adresse = scd.nextLine();
				System.out.println("Votre adresse : " + adresse);

				Matcher matcher = Pattern.compile("\\d{5}").matcher(adresse);
				if(matcher.find()) {
				    String codePostal = matcher.group();
				    System.out.println("Votre code postal : " + codePostal + " (String)");
				    long codePostalB = Integer.valueOf(codePostal).intValue();
				    System.out.println("Votre code postal est : " + codePostalB + " (long)");
				    long codePostalCarre = codePostalB * codePostalB;
				    System.out.println("Votre code postal au carré est : " + codePostalCarre);
				}
				break;
// Exercice 5
			case 5:

				System.out.println("Saisissez un nombre entre 10 et 20 : ");
				Scanner sca = new Scanner(System.in);
				String chaineSaisie = "1";
				byte nombreSaisi = Integer.valueOf(chaineSaisie).byteValue();

				while ( nombreSaisi <= 10 || nombreSaisi >= 20 ) {
					chaineSaisie = sca.nextLine();
					nombreSaisi = Integer.valueOf(chaineSaisie).byteValue();
					System.out.println("Vous avez saisi le nombre : " + nombreSaisi + " (byte)");
					if ( nombreSaisi < 10 ) {
						System.out.println("C'est pas dur pourtant... ( plus grand )");
					} else if ( nombreSaisi > 20 ) {
						System.out.println("C'est pas dur pourtant... ( plus petit )");
					}
				}
				System.out.println("Félicitations mon con, tu es capable de lire une consigne !");

				break;
// Exercice 6
			case 6:
				int result;
				System.out.println("Saisissez un nombre : ");
				Scanner scc = new Scanner(System.in);
				int nombreB = scc.nextInt();
				System.out.println("Saisissez un deuxieme nombre : ");
				Scanner scb = new Scanner(System.in);
				int nombreA = scb.nextInt();

				result = nombreA + nombreB;
				if (result == 0) {
					System.out.println("Leur produit est nul.");
				} else if (result > 0) {
					System.out.println("Leur produit est positif.");
				} else if (result < 0) {
					System.out.println("Leur produit est negatif.");
				} else {
					System.out.println("Je suis parti en couille frère...");
				}
				break;
// Exercice 7
			case 7:
				long aSept;
				long resultSept = 0L;
				long maxSept = 10_000L;
				long minSept = -10_000L;
				System.out.println("Saisissez un nombre :");
				Scanner scanSept = new Scanner(System.in);
				aSept = scanSept.nextInt();
				System.out.println("Vous avez saisi le nombre " + aSept );
				for(int i=1 ; i<=aSept ; i++) {
					resultSept = resultSept+i;
					System.out.println(resultSept);
				}
				break;
// Exercice 8
			case 8:
				int aHuit;
				int resultHuit = 0;
				System.out.println("Saisissez un nombre entre 1 et 20 :");
				Scanner scanHuit = new Scanner(System.in);
				aHuit = scanHuit.nextInt();
				for(int i=1 ; i<=aHuit ; i++) {
					resultHuit = resultHuit + i;
				}
				switch (resultHuit) {
				case 1:
					System.out.println("un");
					break;
				case 3:
					System.out.println("trois");
					break;
				case 6:
					System.out.println("six");
					break;
				case 10:
					System.out.println("dix");
					break;
				case 15:
					System.out.println("quinze");
					break;
				case 21:
					System.out.println("vingt et un");
					break;
				case 28:
					System.out.println("vingt-huit");
					break;
				case 36:
					System.out.println("trente-six");
					break;
				case 45:
					System.out.println("quarante-cinq");
					break;
				case 55:
					System.out.println("cinquante-cinq");
					break;
				case 66:
					System.out.println("soixante-six");
					break;
				case 78:
					System.out.println("Soixante-dix-huit");
					break;
				case 91:
					System.out.println("quattre-vingt-onze");
					break;
				case 105:
					System.out.println("cent-cinq");
					break;
				case 120:
					System.out.println("cent-vingt");
					break;
				case 136:
					System.out.println("cent-trente-six");
					break;
				case 153:
					System.out.println("cent-cinquante-trois");
					break;
				case 171:
					System.out.println("cent-soixante et onze");
					break;
				case 190:
					System.out.println("cent-quattre-vingt-dix");
					break;
				case 210:
					System.out.println("deux-cent-dix");
					break;
				}
				break;
//Exercice 9
			case 9:
				Scanner scNeuf = new Scanner(System.in);
				String str = scNeuf.nextLine();
				char carac = str.charAt(1);
				System.out.println(carac);
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				break;
			case 15:
				break;
			case 16:
				break;
		}
		}
	}
}
