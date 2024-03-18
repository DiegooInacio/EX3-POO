import java.util.Date;

public void setDataAdmissao(Date dataAdmissao) {
    Date hoje = new Date();

    if (dataAdmissao.after(hoje)) {
        System.out.println("Erro: A data de admissão não pode ser no futuro.");
    } else {
        this.dataAdmissao = dataAdmissao;
    }
}
