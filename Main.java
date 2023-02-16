import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

       System.out.print("Oi Ruth, qual o livro dessa vez? ");
        String livro = scanner2.next();

        System.out.println("Certo, você vai ler " + livro);

        System.out.println("Digite a quantidade de páginas que " + livro + " possui: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digite em quantos dias pretende finalizar a leitura: ");
        int valor2 = scanner.nextInt();

        double resultado = valor1 / valor2;

        System.out.println("Para finalizar essa leitura em " + valor2 + " dias, você precisa ler: " + resultado + " páginas.");

      scanner.close();
      scanner2.close();

    }
}
