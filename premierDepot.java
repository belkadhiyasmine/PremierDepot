System.out.println("HelloWorld")
public class Calculatrice {

    // Méthode pour additionner
    public double addition(double a, double b) {
        return a + b;
    }

    // Méthode pour soustraire
    public double soustraction(double a, double b) {
        return a - b;
    }

    // Méthode pour multiplier
    public double multiplication(double a, double b) {
        return a * b;
    }

    // Méthode pour diviser
    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erreur: Division par zéro impossible.");
        }
        return a / b;
    }
}
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calculatrice = new Calculatrice();
        boolean continuer = true;

        while (continuer) {
            System.out.println("Choisissez une opération :");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quitter");

            int choix = scanner.nextInt();

            if (choix == 5) {
                continuer = false;
                System.out.println("Au revoir!");
                break;
            }

            System.out.print("Entrez le premier nombre : ");
            double a = scanner.nextDouble();
            System.out.print("Entrez le second nombre : ");
            double b = scanner.nextDouble();

            try {
                double resultat = 0;
                switch (choix) {
                    case 1:
                        resultat = calculatrice.addition(a, b);
                        break;
                    case 2:
                        resultat = calculatrice.soustraction(a, b);
                        break;
                    case 3:
                        resultat = calculatrice.multiplication(a, b);
                        break;
                    case 4:
                        resultat = calculatrice.division(a, b);
                        break;
                    default:
                        System.out.println("Choix invalide. Veuillez réessayer.");
                        continue;
                }
                System.out.println("Le résultat est : " + resultat);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
