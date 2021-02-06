package com.company;

import java.text.ParseException;
import java.util.*;

public class Main {

    public static String findDay(int month, int day, int year) {

        String[] dayWeek = {"SUNDAY", "MONDAY",
                "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        int x = calendar.get(Calendar.DAY_OF_WEEK);
        return dayWeek[x - 1];
    }

    public static void main(String[] args) {
        // write your code here

        String b = findDay(2, 13, 2010);
        System.out.println(b);


        /*************************************************************************************************************
         FECHA Y HORA EN JAVA
         */
        /*LocalDate myObj = LocalDate.now(); // Para la fecha actual
        System.out.println("Fecha actual --> " + myObj);

        LocalTime hora = LocalTime.now();
        System.out.println("Hora actual --> " + hora);

        LocalDateTime fechaYHora = LocalDateTime.now();
        System.out.println("Fecha y Hora actual --> " + fechaYHora);*/

        /*************************************************************************************************************
         FORMATO DE FECHA Y HORA
         */

        /*LocalDateTime horaYFechaActual = LocalDateTime.now();
        System.out.println("Fecha y Hora actual: " + horaYFechaActual);

        DateTimeFormatter formatoHoraYFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaFormateada = formatoHoraYFecha.format(horaYFechaActual);
        System.out.println(fechaFormateada);

        LocalDate fcha = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MM yyyy");
        String fchaFormateada = format.format(fcha);
        System.out.println(fchaFormateada);*/

        /*************************************************************************************************************
         Java:Calendar.get()
         */

        /*Calendar c = new GregorianCalendar();

        String dia, mes, annio;

        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH));
        annio = Integer.toString(c.get(Calendar.YEAR));


        System.out.println (dia + "/" + mes +"/" + annio);*/

      /*  Calendar calendar = new GregorianCalendar();
        Date trialTime = new Date();
        calendar.setTime(trialTime);
        System.out.println("1-Era: " + calendar.get(Calendar.ERA));
        System.out.println("2-Year: " + calendar.get(Calendar.YEAR));
        System.out.println("3-Mes: " + calendar.get(Calendar.MONTH));
        System.out.println("4-Semana del año: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("5-Semana del mes: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("6-FECHA: " + calendar.get(Calendar.DATE));
        System.out.println("7-Dia del mes: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("8-numero dia del año: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("9-dia de la semana: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("10-día de la semana en el mes: "
                + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("11-AM_PM: " + calendar.get(Calendar.AM_PM));
        System.out.println("12-HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("13-HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("14-MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("15-SECOND: " + calendar.get(Calendar.SECOND));
        System.out.println("16-MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
        System.out.println("17-ZONE_OFFSET: "
                + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
        System.out.println("18-DST_OFFSET: "
                + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000)));
        System.out.println("19-Current Time, with hour reset to 3");
        calendar.clear(Calendar.HOUR_OF_DAY); // so doesn't override
        calendar.set(Calendar.HOUR, 3);
        System.out.println("20-ERA: " + calendar.get(Calendar.ERA));
        System.out.println("21-YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("22-MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("23-WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("24-WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("25-DATE: " + calendar.get(Calendar.DATE));
        System.out.println("26-DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("27-DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("28-DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("29-DAY_OF_WEEK_IN_MONTH: "
                + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("30-AM_PM: " + calendar.get(Calendar.AM_PM));
        System.out.println("31-HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("32-HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("33-MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("34-SECOND: " + calendar.get(Calendar.SECOND));
        System.out.println("35-MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
        System.out.println("36-ZONE_OFFSET: "
                + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000))); // in hours
        System.out.println("37-DST_OFFSET: "
                + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000))); // in hours*/




        /*Date f = new Date();
        Calendar calendar = new GregorianCalendar(2015, 7, 5);



        System.out.println("1-Era: " + calendar.get(Calendar.ERA));
        System.out.println("2-Year: " + calendar.get(Calendar.YEAR));
        System.out.println("3-Mes: " + calendar.get(Calendar.MONTH));
        System.out.println("4-Semana del año: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("5-Semana del mes: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("6-FECHA: " + calendar.get(Calendar.DATE));
        System.out.println("7-Dia del mes: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("8-numero dia del año: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("9-dia de la semana: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("10-día de la semana en el mes: "
                + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));*/


    }
}
