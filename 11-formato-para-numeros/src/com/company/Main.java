package com.company;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        Long payment = in.nextLong();
        in.close();

        NumberFormat usaFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String usa = usaFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);

        System.out.println("US: " + usa);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);


        /**************************************************************************************************************
         ---- getCurrencyInstance ----





         */


        /**************************************************************************************************************
         LA CLASE NUMBERFORMAT
         NumberFormat es la clase base abstracta para todos los formatos de números. Esta clase proporciona la interfaz
         para formatear y analizar números. NumberFormattambién proporciona métodos para determinar qué configuraciones
         regionales tienen formatos de números y cuáles son sus nombres.

         /*
         int number = 1;
         String myStr = NumberFormat.getInstance().format(number); // Convierte un dato a String;
         System.out.println(myStr);
         System.out.println(myStr.getClass().getSimpleName());

         int[] matriz = {2, 4, 4, 5, 6, 9, 10};

         NumberFormat nf = NumberFormat.getInstance();*/

        /*
        Si está formateando varios números, es más eficiente obtener el formato y usarlo varias veces para que el
        sistema no tenga que obtener la información sobre el idioma local y las convenciones de los países varias veces.
        */

      /*  for (int i: matriz){
            System.out.println(nf.format(i) + " Formateado a string");
        }*/

       /*
       Para formatear un número para una configuración regional diferente, especifíquelo en la llamada a getInstance.
       */

        /*NumberFormat nf2 = NumberFormat.getInstance(Locale.CANADA_FRENCH);*/

        /*
        También puede usar a NumberFormatpara analizar números:
        * */

        /*String str = "HOla";
        Number numero = nf.parse(str);*/

        /* Use getInstance o getNumberInstancepara obtener el formato de número normal. Use getIntegerInstancepara
        obtener un formato de número entero.*/

        /*String stri = "4";
        int num = NumberFormat.getIntegerInstance().format(stri);*/


    }
}
