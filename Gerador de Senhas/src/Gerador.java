import java.security.SecureRandom;
import java.util.Scanner;

public class Gerador {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";

        System.out.println("=== GERADOR DE SENHAS ===");
        System.out.print("Qual o comprimento da senha que você deseja? ");
        int comprimento = entrada.nextInt();

        StringBuilder senha = new StringBuilder();

        // Loop que roda o número de vezes que o usuário escolheu
        for (int i = 0; i < comprimento; i++) {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        System.out.println("Senha gerada com sucesso:");
        System.out.println(senha.toString());

        entrada.close();
    }
}