import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{

    private ArrayList<Carta> mazo;
    private Carta valorCarta;

    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
        mazo = new ArrayList<Carta>();

        Palo[] palosEnum; //guardamos en un array los palos 
        palosEnum = Palo.values();// devuelve un array que contiende los enum
        Palo paloEnum = null; //cambio de -1 a null;
        for (int paloActual = 0; paloActual < palosEnum.length; paloActual++) {
            for (int valorActual = 1; valorActual <= 12; valorActual++) {
                if (valorActual != 8 && valorActual != 9) {

                    mazo.add(new Carta(valorActual, palosEnum[paloActual]));


                }
            }          
        }

    
    }

    public void verCartasDelMazo()
    {
        for (int i = 0; i < mazo.size(); i++) {
            System.out.println(mazo.get(i));
        }
    }

    public void barajar()
    {
        for (int posicionActual = 0; posicionActual < mazo.size(); posicionActual++) {
            Carta carta1 = mazo.get(posicionActual);
            Random aleatorio = new Random();
            int posicionAleatoria = aleatorio.nextInt(mazo.size());        
            mazo.set(posicionActual, mazo.get(posicionAleatoria));
            mazo.set(posicionAleatoria, carta1);
        }

    }

    public Carta sacarCarta()
    {        
        Carta cartaADevolver = null;
        if (mazo.size() > 0) {
            cartaADevolver = mazo.remove(0);      
        }
        return cartaADevolver;
    }

}





