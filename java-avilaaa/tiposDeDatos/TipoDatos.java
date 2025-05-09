public class TipoDatos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escribe Tu nombre:");
    String nombre = scanner.nextLine();


    System.out.println("Ingresa la Inicial De Tu Nombre:");
    char inicial = scanner.nextLine();

    System.out.println("Ingresa tu estatura en metros:");
    double estatura = scanner.nextLine();


    System.out.println("Ingresa tu edad:");
    int edad = scanner.nextLine();


    System.out.println("¿eres estudiante? (true/false):");
    boolean esEstudiante =scanner.nextLine();

  }
}