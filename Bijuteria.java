public class Bijuteria extends Loja{
    double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios,
        double salarioBaseFuncionario, Endereco endereco, 
        Data dataDeFundacao, int quantidadeMaximaProdutos, double metaVendas
    ){
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaximaProdutos);
    this.metaVendas = metaVendas;
    }

    public double getMetaVendas(){
        return this.metaVendas;
    }

    public void setMetaVendas(double novaMetaVendas){
        this.metaVendas = novaMetaVendas;
    }

    public String toString(){
        return "A loja de Bijuteria "+super.getNome()+" atingiu a meta de "+getMetaVendas()+" vendas.";
    }
    
}