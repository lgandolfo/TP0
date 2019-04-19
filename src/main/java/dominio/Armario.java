package dominio;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import java.util.stream.Collectors;

public class Armario {

    ArrayList listaRopa = new ArrayList<Ropa>();

    public ArrayList<Sugerencia> sugerenciasDeAtuendos()throws NoTienePrendasException{
        return CreadorSugerencias.generarSugerencia(listaRopa);
    }


    public void agregarRopa(Ropa prenda){
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
