
package imagemcn.dados;

public class Registro {
    private Usuario usuario;
    private int cod;
    private String ubs;
    private String exame;
    private String tipo_exame;
    private String consulta;
    private String data;
    private String profisional;

    public Registro(Usuario usuario, int cod, String ubs, String exame, String tipo_exame, String consulta, String data,String profisional) {
        this.usuario = usuario;
        this.cod = cod;
        this.ubs = ubs;
        this.exame = exame;
        this.tipo_exame = tipo_exame;
        this.consulta = consulta;
        this.data = data;
        this.profisional=profisional;
    }

    public Registro() {
        
    }

    public String getProfisional() {
        return profisional;
    }

    public void setProfisional(String profisional) {
        this.profisional = profisional;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getUbs() {
        return ubs;
    }

    public void setUbs(String ubs) {
        this.ubs = ubs;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public String getTipo_exame() {
        return tipo_exame;
    }

    public void setTipo_exame(String tipo_exame) {
        this.tipo_exame = tipo_exame;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
