package projetopoo;


public class Produto {
        
    private int cod_P;
    private String Categoria;
    private int cod_AP;
    private String Nome;
    private String Valor;
    private String Quant;
  
    /*
    public String Login(){
        return "Nome: "+Nome + "   Email: "+Email + "\n "+RS + "   Endereço: "+Endereço;
    }
    */

    public String Status() {
        return "Produto{" + "Nome=" + Nome + ", Quantidade=" + Quant + 
                ", Valor=" + Valor + ", Categoria=" + Categoria +
                ", Codigo Forn=" + cod_AP + ", Codigo Prod=" + cod_P + '}';
    }
    
    public String Resumo() {
        return "Produto{" + "Nome=" + Nome + ", Quantidade=" + Quant + 
                ", Valor=" + Valor + ", Codigo Forn=" + cod_AP + ", Codigo Prod=" + cod_P + '}';
    }

    public int getCod_P() {
        return cod_P;
    }

    public void setCod_P(int cod_P) {
        this.cod_P = cod_P;
    }
    
     public int getCod_AP() {
        return cod_AP;
    }

    public void setCod_AP(int cod_AP) {
        this.cod_AP = cod_AP;
    }    

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }
    
    
    public String getQuant() {
        return Quant;
    }

    public void setQuant(String Quant) {
        this.Quant = Quant;
    }

  
    
}
