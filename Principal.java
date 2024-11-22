import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        while (true) {
            System.out.println("MENU");
            System.out.println("Digite 1 para criar uma loja.");
            System.out.println("Digite 2 para criar um produto.");
            System.out.println("Digite 3 para sair.");
            int opcao = input.nextInt();
            input.nextLine();
                 
            switch (opcao) {
                case 1:
                System.out.println("Insira o nome da loja:");
                String nomeLoja = input.nextLine();
                System.out.println("Insira a quantidade de funcionários da loja:");
                int quantidadeDeFuncionarios = input.nextInt();
                System.out.println("Insira o salário base dos funcionários:");
                double salarioBaseFuncionario = input.nextDouble();
                input.nextLine();
                System.out.println("Insira a rua que a loja está localizada:");
                String nomeDaRuaLoja = input.nextLine();
                System.out.println("Insira a cidade que a loja está localizada:");
                String cidadeLoja = input.nextLine();
                System.out.println("Insira o estado que a loja está localizada:");
                String estadoLoja = input.nextLine();
                System.out.println("Insira o país que a loja está localizada:");
                String paisLoja = input.nextLine();
                System.out.println("Insira o CEP da rua que a loja está localizada:");
                String cepLoja = input.nextLine();
                System.out.println("Insira o número da rua que a loja está localizada:");
                String numeroLoja = input.nextLine();
                System.out.println("Insira o complemento da rua que a loja está localizada:");
                String complementoLoja = input.nextLine();
                Endereco enderecoLoja = new Endereco(nomeDaRuaLoja, cidadeLoja, estadoLoja, paisLoja, cepLoja, numeroLoja, complementoLoja);
                System.out.println("Insira o dia que a loja foi fundada:");
                int diaLoja = input.nextInt();
                System.out.println("Insira o mês que a loja foi fundada:");
                int mesLoja = input.nextInt();
                System.out.println("Insira o ano que a loja foi fundada:");
                int anoLoja = input.nextInt();
                Data dataLoja = new Data(diaLoja, mesLoja, anoLoja);
                System.out.println("Insira a quantidade de produtos:");
                int quantidadeMaximaProdutos = input.nextInt();
                Loja loja = new Loja(nomeLoja, quantidadeDeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataLoja, quantidadeMaximaProdutos);
                System.out.println("Loja cadastrada com sucesso!");
                System.out.println(loja);
                break;
                
                case 2:
                System.out.println("Insira o nome do produto:");
                String nomeProduto = input.nextLine();
                System.out.println("Insira o valor do produto:");
                double valorProduto = input.nextDouble();
                System.out.println("Insira o dia de validade do produto:");
                int diaProduto = input.nextInt();
                System.out.println("Insira o mês de validade do produto:");
                int mesProduto = input.nextInt();
                System.out.println("Insira o ano de validade do produto:");
                int anoProduto = input.nextInt();
                Data dataProduto = new Data(diaProduto, mesProduto, anoProduto);
                Produto produto = new Produto(nomeProduto, valorProduto, dataProduto);
                System.out.println("Produto cadastrado com sucesso!");
                System.out.println(produto);
                Data dataVerificacao = new Data(20, 10, 2023);
                    if (produto.estaVencido(dataVerificacao)) {
                        System.out.println("Produto vencido!"); 
                    } else {
                        System.out.println("Produto não vencido!"); 
                    }
                break;
    
                case 3:
                System.out.println("Saindo do menu...");
                input.close(); 
                return;
                
                default:
                System.out.println("Opção invalida! Digite um número entre 1 a 3.");
                break;
            }
        }
        
    }
}
