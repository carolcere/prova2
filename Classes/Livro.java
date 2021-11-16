package Classes;

import java.time.LocalDate;
import java.util.List;

public class Livro extends Locação{

    private String codigo;
    private String titulo;
    private static String autor;
    private static String numeroPaginas;
    private static String cpfCliente2;


    public Livro(String codigo, String titulo, String autor, String numeroPaginas, LocalDate dataLocacao,
            String cpfCliente, LocalDate dataDevolucao, String status, String codigo2, String titulo2, String autor2,
            String numeroPaginas2) {
        super(codigo, titulo, autor, numeroPaginas, dataLocacao, cpfCliente, dataDevolucao, status);
        codigo = codigo2;
        titulo = titulo2;
        autor = autor2;
        numeroPaginas = numeroPaginas2;
    }


    public Livro(String codigo, String titulo, String autor2, String numeroPaginas2, List<Locação> locacao,
            String cpfCliente, String datadevolucao, String status) {
                super(codigo, titulo, autor, numeroPaginas, titulo, cpfCliente2, titulo, titulo);
              

            }
                


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        Livro.autor = autor;
    }


    public String getNumeroPaginas() {
        return numeroPaginas;
    }


    public void setNumeroPaginas(String numeroPaginas) {
        Livro.numeroPaginas = numeroPaginas;
    }


    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", codigo=" + codigo + ", numeroPaginas=" + numeroPaginas + ", titulo="
                + titulo + "]";
    }


    public void add(Livro livro) {
    }


    public int size() {
        return 0;
    }


    public char[] get(int i) {
        return null;
    }


    public void add(List<Livro> livros) {
    }

    

    

}