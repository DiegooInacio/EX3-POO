import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            Date dataAdmissao1 = sdf.parse("01/02/2015");
            Date dataAdmissao2 = sdf.parse("15/06/2017");
            Date dataAdmissao3 = sdf.parse("23/08/2019");

            Funcionario funcionario1 = new Funcionario("Fulano1", dataAdmissao1, 3000.0);
            Funcionario funcionario2 = new Funcionario("Fulano2", dataAdmissao2, 3500.0);
            Funcionario funcionario3 = new Funcionario("Fulano3", dataAdmissao3, 4000.0);

            System.out.println("Nome: " + funcionario1.getNome() + ", Data de Admissão: " + sdf.format(funcionario1.getDataAdmissao()) + ", Salário: " + funcionario1.getSalario());
            System.out.println("Nome: " + funcionario2.getNome() + ", Data de Admissão: " + sdf.format(funcionario2.getDataAdmissao()) + ", Salário: " + funcionario2.getSalario());
            System.out.println("Nome: " + funcionario3.getNome() + ", Data de Admissão: " + sdf.format(funcionario3.getDataAdmissao()) + ", Salário: " + funcionario3.getSalario());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
