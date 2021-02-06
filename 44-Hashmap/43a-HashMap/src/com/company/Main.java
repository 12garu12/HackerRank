package com.company;

import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here

        HashMap<String, String> capitalCities2 = new HashMap<>();
        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England", "London"); //Asocia el valor especificado con la clave especificada en este mapa
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Norway", "Washington DC");


        System.out.println(capitalCities);
        boolean a = capitalCities.containsKey("USA"); // Devuelve verdadero si este mapa contiene un mapeo para la clave especificada.
        //System.out.println(a);
        boolean b = capitalCities.containsValue("Berlin"); // Devuelve verdadero si este mapa asigna una o más claves al valor especificado.
        //System.out.println(b);
        String city = capitalCities.get("England");// Devuelve el valor al que se asigna la clave especificada, o nulo si este mapa no contiene ninguna asignación para la clave.
        System.out.println(city);
        System.out.println(capitalCities.entrySet()); // Devuelve una vista de conjunto de las asignaciones contenidas en este mapa
        boolean mapaLlenoOVacio = capitalCities.isEmpty(); // Devuelve verdadero si este mapa no contiene asignaciones de clave-valor.
        System.out.println(mapaLlenoOVacio);
        System.out.println(capitalCities.keySet()); //Devuelve una vista de conjunto de las claves contenidas en este mapa.

        String cityEliminada = capitalCities.remove("Norway"); // Elimina la asignación para la clave especificada de este mapa, si está presente.
        System.out.println(cityEliminada);

        System.out.println(capitalCities);

        int tamaño = capitalCities.size(); //Devuelve una vista de colección de los valores contenidos en este mapa
        System.out.println(tamaño);

        // Devuelve una vista de colección de los valores contenidos en este mapa
        System.out.println(capitalCities.values());

        System.out.println(capitalCities.get("USA").equals(capitalCities.get("Germany")) + " comparacion"); //Compara el objeto especificado con esta entrada para determinar la igualdad.

        System.out.println(capitalCities.get("USA").hashCode()); //Devuelve el valor del código hash para esta entrada de mapa

        System.out.println(capitalCities.toString()); // Devuelve una representación de cadena de este mapa.

        System.out.println(capitalCities.getClass());
    }
}
