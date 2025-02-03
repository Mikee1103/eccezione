public class NumeroPositivo {
    private int numero;

    public NumeroPositivo(int numero) throws NegativeException, IntervalloException {
        if (numero < 0) {
            throw new NegativeException("il numero deve essere positivo: " + numero);
        }
        if (numero > 30) {
            throw new IntervalloException("il numero deve essere compreso tra 1 e 30: " + numero);
        }
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}