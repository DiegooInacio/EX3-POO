import java.util.Date;

public class Funcionario {
    private String nome;
    private Date dataAdmissao;
    private double salario;
    private final int identificador; 

    private static int proximoIdentificador = 1;

    public Funcionario() {
        this.identificador = proximoIdentificador++;
    }

    public Funcionario(String nome, Date dataAdmissao, double salario) {
        this();
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSalario(double salario) {
      if (salario < 1100.0) {
          System.out.println("Erro: O salário não pode ser inferior a R$ 1.100,00.");
      } else {
          this.salario = salario;
      }
    }
}
