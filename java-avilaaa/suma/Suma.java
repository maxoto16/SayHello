import java.util.Scanner;

public class Suma {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escribe Numero1:");
    double numero1 = scanner.nextDouble();

    System.out.println("Escribe Numero2:");
    double numero2 = scanner.nextDouble();

    System.out.println("Escribe Numero3:");
    double numero3 = scanner.nextDouble();

    System.out.println("Escribe Numero4:");
    double numero4 = scanner.nextDouble();

    double resultado = (numero1+numero2+numero3+numero3);


    System.out.println("Resultado:" + resultado);



  }
}