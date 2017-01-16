/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author usu32
 */
public class Streams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );
        
        Equipo goldenState = new Equipo("GoldenState", "Barcelona");
        Equipo realMadrid = new Equipo("RealMadrid", "Madrid");
        Equipo valencia = new Equipo("Valencia", "valencia");
        
        List<Jugador> jugadores = Arrays.asList(
            new Jugador("StephenCurry", LocalDate.of(1990, 03, 17), 500, goldenState),
            new Jugador("LucaDoncic", LocalDate.of(1997, 03, 17), 1000, realMadrid),
            new Jugador("Navarro", LocalDate.of(1980, 06, 18), 600, valencia),
            new Jugador("PauGasol", LocalDate.of(1985, 07, 30), 367, valencia),
            new Jugador("GreymondGreen", LocalDate.of(1992, 01, 31), 100, goldenState),
            new Jugador("Llull", LocalDate.of(1995, 04, 5), 159, realMadrid)
        );
        
        System.out.println("***** EJERCICIO 2.2");
        for(Jugador j : jugadores){
            if(j.getCanastas() > 500){
                System.out.println(j);
            }
        }
        System.out.println("***** EJERCICIO 2.3");
        for(Jugador j : jugadores){
            if(j.getCanastas()> 200 && j.getCanastas() <= 500){
                System.out.println(j);
            }
        }
        System.out.println("***** EJERCICIO 2.4");
        for(Jugador j : jugadores){
            if(j.getCanastas()> 200 && j.getCanastas() <= 500){
                System.out.println(j.getNombre());
            }
        }
        System.out.println("***** EJERCICIO 2.5");
        List<Jugador> jugadores2 =
    }
}
