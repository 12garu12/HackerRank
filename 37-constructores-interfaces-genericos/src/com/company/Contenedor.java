package com.company;

/*---------------------------------------------------------------------------------------------------------------------
3. Interfaces genéricas
Como viste en el programa DemoMetodoGenerico presentado anteriormente, una interfaz puede ser genérica. En ese
ejemplo, la interfaz estándar Comparable<T> se usó para asegurar que los elementos de dos matrices se pudieran
comparar. Por supuesto, también puedes definir tu propia interfaz genérica.

Las interfaces genéricas se especifican al igual que las clases genéricas. Aquí hay un ejemplo. Crea una interfaz
llamada Contenedor, que puede ser implementada por clases que almacenan uno o más valores. Declara un método llamado
contenido() que determina si un valor especificado está contenido por el objeto invocado.
*/

public interface Contenedor<T> {

    // El método contenido() verifica que un elemento específicoestá contenido dentro de un objeto que implementa Contenedor
    boolean contenido(T o);
}

//Implementa Contenedor usando una matriz para contener los valores.

class MiClase<T> implements Contenedor<T> {

    T[] array;

    MiClase(T[] o) {
        array = o;
    }

    public boolean contenido(T o) {
        for (T x : array) {
            if (x.equals(o)) return true;
        }
        return false;
    }
}

class DemoIFGen {

    public static void main(String[] args) {
        Integer[] x = {1, 2, 3};

        MiClase<Integer> ob = new MiClase<>(x);

        if (ob.contenido(2)) System.out.println("2 está en ob");
        else System.out.println("2 NO está en ob");

        if (ob.contenido(5)) System.out.println("5 está en ob");
        else System.out.println("5 NO está en ob");

        // Lo siguiente es ilegal porque ob es un Contenedor de Integer y 9.25 es un valor Double.
        //if (ob.contenido(9.25)) System.out.println("9.25 está en ob");

    }
}

/*---------------------------------------------------------------------------------------------------------------------
Salida:

2 está en ob
5 NO está en ob

Aunque la mayoría de los aspectos de este programa deben ser fáciles de entender, es necesario establecer un par de
puntos clave. Primero, observe que Contenedor se declara así:

interface Contenedor<T> {

En general, una interfaz genérica se declara de la misma manera que una clase genérica. En este caso, el parámetro de
tipo T especifica el tipo de objetos que están contenidos. A continuación, MiClase implementa Contenedor. Observe
la declaración de MiClase, que se muestra aquí:

class MiClase<T> implements Contenedor<T>{

En general, si una clase implementa una interfaz genérica, esa clase también debe ser genérica, al menos en la medida
en que tome un parámetro de tipo que se pase a la interfaz. Por ejemplo, el siguiente intento de declarar MiClase es erróneo:

class MiClase implements Contenedor<T> { // Error!

Esta declaración es incorrecta porque MiClase no declara un parámetro de tipo, lo que significa que no hay forma de
pasar uno a Contenedor. En este caso, el identificador T es simplemente desconocido y el compilador informa un
error. Por supuesto, si una clase implementa un tipo específico de interfaz genérica, como se muestra aquí:

class MiClase implements Contenedor<Double> { // Ok!
entonces la clase implementadora no necesita ser genérica.

3.1. Explicación del código
Como era de esperar, los parámetros de tipo especificados por una interfaz genérica pueden ser acotados. Esto le
permite limitar el tipo de datos para los cuales se puede implementar la interfaz. Por ejemplo, si desea limitar la
contención a tipos numéricos, puede declararlo así:

interface Contenedor<T extends Number> {

Ahora, cualquier clase implementadora debe pasar a Contenedor un argumento de tipo que también tenga el mismo
límite. Por ejemplo, ahora MiClase se debe declarar como se muestra aquí:

class MiClase<T extends Number> implements Contenedor<T> {
Preste especial atención a la forma en que MiClase declara el parámetro de tipo T y luego pasa a Contenedor. Como
Contenedor ahora requiere un tipo que extienda Number, la clase implementadora (MiClase en este caso) debe especificar
el mismo límite. Además, una vez que se ha establecido este límite, no hay necesidad de especificarlo nuevamente en la
cláusula de implementaciones. De hecho, sería un error hacerlo. Por ejemplo, esta declaración es incorrecta y no
se compilará:

class MiClase<T extends Number> implements Contenedor<T extends Number>{ //Error! }

Una vez que se ha establecido el parámetro de tipo, simplemente se pasa a la interfaz sin más modificaciones.
Aquí está la sintaxis generalizada para una interfaz genérica:

interface nombre-interfaz<lista-parametros-tipo> { // ...

Aquí, lista-parametros-tipo es una lista de parámetros de tipo separados por comas. Cuando se implementa una interfaz genérica, debe especificar los argumentos de tipo, como se muestra aquí:

class nombre-clase<lista-parametros-tipo> implements nombre-interfaz<lista-parametros-tipo> {

*/