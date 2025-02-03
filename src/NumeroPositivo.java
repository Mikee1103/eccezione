public class NumeroPositivo {
    private int numero;

    public NumeroPositivo(int numero) throws NegativeException {
        if (numero < 0) {
            throw new NegativeException("il numero deve essere positivo: " + numero);
        }
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}