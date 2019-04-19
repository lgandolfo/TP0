package dominio;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Ropa {

    public Ropa(TipoPrenda tipo,eColor colorPrenda) throws CreadorRopaException{
        validarParametros(new ArrayList<>(Arrays.asList(tipo,colorPrenda)));
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


    private void validarParametros(ArrayList<Object> params) throws CreadorRopaException {
        if (params.stream().anyMatch(Objects::isNull)){
            throw new CreadorRopaException("Los parametros no pueden ser null");
        }
    }



}
