package dominio;


import java.util.ArrayList;

public class Armario {

    ArrayList<Ropa> listaRopa = new ArrayList<Ropa>();
    private int cantidadRopa;



    public void agragarRopa(Ropa prenda){
        listaRopa.add(prenda);
    }

    public void quitarPrenda(Ropa prenda) throws NoEstaLaPrendaException {

        if(listaRopa.contains(prenda)) {
            listaRopa.remove(prenda);
        }
        else {
            throw new NoEstaLaPrendaException("La prenda no existe");
        }
    }
}
