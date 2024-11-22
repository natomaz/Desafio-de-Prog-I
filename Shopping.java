public class Shopping {
    String nome;
    Endereco endereco;
    Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco novoEndereco){
        this.endereco = novoEndereco;
    }

    public Loja[] getLojas(){
        return lojas;
    }

    public void setLojas(Loja[] novasLojas){
        this.lojas = novasLojas;
    }

    public String toString(){
        return "O shopping "
        +getNome()+
        " que fica no endereço "
        +getEndereco()+
        " possui "
        +getLojas().length+" lojas.";
    }

    public boolean insereLoja(Loja novaLoja){
        for (int i = 0; i < lojas.length; i++){
            if (lojas[i] == null){
                lojas[i] = novaLoja;
                return true;
            }
        } 
        return false;
    }

    public boolean removeLoja(String nomeLoja){
        for (int i = 0; i < lojas.length; i++){
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja){
        int quantidade = 0;

        for (Loja loja : lojas){
            if (loja != null && tipoLoja.equalsIgnoreCase("Alimentação") && loja instanceof Alimentacao)
            quantidade++;
            else if (loja != null && tipoLoja.equalsIgnoreCase("Bijuteria") && loja instanceof Bijuteria)
            quantidade++;
            else if (loja != null && tipoLoja.equalsIgnoreCase("Cosmético") && loja instanceof Cosmetico)
            quantidade++;
            else if (loja != null && tipoLoja.equalsIgnoreCase("Informática") && loja instanceof Informatica)
            quantidade++;
            else if (loja != null && tipoLoja.equalsIgnoreCase("Vestuário") && loja instanceof Vestuario)
            quantidade++;
        }
        return (quantidade > 0 ) ? quantidade : -1;
    }

    public Informatica lojaSeguroMaisCaro(){
        Informatica lojaMaisCara = null;
        double maiorSeguro = 0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) loja;
                if (lojaInformatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = lojaInformatica.getSeguroEletronicos();
                    lojaMaisCara = lojaInformatica;
                }
            }
        }
        return lojaMaisCara;
    }

    
}
