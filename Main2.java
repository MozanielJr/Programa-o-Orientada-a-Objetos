import java.util.ArrayList;
import java.util.List;

interface Imprimivel {
    void imprimir();
}

class Aluno implements Imprimivel {
    private String nome;
    private List<Disciplina> disciplinas;

    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    @Override
    public void imprimir() {
        System.out.println("Aluno: " + nome);
    }
}

class Curso implements Imprimivel {
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    @Override
    public void imprimir() {
        System.out.println("Curso: " + nome);
    }
}

class Professor implements Imprimivel {
    private String nome;
    private List<Disciplina> disciplinas;

    public Professor(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    @Override
    public void imprimir() {
        System.out.println("Professor: " + nome);
    }
}

class Disciplina implements Imprimivel {
    private String nome;
    private List<Aluno> alunos;
    private List<Curso> cursos;
    private Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public void imprimir() {
        System.out.println("Disciplina: " + nome);
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Lucas");
        Curso curso01 = new Curso("Ciencia da Computacao");
        Professor professor01 = new Professor("Hially");
        Disciplina disciplina01 = new Disciplina("Programacao Orientada a objetos", professor01);

        aluno01.adicionarDisciplina(disciplina01);
        curso01.adicionarDisciplina(disciplina01);
        professor01.adicionarDisciplina(disciplina01);
        disciplina01.adicionarAluno(aluno01);
        disciplina01.adicionarCurso(curso01);

        List<Imprimivel> imprimiveis = new ArrayList<>();
        imprimiveis.add(aluno01);
        imprimiveis.add(curso01);
        imprimiveis.add(professor01);
        imprimiveis.add(disciplina01);

        for (Imprimivel imprimivel : imprimiveis) {
            imprimivel.imprimir();
        }
    }
}
