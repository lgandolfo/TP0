package dominio;

public class Ropa {

    public Ropa(TipoPrenda tipo,eColor colorPrenda){
        color = colorPrenda;
        tipoPrenda = tipo;

    }


    private eColor color;
    private TipoPrenda tipoPrenda;

    public eCategoria categoriaPrenda(){
        return tipoPrenda.getCategoria();
    }

    public void mostrarPrenda(){
        System.out.println(tipoPrenda + " " + color + " " + categoriaPrenda());
    }



}
