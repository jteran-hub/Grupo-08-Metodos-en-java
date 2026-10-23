 public class Main {

    public static void modificarNumero(int numero) {
        numero = 20;
        System.out.println("Dentro del metodo: " + numero);
    }

    public static void main(String[] args) {
        int numero = 10;

        modificarNumero(numero);

        System.out.println("Valor original: " + numero);
    }
}
