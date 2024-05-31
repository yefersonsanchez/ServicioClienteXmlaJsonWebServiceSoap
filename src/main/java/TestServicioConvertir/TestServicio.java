/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestServicioConvertir;

import clientews.servicio.ServicioConvertidorInterfaz;
import clientews.servicio.ServicioConvertidorService;

/**
 *
 * @author yefer
 */
public class TestServicio {

    public static void main(String[] args) {

        ServicioConvertidorInterfaz e = new ServicioConvertidorService().getServicioConvertidorPort();

        String archivo = "<?xml version=\"1.0\"?>\n"
                + "<class>\n"
                + "<student rollno=\"393\">\n"
                + "<firstname>dinkar</firstname>\n"
                + "<lastname>kad</lastname>\n"
                + "<nickname>dinkar</nickname>\n"
                + "<marks>85</marks>\n"
                + "</student>\n"
                + "<student rollno=\"493\"> \n"
                + "<firstname>Vaneet</firstname> \n"
                + "<lastname>Gupta</lastname> \n"
                + "<nickname>vinni</nickname> \n"
                + "<marks>95</marks>\n"
                + "</student> \n"
                + "<student rollno=\"593\">\n"
                + "<firstname>jasvir</firstname> \n"
                + "<lastname>singn</lastname>\n"
                + "<nickname>jazz</nickname>\n"
                + "<marks>90</marks>\n"
                + "</student>\n"
                + "</class>";

        System.out.println("Resultado: " + e.convertir(archivo));

        System.out.println("");
        System.out.println("Fin Servicio Convertir");
    }

}
