public class Main {
    public static void main(String[] args) {
        Calculadora operacion1 = new Calculadora(24.0, 700.0);

        operacion1.calcular("+");
        operacion1.calcular("-");
        operacion1.calcular("*");
        operacion1.calcular("/");

    }
}