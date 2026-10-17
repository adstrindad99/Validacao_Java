package validacao.fundamentos.projetos;

import java.util.Scanner;

public class CadastroConsultaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeAluno1 = "";
        String nomeAluno2 = "";
        String nomeAluno3 = "";
        String nomeAluno4 = "";
        String nomeAluno5 = "";

        double notaAluno1A = 0;
        double notaAluno1B = 0;
        double notaAluno2A = 0;
        double notaAluno2B = 0;
        double notaAluno3A = 0;
        double notaAluno3B = 0;
        double notaAluno4A = 0;
        double notaAluno4B = 0;
        double notaAluno5A = 0;
        double notaAluno5B = 0;

        double mediaAluno1 = 0;
        double mediaAluno2 = 0;
        double mediaAluno3 = 0;
        double mediaAluno4 = 0;
        double mediaAluno5 = 0;

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
                            nomeAluno1 = scanner.nextLine();
                            System.out.print("Digite a primeira nota: ");
                            notaAluno1A = scanner.nextDouble();
                            System.out.print("Digite a segunda nota: ");
                            notaAluno1B = scanner.nextDouble();
                            mediaAluno1 = (notaAluno1A + notaAluno1B) / 2;
                            totalAlunos++;
                            if (mediaAluno1 >= 7) {
                                alunosAprovados++;
                            }
                            break;
                        case 1:
                            System.out.println("Cadastro de aluno...");
                            System.out.print("Digite o nome do aluno: ");
                            nomeAluno2 = scanner.nextLine();
                            System.out.print("Digite a primeira nota: ");
                            notaAluno2A = scanner.nextDouble();
                            System.out.print("Digite a segunda nota: ");
                            notaAluno2B = scanner.nextDouble();
                            mediaAluno2 = (notaAluno2A + notaAluno2B) / 2;
                            totalAlunos++;
                            if (mediaAluno2 >= 7) {
                                alunosAprovados++;
                            }
                            break;
                        case 2:
                            System.out.println("Cadastro de aluno...");
                            System.out.print("Digite o nome do aluno: ");
                            nomeAluno3 = scanner.nextLine();
                            System.out.print("Digite a primeira nota: ");
                            notaAluno3A = scanner.nextDouble();
                            System.out.print("Digite a segunda nota: ");
                            notaAluno3B = scanner.nextDouble();
                            mediaAluno3 = (notaAluno3A + notaAluno3B) / 2;
                            totalAlunos++;
                            if (mediaAluno3 >= 7) {
                                alunosAprovados++;
                            }
                            break;
                        case 3:
                            System.out.println("Cadastro de aluno...");
                            System.out.print("Digite o nome do aluno: ");
                            nomeAluno4 = scanner.nextLine();
                            System.out.print("Digite a primeira nota: ");
                            notaAluno4A = scanner.nextDouble();
                            System.out.print("Digite a segunda nota: ");
                            notaAluno4B = scanner.nextDouble();
                            mediaAluno4 = (notaAluno4A + notaAluno4B) / 2;
                            totalAlunos++;
                            if (mediaAluno4 >= 7) {
                                alunosAprovados++;
                            }
                            break;
                        case 4:
                            System.out.println("Cadastro de aluno...");
                            System.out.print("Digite o nome do aluno: ");
                            nomeAluno5 = scanner.nextLine();
                            System.out.print("Digite a primeira nota: ");
                            notaAluno5A = scanner.nextDouble();
                            System.out.print("Digite a segunda nota: ");
                            notaAluno5B = scanner.nextDouble();
                            mediaAluno5 = (notaAluno5A + notaAluno5B) / 2;
                            totalAlunos++;
                            if (mediaAluno5 >= 7) {
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
                            System.out.printf("Aluno 1:\nNome: %s | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f |\n",
                                    nomeAluno1, notaAluno1A, notaAluno1B, mediaAluno1 );
                            break;
                        case 2:
                            System.out.printf("Aluno 1:\nNome: %s | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f |\n",
                                    nomeAluno1, notaAluno1A, notaAluno1B, mediaAluno1 );
                            System.out.printf("Aluno 2:\nNome: %s | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f |\n",
                                    nomeAluno2, notaAluno2A, notaAluno2B, mediaAluno2 );
                            break;
                        case 3:
                            System.out.printf("Aluno 1:\nNome: %s | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f |\n",
                                    nomeAluno1, notaAluno1A, notaAluno1B, mediaAluno1 );
                            System.out.printf("Aluno 2:\nNome: %s | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f |\n",
                                    nomeAluno2, notaAluno2A, notaAluno2B, mediaAluno2 );
                            System.out.printf("Aluno 3:\nNome: %s | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f |\n",
                                    nomeAluno3, notaAluno3A, notaAluno3B, mediaAluno3 );
                            break;
                        case 4:
                            System.out.printf("Aluno 1:\nNome: %s | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f |\n",
                                    nomeAluno1, notaAluno1A, notaAluno1B, mediaAluno1 );
                            System.out.printf("Aluno 2:\nNome: %s | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f |\n",
                                    nomeAluno2, notaAluno2A, notaAluno2B, mediaAluno2 );
                            System.out.printf("Aluno 3:\nNome: %s | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f |\n",
                                    nomeAluno3, notaAluno3A, notaAluno3B, mediaAluno3 );
                            System.out.printf("Aluno 4:\nNome: %s | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f |\n",
                                    nomeAluno4, notaAluno4A, notaAluno4B, mediaAluno4 );
                            break;
                        case 5:
                            System.out.printf("Aluno 1:\nNome: %s | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f |\n",
                                    nomeAluno1, notaAluno1A, notaAluno1B, mediaAluno1 );
                            System.out.printf("Aluno 2:\nNome: %s | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f |\n",
                                    nomeAluno2, notaAluno2A, notaAluno2B, mediaAluno2 );
                            System.out.printf("Aluno 3:\nNome: %s | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f |\n",
                                    nomeAluno3, notaAluno3A, notaAluno3B, mediaAluno3 );
                            System.out.printf("Aluno 4:\nNome: %s | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f |\n",
                                    nomeAluno4, notaAluno4A, notaAluno4B, mediaAluno4 );
                            System.out.printf("Aluno 5:\nNome: %s | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f |\n",
                                    nomeAluno5, notaAluno5A, notaAluno5B, mediaAluno5 );
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