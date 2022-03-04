import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int novamente = 0;
        do {
            try {
                double a, b, c, delta, x1, x2;
                System.out.println("EQUAÇÂO DO 2º GRAU: \nax² + bx + cx = 0 \n");
                Scanner scan = new Scanner(System.in);

                System.out.println("Insira o valor de A: ");
                a = scan.nextDouble();
                do {
                    if (a == 0) {
                        System.out.println("O valor de A não pode ser zero, pois esta é uma equação de segundo grau!\nPor favor, digite outro valor.");
                        System.out.println("Insira o valor de A: ");
                        a = scan.nextDouble();
                    }
                    break;
                } while (true);

                System.out.println("Insira o valor de B: ");
                b = scan.nextDouble();
                System.out.println("Insira o valor de C: ");
                c = scan.nextDouble();

                delta = b * b - 4 * a * c;

                x1 = 0;
                x2 = 0;

                if (delta > 0) {
                    x1 = (-b + Math.sqrt(Math.abs(delta))) / (2 * a);
                    x2 = (-b - Math.sqrt(Math.abs(delta))) / (2 * a);

                    System.out.println("\nDelta vale :" + delta);
                    System.out.println("\nx1 vale: " + x1 + "\nx2 vale: " + x2);
                } else {
                    throw new errorException("O valor de delta foi: " + delta + ". Sendo este um valor negativo, a equação não admite solução real.");
                }
            } catch (errorException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("\nDeseja fazer um novo cáculo? Digite 1 para SIM e 0 para FINALIZAR.");
            Scanner scan = new Scanner(System.in);
            novamente = scan.nextInt();
        } while (novamente == 1);
    }
}
