import java.util.Scanner;

public class LimiteMatematicoConArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la función f(x):");
        String funcion = sc.nextLine();

        System.out.println("Ingrese el valor de x del límite:");
        double x = sc.nextDouble();

        double[] limites = calcularLimites(funcion, x);

        if (Double.isInfinite(limites[0]) && Double.isInfinite(limites[1])) {
            System.out.println("El límite no existe.");
        } else if (Double.isInfinite(limites[0])) {
            System.out.println("El límite tiende a infinito por la derecha.");
            System.out.println("Límite por la derecha: " + limites[1]);
        } else if (Double.isInfinite(limites[1])) {
            System.out.println("El límite tiende a infinito por la izquierda.");
            System.out.println("Límite por la izquierda: " + limites[0]);
        } else if (limites[0] == limites[1]) {
            System.out.println("El límite es " + limites[0]);
        } else {
            System.out.println("El límite no existe.");
            System.out.println("Límite por la izquierda: " + limites[0]);
            System.out.println("Límite por la derecha: " + limites[1]);
        }
    }

    public static double[] calcularLimites(String funcion, double x) {
        double[] limites = new double[2];

        double limiteIzq = evaluar(funcion, x - 0.0001);
        double limiteDer = evaluar(funcion, x + 0.0001);

        if (Double.isInfinite(limiteIzq)) {
            limites[0] = Double.NEGATIVE_INFINITY;
        } else {
            limites[0] = limiteIzq;
        }

        if (Double.isInfinite(limiteDer)) {
            limites[1] = Double.POSITIVE_INFINITY;
        } else {
            limites[1] = limiteDer;
        }

        return limites;
    }

    public static double evaluar(String funcion, double x) {
        // Evalúa la función en un punto x utilizando la librería Math
        return Double.parseDouble(funcion.replaceAll("x", "(" + x + ")"));
    }
}