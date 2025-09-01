import java.util.Scanner;

public class CafeDosDevs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de devs: ");
        int numDevs = scanner.nextInt();

        System.out.print("Quantas xícaras por dia cada um toma (separado por espaço): ");
        int totalXicarasDia = 0;

        for (int i = 0; i < numDevs; i++) {
            int xicarasPorDev = scanner.nextInt();
            totalXicarasDia += xicarasPorDev;
        }

        int totalSemana = totalXicarasDia * 5; 
        int estoque = 100;

        System.out.println("Total da semana: " + totalSemana + " xícaras");

        if (totalSemana <= estoque) {
            System.out.println("Estoque suficiente");
        } else {
            System.out.println("Estoque insuficiente");

        }
        scanner.close();
    }
}
