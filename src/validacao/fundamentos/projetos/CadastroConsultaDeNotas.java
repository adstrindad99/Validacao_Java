package validacao.fundamentos.projetos;

import java.util.Scanner;

public class CadastroConsultaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomeDosAlunos = new String[5];

        double[] notasDoAluno1 = new double[2];
        double[] notasDoAluno2 = new double[2];
        double[] notasDoAluno3 = new double[2];
        double[] notasDoAluno4 = new double[2];
        double[] notasDoAluno5 = new double[2];

        double[] mediaDosAlunos = new double[5];

        int totalAlunos = 0;
        int alunosAprovados = 0;
        int opcao;


        do {
            System.out.println("1: Cadastrar aluno"); //(nome + 2 notas, calculando e armazenando a média)
            System.out.println("2: Listar todos os alunos cadastrados até o momento"); // (nome, notas e média)
            System.out.println("3: Consultar quantos alunos estão aprovados"); //(média ≥ 7)
            System.out.println("4: Sair");
            System.out.println("_____________________________________________________________");
            System.out.print("Escolha a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    switch (totalAlunos){
                        case 0:
                            System.out.println("Cadastro de aluno...");
                            System.out.print("Digite o nome do aluno: ");
                            nomeDosAlunos[0] = scanner.nextLine();
                            System.out.print("Digite a primeira nota: ");
                            notasDoAluno1[0] = scanner.nextDouble();
                            System.out.print("Digite a segunda nota: ");
                            notasDoAluno1[1] = scanner.nextDouble();
                            mediaDosAlunos[0] = (notasDoAluno1[0] + notasDoAluno1[1]) / 2;
                            totalAlunos++;
                            if (mediaDosAlunos[0] >= 7) {
                                alunosAprovados++;
                            }
                            break;
                        case 1:
                            System.out.println("Cadastro de aluno...");
                            System.out.print("Digite o nome do aluno: ");
                            nomeDosAlunos[1] = scanner.nextLine();
                            System.out.print("Digite a primeira nota: ");
                            notasDoAluno2[0] = scanner.nextDouble();
                            System.out.print("Digite a segunda nota: ");
                            notasDoAluno2[1] = scanner.nextDouble();
                            mediaDosAlunos[1] = (notasDoAluno2[0] + notasDoAluno2[1]) / 2;
                            totalAlunos++;
                            if (mediaDosAlunos[1] >= 7) {
                                alunosAprovados++;
                            }
                            break;
                        case 2:
                            System.out.println("Cadastro de aluno...");
                            System.out.print("Digite o nome do aluno: ");
                            nomeDosAlunos[2] = scanner.nextLine();
                            System.out.print("Digite a primeira nota: ");
                            notasDoAluno3[0] = scanner.nextDouble();
                            System.out.print("Digite a segunda nota: ");
                            notasDoAluno3[1] = scanner.nextDouble();
                            mediaDosAlunos[2] = (notasDoAluno3[0] + notasDoAluno3[1]) / 2;
                            totalAlunos++;
                            if (mediaDosAlunos[2] >= 7) {
                                alunosAprovados++;
                            }
                            break;
                        case 3:
                            System.out.println("Cadastro de aluno...");
                            System.out.print("Digite o nome do aluno: ");
                            nomeDosAlunos[3] = scanner.nextLine();
                            System.out.print("Digite a primeira nota: ");
                            notasDoAluno4[0] = scanner.nextDouble();
                            System.out.print("Digite a segunda nota: ");
                            notasDoAluno4[1] = scanner.nextDouble();
                            mediaDosAlunos[3] = (notasDoAluno4[0] + notasDoAluno4[1]) / 2;
                            totalAlunos++;
                            if (mediaDosAlunos[3] >= 7) {
                                alunosAprovados++;
                            }
                            break;
                        case 4:
                            System.out.println("Cadastro de aluno...");
                            System.out.print("Digite o nome do aluno: ");
                            nomeDosAlunos[4] = scanner.nextLine();
                            System.out.print("Digite a primeira nota: ");
                            notasDoAluno5[0] = scanner.nextDouble();
                            System.out.print("Digite a segunda nota: ");
                            notasDoAluno5[1] = scanner.nextDouble();
                            mediaDosAlunos[4] = (notasDoAluno5[0] + notasDoAluno5[1]) / 2;
                            totalAlunos++;
                            if (mediaDosAlunos[4] >= 7) {
                                alunosAprovados++;
                            }
                            break;
                        default:
                            System.out.println("Limite de aluno atingido.");
                            System.out.println("Selecione outra opção.");
                    }
                    System.out.println("_____________________________________________________________");
                    System.out.println("Retornando ao menu...");
                    System.out.println("_____________________________________________________________");
                    break;
                case 2:
                    System.out.println("Listagem de aluno...");
                    switch (totalAlunos) {
                        case 0:
                            System.out.println("Nenhum aluno cadastrado.");
                            break;
                        case 1:
                            System.out.printf("Aluno 1:\nNome: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f |\n",
                                    nomeDosAlunos[0], notasDoAluno1[0], notasDoAluno1[1], mediaDosAlunos[0] );
                            break;
                        case 2:
                            System.out.printf("Aluno 1:\nNome: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f |\n",
                                    nomeDosAlunos[0], notasDoAluno1[0], notasDoAluno1[1], mediaDosAlunos[0] );
                            System.out.printf("Aluno 2:\nNome: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f |\n",
                                    nomeDosAlunos[1], notasDoAluno2[0], notasDoAluno2[1], mediaDosAlunos[1] );
                            break;
                        case 3:
                            System.out.printf("Aluno 1:\nNome: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f |\n",
                                    nomeDosAlunos[0], notasDoAluno1[0], notasDoAluno1[1], mediaDosAlunos[0] );
                            System.out.printf("Aluno 2:\nNome: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f |\n",
                                    nomeDosAlunos[1], notasDoAluno2[0], notasDoAluno2[1], mediaDosAlunos[1] );
                            System.out.printf("Aluno 3:\nNome: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f |\n",
                                    nomeDosAlunos[2], notasDoAluno3[0], notasDoAluno3[1], mediaDosAlunos[2] );
                            break;
                        case 4:
                            System.out.printf("Aluno 1:\nNome: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f |\n",
                                    nomeDosAlunos[0], notasDoAluno1[0], notasDoAluno1[1], mediaDosAlunos[0] );
                            System.out.printf("Aluno 2:\nNome: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f |\n",
                                    nomeDosAlunos[1], notasDoAluno2[0], notasDoAluno2[1], mediaDosAlunos[1] );
                            System.out.printf("Aluno 3:\nNome: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f |\n",
                                    nomeDosAlunos[2], notasDoAluno3[0], notasDoAluno3[1], mediaDosAlunos[2] );
                            System.out.printf("Aluno 4:\nNome: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f |\n",
                                    nomeDosAlunos[3], notasDoAluno4[0], notasDoAluno4[1], mediaDosAlunos[3] );
                            break;
                        case 5:
                            System.out.printf("Aluno 1:\nNome: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f |\n",
                                    nomeDosAlunos[0], notasDoAluno1[0], notasDoAluno1[1], mediaDosAlunos[0] );
                            System.out.printf("Aluno 2:\nNome: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f |\n",
                                    nomeDosAlunos[1], notasDoAluno2[0], notasDoAluno2[1], mediaDosAlunos[1] );
                            System.out.printf("Aluno 3:\nNome: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f |\n",
                                    nomeDosAlunos[2], notasDoAluno3[0], notasDoAluno3[1], mediaDosAlunos[2] );
                            System.out.printf("Aluno 4:\nNome: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f |\n",
                                    nomeDosAlunos[3], notasDoAluno4[0], notasDoAluno4[1], mediaDosAlunos[3] );
                            System.out.printf("Aluno 5:\nNome: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f |\n",
                                    nomeDosAlunos[4], notasDoAluno5[0], notasDoAluno5[1], mediaDosAlunos[4] );
                            break;
                    }
                    System.out.println("_____________________________________________________________");
                    System.out.println("Retornando ao menu...");
                    System.out.println("_____________________________________________________________");
                    break;
                case 3:
                    System.out.println("Consulta de aprovados...");
                    if (totalAlunos <= 0) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        System.out.println("Total de alunos da turma: " + totalAlunos);
                        System.out.println("Total de alunos aprovados: " + alunosAprovados);
                    }
                    System.out.println("_____________________________________________________________");
                    System.out.println("Retornando ao menu...");
                    System.out.println("_____________________________________________________________");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida.");
                    System.out.println("Tente novamente.");
            }
        } while (opcao != 4);
        scanner.close();
    }
}