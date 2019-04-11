package dominio;

public class tipoFactory {


    public TipoPrenda remera(){
        return new TipoPrenda(eTipoPrenda.remera,eCategoria.torso);

    }


    public TipoPrenda buzo(){
        return new TipoPrenda(eTipoPrenda.buzo,eCategoria.torso);

    }


    public TipoPrenda campera(){
        return new TipoPrenda(eTipoPrenda.campera,eCategoria.torso);

    }


    public TipoPrenda pantalon(){
        return new TipoPrenda(eTipoPrenda.pantalon,eCategoria.inferior);

    }


    public TipoPrenda zapatillas(){
        return new TipoPrenda(eTipoPrenda.zapatillas,eCategoria.pies);

    }

    public TipoPrenda zapatos(){
        return new TipoPrenda(eTipoPrenda.zapatos,eCategoria.pies);

    }

    public TipoPrenda accesorio(){
        return new TipoPrenda(eTipoPrenda.accesorio,eCategoria.accesorios);

    }
}
