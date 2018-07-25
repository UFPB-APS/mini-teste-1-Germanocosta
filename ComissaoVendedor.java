
public class ComissaoVendedor{
    
    public void setSalario(double salario){
        this.salario = salario;
    }


public void comissao(String nome){
    double somaSalario = 0;
    double comissaoNormal = 0.50;
    double comissaoMaior = 0.80;
    int qtVenda = 0;
    int metaVenda = 100;
    if(quantidadeVenda < metaVenda){
        somaSalario += comissaoNormal;
        salario = salario + somaSalario;
    }
}

public int getQuantidadeVenda(){
    return quantidadeVenda;
}

public void setQuantidadeVenda(int quantidadeVenda){
    this.quantidadeVenda = quantidadeVenda;
}
}    
    
   
   
    
    
        
