public class Informatica extends Loja{
    double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios,
        double salarioBaseFuncionario, Endereco endereco, 
        Data dataDeFundacao, int quantidadeMaximaProdutos, double seguroEletronicos
    ){
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaximaProdutos);
    this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos(){
        return this.seguroEletronicos;
    }

    public void setSeguroEletronicos(Double novoSeguroEletronicos){
        this.seguroEletronicos = novoSeguroEletronicos;
    }

    public String toString(){
        return "A loja de Informática "
        +super.getNome()+
        " precisará pagar o valor de R$"
        +getSeguroEletronicos()+
        " mensalmente para venda de aparelhos eletônicos.";
    }
    
}