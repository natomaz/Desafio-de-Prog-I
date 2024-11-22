public class Data {
    int dia;
    int mes;
    int ano;

public Data(int dia, int mes, int ano){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
      
    if (mes < 1 || mes > 12){
        dia = 1;
        mes = 1;
        ano = 2000;
    }

    int[] diasNoMes = {31,28,31,30,31,30,31,31,30,31,30,31};

    if (verificaAnoBissexto() == true) 
    diasNoMes[1] = 29;

    if (dia < 1 || dia > diasNoMes[mes - 1])
    System.out.println("Intervalo inválido.");
}

public int getDia(){
    return dia;
}

public void setDia(int novoDia){
    this.dia = novoDia;
}

public int getMes(){
    return mes;
}

public void setMes(int novoMes){
    this.mes = novoMes;
}

public int getAno(){
    return ano;
}

public void setAno(int novoAno){
    this.ano = novoAno;
}

public String toString(){
    return Integer.toString(dia)+"/"+Integer.toString(mes)+"/"+Integer.toString(ano);
}

public boolean verificaAnoBissexto(){

    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) 
        return true;
    else
        return false;
     
}
}
