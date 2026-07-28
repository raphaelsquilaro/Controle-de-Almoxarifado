package sp.senai.org.controle_de_almoxarifado.model;

public class TagRFID {
    private Long id;
    private String codigoTag;
    private Produto produto;
    private boolean ativo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoTag() {
        return codigoTag;
    }

    public void setCodigoTag(String codigoTag) {
        this.codigoTag = codigoTag;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
