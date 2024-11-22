public class Endereco {
    String nomeDaRua;
    String cidade;
    String estado;
    String pais;
    String cep;
    String numero; 
    String complemento; 

public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento){
    this.nomeDaRua = nomeDaRua;
    this.cidade = cidade;
    this.estado = estado;
    this.pais = pais;
    this.cep = cep;
    this.numero = numero;
    this.complemento = complemento;
}

public String getNomeDaRua(){
    return nomeDaRua;
}

public void setNomeDaRua(String novoNomeDaRua){
    this.nomeDaRua = novoNomeDaRua;
}

public String getCidade(){
    return cidade;
}

public void setCidade(String novaCidade){
    this.cidade = novaCidade;
}

public String getEstado(){
    return estado;
}

public void setEstado(String novoEstado){
    this.estado = novoEstado;
}

public String getPais(){
    return pais;
}

public void setPais(String novoPais){
    this.pais = novoPais;
}

public String getCep(){
    return cep;
}

public void setCep(String novoCep){
    this.cep = novoCep;
}

public String getNumero(){
    return numero;
}

public void setNumero(String novoNumero){
    this.numero = novoNumero;
}

public String getComplemento(){
    return complemento;
}

public void setComplemento(String novoComplemento){
    this.complemento = novoComplemento;
}
public String toString(){
    return "Rua "+getNomeDaRua()+", Número "+getNumero()+". Complemento "+getComplemento()+", CEP "+getCep()
    +", Cidade "+getCidade()+", Estado "+getEstado()+", País "+getPais()+".";
}
}
