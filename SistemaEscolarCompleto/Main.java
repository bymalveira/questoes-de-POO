package SistemaEscolarCompleto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = null;
        Curso curso = null;
        Disciplina disciplina = null;
        Professor professor = null;

        int opcao;

        do {
            System.out.println("\n--- Sistema Escolar ---");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar curso");
            System.out.println("3 - Cadastrar disciplina");
            System.out.println("4 - Cadastrar professor");
            System.out.println("5 - Mostrar aluno");
            System.out.println("6 - Mostrar curso");
            System.out.println("7 - Mostrar disciplina");
            System.out.println("8 - Mostrar professor");
            System.out.println("9 - Vincular curso ao aluno");
            System.out.println("10 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o \n que sobra do nextInt()

            switch (opcao) {
                case 1:
                    aluno = cadastrarAluno(scanner, curso);
                    break;

                case 2:
                    curso = cadastrarCurso(scanner);
                    if (aluno != null && aluno.getCurso() == null && curso != null) {
                        System.out.print("Deseja vincular o aluno atual ao curso " + curso.nome + "? (s/n): ");
                        String resposta = scanner.nextLine();
                        if (resposta.equalsIgnoreCase("s")) {
                            aluno.setCurso(curso);
                            System.out.println("Curso vinculado ao aluno com sucesso!");
                        }
                    }
                    break;

                case 3:
                    disciplina = cadastrarDisciplina(scanner);
                    break;

                case 4:
                    professor = cadastrarProfessor(scanner);
                    break;

                case 5:
                    mostrarAluno(aluno);
                    break;

                case 6:
                    mostrarCurso(curso);
                    break;

                case 7:
                    mostrarDisciplina(disciplina);
                    break;

                case 8:
                    mostrarProfessor(professor);
                    break;
                    
                case 9:
                    vincularCursoAluno(aluno, curso, scanner);
                    break;

                case 10:
                    System.out.println("Encerrando sistema...");
                    break;


                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 10);

        scanner.close();
    }

    public static Aluno cadastrarAluno(Scanner scanner, Curso curso) {
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();

        Aluno aluno;

        if (curso == null) {
            System.out.println("Nenhum curso cadastrado ainda. Aluno será cadastrado sem curso vinculado.");
            aluno = new Aluno(nome, matricula, null);
        } else {
            aluno = new Aluno(nome, matricula, curso);
        }

        System.out.println("Aluno cadastrado com sucesso!");
        return aluno;
    }

    public static Curso cadastrarCurso(Scanner scanner) {
        System.out.print("Nome do curso: ");
        String nome = scanner.nextLine();

        System.out.print("Carga horária (em horas): ");
        int cargaHoraria = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Curso cadastrado com sucesso!");
        return new Curso(nome, cargaHoraria);
    }

    public static Disciplina cadastrarDisciplina(Scanner scanner) {
        System.out.print("Nome da disciplina: ");
        String nome = scanner.nextLine();

        System.out.print("Carga horária (em horas): ");
        int cargaHoraria = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Disciplina cadastrada com sucesso!");
        return new Disciplina(nome, cargaHoraria);
    }

    public static Professor cadastrarProfessor(Scanner scanner) {
        System.out.print("Nome do professor: ");
        String nome = scanner.nextLine();

        System.out.print("Especialidade: ");
        String especialidade = scanner.nextLine();

        System.out.println("Professor cadastrado com sucesso!");
        return new Professor(nome, especialidade);
    }

    public static void vincularCursoAluno(Aluno aluno, Curso curso, Scanner scanner) {
        if (aluno == null) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        if (curso == null) {
            System.out.println("Nenhum curso cadastrado.");
            return;
        }

        aluno.setCurso(curso);
        System.out.println("Curso vinculado ao aluno com sucesso!");
    }

    public static void mostrarAluno(Aluno aluno) {
        if (aluno == null) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        aluno.mostrarDados();
    }

    public static void mostrarCurso(Curso curso) {
        if (curso == null) {
            System.out.println("Nenhum curso cadastrado.");
            return;
        }

        curso.mostrarDados();
    }

    public static void mostrarDisciplina(Disciplina disciplina) {
        if (disciplina == null) {
            System.out.println("Nenhuma disciplina cadastrada.");
            return;
        }

        disciplina.mostrarDados();
    }

    public static void mostrarProfessor(Professor professor) {
        if (professor == null) {
            System.out.println("Nenhum professor cadastrado.");
            return;
        }

        professor.mostrarDados();
    }
}