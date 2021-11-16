package Classes;

import java.time.LocalDate;


public class Locação  {

    private String dataLocacao;
    private String cpfCliente;
    private String dataDevolucao;
    private String status;

   
    public Locação(String codigo, String titulo, String autor, String numeroPaginas, String dataLocacao,
            String cpfCliente, String dataDevolucao, String status) {
        this.dataLocacao = dataLocacao;
        this.cpfCliente = cpfCliente;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
    }



    public Locação(String codigo, String titulo, String autor, String numeroPaginas, LocalDate dataLocacao2,
            String cpfCliente2, LocalDate dataDevolucao2, String status2) {
    }



    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Locação [cpfCliente=" + cpfCliente + ", dataDevolucao=" + dataDevolucao + ", dataLocacao=" + dataLocacao
                + ", status=" + status + "]";
    }



    public void add(Locação locacao) {
    }



    public Object getstatus() {
        return null;
    }

    
    

    
}
