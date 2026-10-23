public class Ejercicio1 {

    public static double calcularArea(double base, double altura) {
        double area = base * altura;
        System.out.println("El area es: " + area);
        return area;
    }

    public static void main(String[] args) {
        calcularArea(5.0, 3.0);
    }
}
