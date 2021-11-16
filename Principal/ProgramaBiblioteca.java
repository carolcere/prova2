package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.Livro;
import Classes.Locação;

public class ProgramaBiblioteca {
    
    private static String dataDevolucao;
    private static String cpfCliente;

    public static void main(String[] args) {

        Integer opcao = -1;
        Scanner sc = new Scanner(System.in);
       List<Livro> livros = new ArrayList<>();
       List<Locação> locacao = new ArrayList<>();

        do {

            System.out.println("\n**** M E N U ****\n");
            System.out.println("1- Cadastrar Livro");
            System.out.println("2- Consultar Livro");
            System.out.println("3- Listar todos os Livros");
            System.out.println("4- Realizar Locação");
            System.out.println("5- Realizar Devolução");
            System.out.println("6- Relatório de livros com devolução em aberto");
            System.out.println("7- Relatório de livros alugados por período");
            System.out.println("0- sair");
            System.out.println("\ndigite a opção desejada\n");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                System.out.println("Digite o titulo do livro:");
                String titulo = sc.nextLine();
                System.out.println("Digite o código do livro:");
                String codigo = sc.nextLine();
                System.out.println("Digite o número de páginas do livro:");
                String numeroPaginas = sc.nextLine();
                System.out.println("Digite o nome do autor do livro:");
                String autor = sc.nextLine();
                System.out.println("Qual é o status do livro?");
                String status = sc.nextLine();
               
                Livro livro = new Livro(codigo, titulo, autor, numeroPaginas, locacao, cpfCliente,
                 dataDevolucao, status);
                 livro.add(livros);
                    
                    break;
                     case 2:
                     System.out.println("Livros disponiveis:");

                     System.out.println(livros);

                     locacao.stream()
                     .filter(p -> p.getstatus() == "disponivel" )
                     .forEach(System.out::println);

                    
                    break;
                    case 3: 
                    System.out.println("\n\n");
                    for (Livro l : livros) {
                        System.out.println(l);
                    }
                      
                    break;
                    case 4:

                    System.out.println("Locaçaõ efetuada com sucesso!!");

                    break;
                    case 5:
                    
                    break;
                    case 6:
                    locacao.stream()
            .filter(p -> p.getDataDevolucao().equalsIgnoreCase("sem data prevista!"))
            .forEach(System.out::println);
                    
                    break;
                    case 7:
                    
                    break;
                    case 0: 
                    System.out.println("Encerrando a aplicação!");
                    
                    break;
            
                default:
                   System.out.println("Opção inválida.");
                    break;
            }







        }while (opcao != 0);

        sc.close();

        

    }

}
