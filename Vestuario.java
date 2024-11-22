public class Vestuario extends Loja{
    boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios,
        double salarioBaseFuncionario, Endereco endereco, 
        Data dataDeFundacao, boolean produtosImportados, int quantidadeMaximaProdutos
    ){
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaximaProdutos);
    this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados(){
        return this.produtosImportados;
    }

    public void setProdutosImportados(boolean novosProdutosImportados){
        this.produtosImportados = novosProdutosImportados;
    }

    public String toString(){
        if (produtosImportados == true)
            return "A loja de Vestuário "+super.getNome()+" vende roupas importadas.";
        else
            return "A loja de Vestuário "+super.getNome()+" não vende roupas importadas.";
        
     
    }
    
}