package dominio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.google.common.collect.Sets;


public class CreadorSugerencias {

    public static ArrayList<Sugerencia> generarSugerencia(ArrayList<Ropa> listaRopa)throws NoTienePrendasException{


        List<Set<Ropa>> setsSeparados = listaPorCategoria(listaRopa);

        Set<List<Ropa>> temp = Sets.cartesianProduct(setsSeparados);

        ArrayList<Sugerencia> sugerencias = new ArrayList<>();

        for (List<Ropa> listaPrenda:temp) {
            sugerencias.add(new Sugerencia(listaPrenda));
        }

        return sugerencias;
    }

    static private List<Set<Ropa>> listaPorCategoria(ArrayList<Ropa> prendas)throws NoTienePrendasException{

        List<Set<Ropa>> listasSeparadas = new ArrayList<>();
        listasSeparadas.add(filtroCategoria(prendas,eCategoria.torso));
        listasSeparadas.add(filtroCategoria(prendas,eCategoria.torsoAbrigo));
        listasSeparadas.add(filtroCategoria(prendas,eCategoria.inferior));
        listasSeparadas.add(filtroCategoria(prendas,eCategoria.pies));
        listasSeparadas.add(filtroCategoria(prendas,eCategoria.accesorio));



        return listasSeparadas;
    }

    static private Set<Ropa> filtroCategoria(ArrayList<Ropa> listaRopa,eCategoria categoria) throws NoTienePrendasException{

        Set<Ropa> prendas= new HashSet<Ropa>();
        for(Ropa ropa:listaRopa){

            if (ropa.categoriaPrenda()==categoria){
                prendas.add(ropa);
            }
        }

        if (prendas.isEmpty()){
            throw new NoTienePrendasException("La lista no tiene prendas de la categoria "  + categoria);
        }

        return prendas;
    }



}



