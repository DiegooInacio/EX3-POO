import java.util.Date;

public class Funcionario {

    private String nome;
    private Date dataAdmissao;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, Date dataAdmissao, double salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
