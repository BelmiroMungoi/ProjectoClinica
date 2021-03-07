package modelBeans;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Belmiro-Mungoi
 */
public class BeansHora {
    public String hora;
    SimpleDateFormat horaForm = new SimpleDateFormat("HH:mm:ss");
    
    public void lerHora(){
        Date horaAtual = new Date();
        hora = horaForm.format(horaAtual);
    }
}
