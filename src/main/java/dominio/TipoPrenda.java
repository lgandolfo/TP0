package dominio;

public class TipoPrenda {

    public TipoPrenda(eTipoPrenda _tipo,eCategoria _categoria){
        tipo = _tipo;
        categoria = _categoria;
    }

    private eTipoPrenda tipo;
    private eCategoria categoria;

    public eCategoria getCategoria(){
        return this.categoria;
    }
}
