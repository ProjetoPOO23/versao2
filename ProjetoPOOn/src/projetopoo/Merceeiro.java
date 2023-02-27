package projetopoo;


public class Merceeiro {
    private int cod_M;
    private String CPF;
    private String RS; // Razão Social 
    private String Nome;
    private String Endereço;
    private String Telefone;
    private String Email;
    private String Senha;
    
    public String Login(){
        return "Nome: "+Nome + "   Email: "+Email + "\n "+RS + "   Endereço: "+Endereço;
    }
    
    public String Status() {
        return "Merceeiro{" + "CPF= " + CPF + ", Razão Social= " + RS + ", Nome= " + Nome + ", Endereço=" + Endereço + ", Telefone=" + Telefone + ", Email=" + Email + ", Senha=" + Senha + '}';
    }

    public int getCod_M() {
        return cod_M;
    }

    public void setCod_M(int cod_M) {
        this.cod_M = cod_M;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRS() {
        return RS;
    }

    public void setRS(String RS) {
        this.RS = RS;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
}