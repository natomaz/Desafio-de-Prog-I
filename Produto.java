public class Produto {
    String nome;
    double preco; 
    Data dataDeValidade;

public Produto(String nome, double preco, Data dataDeValidade){
    this.nome = nome;
    this.preco = preco;
    this.dataDeValidade = dataDeValidade;
}

public String getNome(){
    return nome;
}

public void setNome(String novoNome){
    this.nome = novoNome;
}

public double getPreco(){
    return preco;
}

public void setPreco(double novoPreco){
    this.preco = novoPreco;
}

public Data getDataDeValidade(){
    return dataDeValidade;
}

public void setDataDeValidade(Data novaDataDeValidade){
    this.dataDeValidade = novaDataDeValidade;
}

public String toString(){
    return "O produto "+getNome()+" custa R$"+getPreco()+" e sua data de validade é "+getDataDeValidade()+".";
}

public boolean estaVencido(Data dataAtual){
    if (this.dataDeValidade.getAno() < dataAtual.getAno())
        return true;
        else if (this.dataDeValidade.getAno() == dataAtual.getAno()){
            if (this.dataDeValidade.getMes() < dataAtual.getMes()) 
                return true;
        else if (this.dataDeValidade.getMes() == dataAtual.getMes()){
            if (this.dataDeValidade.getDia() < dataAtual.getDia())
                return true;
        }
    } 
    return false;
}
}
