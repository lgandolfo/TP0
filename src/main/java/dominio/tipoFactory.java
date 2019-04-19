package dominio;

public class tipoFactory {


    static public TipoPrenda remera(){
        return new TipoPrenda(eTipoPrenda.remera,eCategoria.torso);

    }


    static public TipoPrenda buzo(){
        return new TipoPrenda(eTipoPrenda.buzo,eCategoria.torso);

    }


    static public TipoPrenda campera(){
        return new TipoPrenda(eTipoPrenda.campera,eCategoria.torso);

    }


    static public TipoPrenda pantalon(){
        return new TipoPrenda(eTipoPrenda.pantalon,eCategoria.inferior);

    }

    static public TipoPrenda jean(){
        return new TipoPrenda(eTipoPrenda.pantalon,eCategoria.inferior);

    }


    static public TipoPrenda zapatillas(){
        return new TipoPrenda(eTipoPrenda.zapatillas,eCategoria.pies);

    }

    static public TipoPrenda zapatos(){
        return new TipoPrenda(eTipoPrenda.zapatos,eCategoria.pies);

    }

    static public TipoPrenda accesorio(){
        return new TipoPrenda(eTipoPrenda.accesorio,eCategoria.accesorio);

    }
}
