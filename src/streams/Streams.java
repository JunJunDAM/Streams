/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        
        
        /adasdasd
        
        System.out.println("***** EJERCICIO 2.2");
        List<Jugador> ej1 = jugadores.stream().filter(a -> a.getCanastas() > 500).collect(Collectors.toList());
        System.out.println(ej1);
        System.out.println("***** EJERCICIO 2.3");
        List<Jugador>ej2 = jugadores.stream().filter(a -> a.getCanastas() >= 200 && a.getCanastas() <= 500).collect(Collectors.toList());
        System.out.println(ej2);
        System.out.println("***** EJERCICIO 2.4");
        //List<Jugador>ej3 = jugadores.stream().filter(a -> a.getCanastas() >= 200 && a.getCanastas() <= 500).map(Jugador::getNombre).collect(Collectors.toList());
        //System.out.println(ej3);
        System.out.println("***** EJERCICIO 2.5");
        List<Jugador> ej4 = jugadores.stream().sorted(Comparator.comparing(Jugador::getFechaNacimiento)).collect(Collectors.toList());
        System.out.println(ej4);
        System.out.println("***** EJERCICIO 2.6");
        List<Jugador> ej5 = jugadores.stream().sorted(Comparator.comparing(Jugador::getCanastas)).collect(Collectors.toList());
        System.out.println(ej5);
        System.out.println("***** EJERCICIO 2.7");
        List<Jugador> ej6 = jugadores.stream().sorted(Comparator.comparing(Jugador::getCanastas)).limit(5).collect(Collectors.toList());
        System.out.println(ej6);
        System.out.println("***** EJERCICIO 2.8");
        List<Jugador> ej7 = jugadores.stream().filter(a -> a.getCanastas() >= 200 && a.getCanastas() <= 500).sorted(Comparator.comparing(Jugador::getFechaNacimiento).reversed()).collect(Collectors.toList());
        System.out.println(ej7);
        System.out.println("***** EJERCICIO 2.9");
        System.out.println("***** EJERCICIO 2.10");
        List<Jugador> ej9 = (List<Jugador>) jugadores.stream().min(Comparator.comparing(Jugador::getCanastas)).get();
        System.out.println(ej9);
        System.out.println("***** EJERCICIO 2.11");
        List<Jugador> ej10 = (List<Jugador>) jugadores.stream().max(Comparator.comparing(Jugador::getCanastas)).get();
        System.out.println(ej10);
        System.out.println("***** EJERCICIO 2.12");
        double ej11 = jugadores.stream().mapToDouble(Jugador::getCanastas).average().getAsDouble();
        System.out.println(ej11);
        System.out.println("***** EJERCICIO 2.13");
        List<Jugador>ej12 = jugadores.stream().filter(a -> a.getEquipo().getLocalidad().equalsIgnoreCase("Barcelona")).collect(Collectors.toList());
        System.out.println(ej12);
        System.out.println("***** EJERCICIO 2.14");
        boolean ej13 = jugadores.stream().anyMatch(a -> a.getCanastas() > 4000);
        System.out.println(ej13);
        System.out.println("***** EJERCICIO 2.15");
        boolean ej14 = jugadores.stream().anyMatch(a -> a.getCanastas() > 50);
        System.out.println(ej14);
        System.out.println("***** EJERCICIO 2.16");
        boolean ej15 = jugadores.stream().filter(a -> a.getEquipo().getNombre().equalsIgnoreCase("GoldenState")).allMatch(b -> b.getCanastas() > 50);
        System.out.println(ej15);
        System.out.println("***** EJERCICIO 2.17");
        System.out.println("***** EJERCICIO 2.18");
        int ej17 = jugadores.parallelStream().mapToInt(Jugador::getCanastas).reduce(0, (a,b) -> a+b);
        System.out.println(ej17);
    }
}
