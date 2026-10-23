public class Bienvenida {

    public static void mostrarBienvenida(String nombre, int edad) {
        System.out.println("Hola " + nombre + ", tienes " + edad
                + " años. ¡Bienvenido al sistema!");
    }

    public static void main(String[] args) {
        mostrarBienvenida("Julio", 21);
    }
}
