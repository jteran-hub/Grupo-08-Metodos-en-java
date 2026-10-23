public class Calculadora {

    public static double calcularPromedio(
            double n1, double n2, double n3) {

        double promedio = (n1 + n2 + n3) / 3;

        return promedio;
    }

    public static void main(String[] args) {

        double nota1 = 8.5;
        double nota2 = 9.0;
        double nota3 = 10.0;

        double resultado = calcularPromedio(
                nota1, nota2, nota3);

        System.out.println("El promedio es: " + resultado);
    }
}
