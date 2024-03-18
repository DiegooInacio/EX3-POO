public class Funcionario {
    private String nome;
    private String dataAdmissao; 
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String dataAdmissao, double salario) {
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

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
