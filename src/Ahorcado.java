import java.util.Scanner;

//Juego de ahorcado, aprendiendo java.
public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arrays
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control iterativa
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control: Iterativa (Bucle)

        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar:" + String.valueOf(letrasAdivinadas) + "("+palabraSecreta.length()+" letras)");

            System.out.println("Introduce una letra, por favor");

            //Usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;
            // Estructura de control: Iterativa (Bucle)
            for (int i = 0; i < palabraSecreta.length(); i++) {
                //Estructura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto! Te quedan "+ (intentosMaximos - intentos) + " intentos");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades! Has adivinado la palabra secreta:"+ palabraSecreta);
            }
        }

        if(!palabraAdivinada){
            System.out.println("Game over");
        }

        scanner.close();
    }
}
