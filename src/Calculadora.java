public class Calculadora {
    public double numero1;
    public double numero2;

    public Calculadora (double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void calcular(String operacion){
        if (operacion.equals("+")){
            System.out.println("El resultado es: " +(this.numero1 + this.numero2));
        } else if (operacion.equals("-")) {
            System.out.println("El resultado es: " +(this.numero1 - this.numero2));
        } else if (operacion.equals("*")) {
            System.out.println("El resultado es: " +(this.numero1 * this.numero2));
        } else if (operacion.equals("/")) {
            System.out.println("El resultado es: " +(this.numero1 / this.numero2));
        }
    }

}
