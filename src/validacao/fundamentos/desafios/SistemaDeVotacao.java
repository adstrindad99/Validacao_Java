package validacao.fundamentos.desafios;

import java.util.Scanner;

public class SistemaDeVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;

        String candidato1 = "Superman";
        String candidato2 = "Batman";
        String candidato3 = "Capitão America";

        for (int i = 1; i <= 6; i++) {
            System.out.println("Votação para héroi mais popular.");
            System.out.printf("1: %s \n2: %s \n3: %s \n", candidato1, candidato2, candidato3);

            System.out.print("Digite o número correspondente ao seu candidato: ");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    voto1++;
                    break;
                case 2:
                    voto2++;
                    break;
                case 3:
                    voto3++;
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
            System.out.println("________________________________________________________");
        }
        scanner.close();
        System.out.printf("Resultado final: \n%s: %d votos. \n%s: %d votos. \n%s: %d votos.\n",
                candidato1, voto1, candidato2, voto2, candidato3, voto3);
        if (voto1 > voto2 && voto1 > voto3) {
            System.out.printf("%s venceu as eleições.", candidato1);
        } else if (voto2 > voto3 && voto2 > voto1) {
            System.out.printf("%s venceu as eleições.", candidato2);
        } else if (voto3 > voto1 && voto3 > voto2) {
            System.out.printf("%s venceu as eleições.", candidato3);
        } else if (voto1 == voto2 && voto2 == voto3) {
            System.out.print("Empate técnico entre os candidatos");
        } else if (voto1 == voto2) {
            System.out.printf("%s empatou com %s",candidato1, candidato2);
        } else if (voto2 == voto3) {
            System.out.printf("%s empatou com %s", candidato2, candidato3);
        } else {
            System.out.printf("%s empatou com %s", candidato1, candidato3);
        }
    }
}