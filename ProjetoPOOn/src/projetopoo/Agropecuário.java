
package projetopoo;


public class Agropecuário {
    private int cod_AP;
    private String CNPJ;
    private String Atividade;
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
        return "Agropecuário{" + "CNPJ=" + CNPJ + ", Atividade=" + Atividade + ", Razão Social=" + RS + ", Nome=" + Nome + ", Endereço=" + Endereço + ", Telefone=" + Telefone + ", Email=" + Email + ", Senha=" + Senha + '}';
    }

    public int getCod_AP() {
        return cod_AP;
    }

    public void setCod_AP(int cod_AP) {
        this.cod_AP = cod_AP;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getAtividade() {
        return Atividade;
    }

    public void setAtividade(String Ativade) {
        this.Atividade = Ativade;
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
