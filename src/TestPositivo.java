import java.util.Scanner;
public class TestPositivo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("inserisci un numero:");
        int num = in.nextInt();
        try {
            NumeroPositivo numeroPositivo = new NumeroPositivo(num);
            System.out.println("numero: " + numeroPositivo.getNumero());
        } catch (NegativeException e) {
            System.err.println("eccezione trovata: " + e.getMessage());
        }
    }
}

