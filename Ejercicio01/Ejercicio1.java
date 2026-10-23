Ejercicio 1: Identificación de tipos de retorno
Enunciado: Dado el siguiente método, explica por qué genera un error de compilación en Java y cómo lo corregirías:

public class Ejercicio1 {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = sumar(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}
