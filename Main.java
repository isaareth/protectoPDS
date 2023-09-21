import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int menu1;
    String  emocion;
    String  entorno;
    
    System.out.print("Por favor, ingresa tu nombre de usuario: ");
    String nombreUsuario = input.next();
    
    System.out.print("Por favor, ingresa el nombre de tu contacto de apoyo: ");
    String nombreCA = input.next();
    
    System.out.print("Por favor, ingresa el numero telefónico de tu contacto de apoyo: ");
    long contactoCA = input.nextLong();
    
    System.out.println("¡Hola, " + nombreUsuario + "! Bienvenid@. Tu contacto de apoyo es: " + nombreCA);
    
    System.out.println("Por favor indica qué deseas hacer:");
    System.out.println("1. Registrar emoción");
    System.out.println("2. Identificar emoción");

    menu1 = input.nextInt();
    

    if (menu1 == 1) {
      System.out.println("Escribe tu emoción:");
          emocion = input.next();
      System.out.println("Escribe el entorno:");
          entorno = input.next();
      if (emocion.equalsIgnoreCase("felicidad")){
        System.out.println("Felicitaciones, sigue frecuentando tu " + entorno);
      }
    }

    if (menu1==2) {
      System.out.println(" A continuación una lista de cómo se sienten ciertas emociones ");
      System.out.println(" ");
      System.out.println(" Felicidad: La felicidad a menudo se manifiesta como una sensación de alegría y euforia. Puede hacer que te sientas emocionado, lleno de energía y con ganas de celebrar. Esta sensación puede ser contagiosa y puede hacer que quieras compartir tu felicidad con los demás. ");
      System.out.println(" ");
      System.out.println(" Cuando experimentas felicidad, es común sentir una sensación de ligereza, como si una carga se hubiera levantado de tus hombros. Te sientes libre de preocupaciones y tensiones. La felicidad suele ir acompañada de una sonrisa genuina y risas espontáneas. Tu rostro se ilumina con una expresión alegre y contagiosa.");
      
      
    }

    

    //System.out.println( "Ingresa una contraseña");

    //String contrasena = input.next();

    
  }
}
