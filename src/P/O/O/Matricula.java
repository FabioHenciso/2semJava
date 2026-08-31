import java.time.LocalDateTime;

public class Matricula {

    private int nro;
    private LocalDateTime data;
    private float nota;
    private Aluno aluno;
    private Disciplina disciplina;

    public Matricula() {

    }

    public Matricula(int nro, LocalDateTime data, Aluno aluno, Disciplina disciplina) {
        this.nro = nro;
        this.data = data;
        this.nota = 0;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "matricula{" +
                "nro=" + nro +
                ", data=" + data +
                ", nota=" + nota +
                ", aluno=" + aluno +
                ", disciplina=" + disciplina +
                '}';
    }
}
