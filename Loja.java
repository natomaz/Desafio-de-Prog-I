public class Loja {
    String nome;
    int quantidadeFuncionarios;
    double salarioBaseFuncionario;
    Endereco endereco;
    Data dataDeFundacao;
    Produto[] estoqueProdutos;

public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, int quantidadeMaximaProdutos){
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataDeFundacao = dataDeFundacao;
    this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
}

public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataDeFundacao, int quantidadeMaximaProdutos){
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    salarioBaseFuncionario = -1;
    this.endereco = endereco;
    this.dataDeFundacao = dataDeFundacao;
    this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
}

public String getNome(){
    return nome;
}
public void setNome(String novoNome){
    this.nome = novoNome;
}
public int getQuantidadeFuncionarios(){
    return quantidadeFuncionarios;
}
public void setQuantidadeFuncionarios(int novaQuantidadeFuncionarios){
    this.quantidadeFuncionarios = novaQuantidadeFuncionarios;
}
public double getSalarioBaseFuncionario(){
    return salarioBaseFuncionario;
}
public void setSalarioBaseFuncionario(double novoSalarioBaseFuncionario){
    this.salarioBaseFuncionario = novoSalarioBaseFuncionario;
}
public Endereco getEndereco(){
    return endereco;
}
public void setEndereco(Endereco novoEndereco){
    this.endereco = novoEndereco;
}
public Data getDataDeFundacao(){
    return dataDeFundacao;
}
public void setDataDeFundacao(Data novaDataDeFundacao){
    this.dataDeFundacao = novaDataDeFundacao;
}

public Produto[] getEstoqueProdutos(){
    return estoqueProdutos;
}

public void setEstoqueProdutos(Produto[] novoEstoqueProdutos){
    this.estoqueProdutos = novoEstoqueProdutos;
}

public String toString(){
    return "A loja "
    +getNome()+
    " tem "
    +getQuantidadeFuncionarios()+
    " funcionários e o salário base dos funcionários é "
    +getSalarioBaseFuncionario()+
    ". A loja está localizada no endereço "
    +getEndereco()+
    "e foi fundada em "
    +getDataDeFundacao()+".\n A quantidade de produtos em estoque é: "+getEstoqueProdutos().length;
}
public double gastosComSalario(){
    if (salarioBaseFuncionario != -1) 
        return salarioBaseFuncionario*quantidadeFuncionarios;
    else 
        return -1;
}
public char tamanhoDaLoja(){
    if (quantidadeFuncionarios < 10)
        return 'P';
    else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30)
        return 'M';
    else 
        return 'G';
}
public void imprimeProdutos(){
    for (Produto produto : estoqueProdutos){
        if (produto != null) 
            System.out.println("Produto: "+produto);
    }
}
public boolean insereProduto(Produto produto){
    for (int i= 0; i < estoqueProdutos.length; i++){
        if (estoqueProdutos[i] == null){
            estoqueProdutos[i] = produto;
            return true;
        }
    }
    return false;
}
public boolean removeProduto(String nomeProduto) {
    for (int i = 0; i < estoqueProdutos.length; i++) {
        if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
            estoqueProdutos[i] = null;
            return true;
        }
    }
    return false; 
}

}