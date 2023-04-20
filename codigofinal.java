import java.util.Random;

public class app {
    public static void main(String[] args) {

        int n = 10;
        int[] numeros = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            numeros[i] = random.nextInt(101); // Gera um número aleatório entre 0 e 100
        }
    
        // Imprime a array
        for (int i = 0; i < n; i++) {
            System.out.println("->" + numeros[i]);
        }
        
        // Encontra o maior e o menor número
        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        
        // Imprime os números pares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Os numeros pares são: " + numeros[i]);
            }
        }
    }
}
