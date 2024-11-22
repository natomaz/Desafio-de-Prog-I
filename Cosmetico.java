public class Cosmetico extends Loja{
    double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios,
        double salarioBaseFuncionario, Endereco endereco, 
        Data dataDeFundacao, int quantidadeMaximaProdutos, double taxaComercializacao
    ){
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaximaProdutos);
    this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao(){
        return this.taxaComercializacao;
    }

    public void setTaxaComercializacao(double novaTaxaComercializacao){
        this.taxaComercializacao = novaTaxaComercializacao;
    }

    public String toString(){
        return "A loja de Cosmético "+getNome()+" tem sua taxa de comercialização em "+taxaComercializacao+"%.";
    }
    
}