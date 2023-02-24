public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(){

    }

    public Contato(String nome, String telefone, String email){
        this.telefone =telefone;
        this.nome = nome;
        this.email =email;
    }
    public String getEmail() {
        return email;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    @Override
    public String toString(){
        return "contato{"+ "nome="+ nome + ", telefone" + telefone + ", e-mail=" + email +"}";
    }
}
