package dominio;

import java.util.ArrayList;
import java.util.List;


public class Sugerencia {

    List<Ropa> sugerencia;

    public Sugerencia() {
        sugerencia = new ArrayList<Ropa>();
    }

    public Sugerencia(List<Ropa> listaPrenda) {
        sugerencia = new ArrayList<>();

        for (Ropa prenda:listaPrenda){
            sugerencia.add(prenda);
        }
    }



    public void mostrar(){
        System.out.print(sugerencia);
    }
}
