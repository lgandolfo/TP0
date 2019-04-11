package dominio;


import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


import java.lang.reflect.Array;

public class ArmarioTest {

    Ropa remera;
    Ropa jean;
    Armario armario;

    @Before
    public void init(){
        remera = new Ropa(new tipoFactory().remera(),eColor.rojo);
        jean = new Ropa(new tipoFactory().pantalon(),eColor.azul);
        armario = new Armario();
        armario.agragarRopa(remera);
    }

    @Test(expected = NoEstaLaPrendaException.class)
    public void noEstaLaPrenda() throws NoEstaLaPrendaException{
        armario.quitarPrenda(jean);
    }



}
