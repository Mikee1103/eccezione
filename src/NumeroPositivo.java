public class NumeroPositivo {
    private int numero;

    public NumeroPositivo(int numero) throws NegativeException, IntervalloException, Escludi20Exception {
        if (numero < 0) {
            throw new NegativeException("il numero deve essere positivo: " + numero);
        }
        if (numero > 30) {
            throw new IntervalloException("il numero deve essere compreso tra 1 e 30: " + numero);
        }
        if (numero == 20) {
            throw new Escludi20Exception("il numero non può essere = 20: " + numero);
        }
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}