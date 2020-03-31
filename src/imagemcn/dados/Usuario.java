
package imagemcn.dados;


public  class Usuario {
   private String sus;
   private String nome;
   private String dn;
   private String endereco;
   private String cidade;

    public Usuario(String sus, String nome, String dn, String endereco, String cidade) {
        this.sus = sus;
        this.nome = nome;
        this.dn = dn;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public Usuario() {
    }

    public String getSus() {
        return sus;
    }

    public void setSus(String sus) {
        this.sus = sus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
   
   
   
}
