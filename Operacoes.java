package calculadora;

public class Operacoes implements Calcular {
    
    private double n1, n2;
    
    public Operacoes(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public double somar() {
        return n1 + n2;
    }

    @Override
    public double subtrair() {
        return n1 - n2;
    }

    @Override
    public double dividir() {
        if (n2 == 0) {
            System.out.println("!!! NÃO É POSSÍVEL DIVISÃO POR ZERO !!!");
            return Double.NaN; 
        }
        return n1 / n2;
    }

    @Override
    public double multiplicar() {
        return n1 * n2;
    }
}
