package dominio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PrendaTest {

    Ropa anteojos;
    Ropa remera;

    @Before
    public void init() throws CreadorRopaException {
        anteojos = new Ropa(tipoFactory.accesorio(),eColor.rojo);
        remera = new Ropa(tipoFactory.remera(),eColor.amarillo);
    }

    @Test
    public void tipoPrenda() {
        Assert.assertEquals(remera.categoriaPrenda(), eCategoria.torso);
    }

    @Test
    public void tipoPrendaMal() {
        Assert.assertNotEquals(anteojos.categoriaPrenda(), eCategoria.torso);
    }

    @Test(expected = CreadorRopaException.class)
    public void noDeberiaContruirConNull() throws CreadorRopaException {
        Ropa loco = new Ropa(null,null);
    }

}
