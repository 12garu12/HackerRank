package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /**************************************************************************************************************
         Java HashMap
         En el ArrayListcapítulo, aprendió que las matrices almacenan elementos como una colección ordenada, y tiene
         que acceder a ellos con un número de índice ( inttipo). Sin HashMapembargo, almacene los artículos en
         pares " clave / valor ", y puede acceder a ellos mediante un índice de otro tipo (por ejemplo, a String).
         Un objeto se utiliza como clave (índice) para otro objeto (valor). Puede almacenar diferentes
         tipos: Stringclaves y Integervalores, o el mismo tipo, como: Stringclaves y Stringvalores:

         Ejemplo
         Cree un HashMapobjeto llamado capitalCities que almacenará String claves y String valores :
         */

        HashMap<String, String> capitalCities = new HashMap<>();
        System.out.println(capitalCities);

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Usa", "Washington DC");
        System.out.println(capitalCities);

        // para acceder a un valor  con el metodo get()
        System.out.println("metodo get(): " + capitalCities.get("Germany"));

        // Para eliminar un elemento con el metodo remove()
        capitalCities.remove("Norway");
        System.out.println(capitalCities);

        // Para eliminar todos los elementos utilice el metodo clear
        /*capitalCities.clear();
        System.out.println(capitalCities);
        */

        // Para saber cuántos elementos hay, use el metodo size()
        System.out.println(capitalCities.size());

        /*Recorrer un mapa de hash
        Recorre los elementos de a HashMapcon un ciclo for-each .
        Nota: Use el keySet()método si solo quiere las claves, y use el values()método si solo quiere los valores:
        */

        // Para imprimir las Key
        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }
        // Para imprimir los valores
        for (String values : capitalCities.values()) {
            System.out.println(values);
        }

        // El metodo get() Para obtener el valor hay que ponerle como argumento la key
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + "  Value: " + capitalCities.get(i));
        }

        System.out.println(capitalCities.keySet());
        System.out.println(capitalCities.values());

        System.out.println(capitalCities);
        System.out.println(capitalCities.getClass().getSimpleName());
        System.out.println(capitalCities.entrySet());  // Devuelve clave valor en una lista

        // Para saber si la variable esta vacia o no.
        boolean a = capitalCities.isEmpty();
        System.out.println(a);

        // Para cambiar un valor al hasmap
        capitalCities.replace("Usa", "Washington DC", "New York");
        System.out.println(capitalCities);


    }
}
