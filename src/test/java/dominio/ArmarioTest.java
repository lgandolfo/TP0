package dominio;


import com.sun.tools.javac.util.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;





import java.lang.reflect.Array;

public class ArmarioTest {

    Ropa remera;
    Ropa jean;
    Ropa campera;
    Ropa pantalon;
    Ropa gorra;
    Armario armario;

    @Before
    public void init() throws CreadorRopaException{
        remera = new Ropa(tipoFactory.remera(),eColor.rojo);
        jean = new Ropa(tipoFactory.jean(),eColor.azul);
        campera = new Ropa(tipoFactory.campera(),eColor.amarillo);
        gorra = new Ropa(tipoFactory.accesorio(),eColor.negro);
        pantalon = new Ropa(tipoFactory.pantalon(),eColor.negro);
        armario = new Armario();
        armario.agregarRopa(remera);
        armario.agregarRopa(jean);
        armario.agregarRopa(campera);
        armario.agregarRopa(gorra);
        armario.agregarRopa(pantalon);
    }

    @Test(expected = NoTienePrendasException.class)
    public void NoHaySugerencia() throws Exception{
        armario.sugerenciasDeAtuendos();
    }

    @Test
    public void CantidadDeSugerenciasCorrectas() throws Exception{
        Ropa zapatos = new Ropa(tipoFactory.zapatos(),eColor.negro);
        armario.agregarRopa(zapatos);
        assertEquals(4,armario.sugerenciasDeAtuendos().size());
    }
}
