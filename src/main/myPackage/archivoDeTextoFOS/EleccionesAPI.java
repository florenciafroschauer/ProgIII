package myPackage.archivoDeTextoFOS;

import java.util.ArrayList;

public class EleccionesAPI {
    public static void main(String[] args) {

    }

    public void candidatoGanador(String nombreArchivo){
        try {
            Elecciones archivo = new Elecciones(nombreArchivo);
            ArrayList<Mesa> mesasFemenino = archivo.mesasPorGenero('F');
            int cantA = 0,cantB=0,cantC=0;
            for (Mesa mesa:mesasFemenino) {
                cantA+=mesa.getVotA();
                cantB+=mesa.getVotB();
                cantC+=mesa.getVotC();
            }
            if (cantA>cantB && cantA>cantC) System.out.println("A es ganador entre los votantes femeninos");
            if (cantB>cantA && cantB>cantC) System.out.println("B es ganador entre los votantes femeninos");
            if (cantC>cantA && cantC>cantB) System.out.println("C es ganador entre los votantes femeninos");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void votosPorCandidatoYDistrito(String nombreArchivo){
        try {
            Elecciones archivo = new Elecciones(nombreArchivo);
            for (int i=0;i<25;i++){
            }





        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
