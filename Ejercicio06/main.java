public class Main {

    public static boolean verificarEdad(int edad) {

        if (edad < 0 || edad > 120) {
            System.out.println("Edad invalida");
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

        int edad = 20;

        boolean resultado = verificarEdad(edad);

        System.out.println("Resultado: " + resultado);
    }
}
