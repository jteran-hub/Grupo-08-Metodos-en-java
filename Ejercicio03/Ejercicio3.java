public class Ejercicio3 {

    public double multiplicar(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        Ejercicio3 miObjeto = new Ejercicio3();

        double res = miObjeto.multiplicar(4.0, 5.5);

        System.out.println("Resultado: " + res);
    }
}
