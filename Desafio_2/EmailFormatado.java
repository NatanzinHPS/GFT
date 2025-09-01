package Desafio_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EmailFormatado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> emailsJaGerados = new HashSet<>();
        
        while (true) {
            System.out.print("Digite o nome completo (ou 'sair' para terminar): ");
            String nomeCompleto = scanner.nextLine();
            
            if (nomeCompleto.equalsIgnoreCase("sair")) {
                break;
            }
            
            String[] partesNome = nomeCompleto.trim().split("\\s+");
            
            if (partesNome.length < 2) {
                System.out.println("Por favor, digite nome e sobrenome.");
                continue;
            }
            
            String nome = partesNome[0].toLowerCase();
            String sobrenome = partesNome[partesNome.length - 1].toLowerCase();
            
            String emailBase = nome + "." + sobrenome + "@empresa.com";
            String emailFinal = emailBase;
            int contador = 2;
            
            
            while (emailsJaGerados.contains(emailFinal)) {
                emailFinal = nome + "." + sobrenome + contador + "@empresa.com";
                contador++;
            }
            
            emailsJaGerados.add(emailFinal);
            System.out.println("Email gerado: " + emailFinal);
        }
        scanner.close();
    }
}
