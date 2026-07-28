package sp.senai.org.controle_de_almoxarifado.model;

public class LeitorRFID {
    private Long id;
    private String nome;
    private String localizacao;
    private String enderecoIP;
    private boolean online;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getEnderecoIP() {
        return enderecoIP;
    }

    public void setEnderecoIP(String enderecoIP) {
        this.enderecoIP = enderecoIP;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
