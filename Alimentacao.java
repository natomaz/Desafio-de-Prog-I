public class Alimentacao extends Loja{
    Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios,
        double salarioBaseFuncionario, Endereco endereco, 
        Data dataDeFundacao, Data dataAlvara, int quantidadeMaximaProdutos
    ){
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaximaProdutos);
    this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara(){
        return this.dataAlvara;
    }

    public void setDataAlvara(Data novaDataAlvara){
        this.dataAlvara = novaDataAlvara;
    }

    public String toString(){
        return "A loja de Alimentação "+super.getNome()+" recebeu o alvará de funcionamento em "+getDataAlvara()+".";
    }
    
}