package com.company;

/**********************************************************************************************************************
 1. Métodos Genéricos

 Como se ha mostrado en los ejemplos anteriores, los métodos dentro de una clase genérica pueden hacer uso de un
 parámetro de tipo de clase y, por lo tanto, son automáticamente genéricos en relación con el parámetro de tipo. Sin
 embargo, es posible declarar un método genérico que usa uno o más parámetros de tipo propios. Además, es posible
 crear un método genérico que se incluye dentro de una clase no genérica.

 El siguiente programa declara una clase no genérica llamada DemoMetodoGenerico y un método genérico estático
 dentro de esa clase llamado igualArrays(). Este método determina si dos matrices contienen los mismos elementos, en
 el mismo orden. Se puede usar para comparar dos matrices siempre que las matrices sean del mismo tipo o
 compatibles y los elementos de la matriz sean, en sí mismos, comparables.
 */

// Demostrar un simple método genérico
public class DemoMetodoGenerico {

    //Determine si el contenido de dos matrices es el mismo
    static <T extends Comparable<T>, V extends T> boolean igualArrays(T[] x, T[] y) {

        //Si las longitudes de los array son diferentes, entonces  los array son diferentes
        if (x.length != y.length) return false;

        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])) return false; //arrays diferentes
        }
        return true; // si el contenido de los arrays son equivalentes
    }

    public static void main(String[] args) {

        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 4, 5};
        Integer nums3[] = {1, 2, 7, 4, 5};
        Integer nums4[] = {1, 2, 7, 4, 5, 6};

        if (igualArrays(nums, nums)) System.out.println("nums es igual a nums");
        if (igualArrays(nums, nums2)) System.out.println("nums es igual a nums2");
        if (igualArrays(nums, nums3)) System.out.println("nums es igual a nums3");
        if (igualArrays(nums, nums4)) System.out.println("nums es igual a nums4");

        // Crea un array de double
        Double[] dvals = {1.1, 2.2, 3.3, 4.4, 5.5};
        // Esto no compilara porque nums y dvals no son del mismo tipo.
        //if (igualArrays(nums, dvals)) System.out.println("nums es igual a dvals");


    }
}

/*********************************************************************************************************************
 1.1. Explicación del código
 Examinemos igualArrays() de cerca. Primero, observe cómo se declara por esta línea:

 static <T extends Comparable<T>, V extends T> boolean
 igualArrays (T[] x, T[] y){

 Los parámetros de tipo se declaran antes del tipo de devolución del método. También tenga en cuenta que T se
 extiende de Comparable <T>. Comparable es una interfaz declarada en java.lang. Una clase que implementa Comparable
 define objetos que se pueden ordenar. Por lo tanto, requerir un límite superior de Comparable garantiza que
 igualArrays() solo se pueda usar con objetos que puedan compararse.

 Comparable es genérico y su parámetro de tipo especifica el tipo de objetos que compara. (En breve, verá cómo crear
 una interfaz genérica.) A continuación, observe que el tipo V está delimitado por T. Por lo tanto, V debe ser el
 mismo que el tipo T o una subclase de T. Esta relación refuerza el hecho de que igualArrays() sólo puede llamarse
 con argumentos que sean comparables entre sí. Observe también que igualArrays() es estático, permitiendo que sea
 llamado independientemente de cualquier objeto. Entienda, sin embargo, que los métodos genéricos pueden ser
 estáticos o no estáticos. No hay ninguna restricción a este respecto.

 Ahora, observe cómo se llama a igualArrays() dentro de main() mediante el uso de la sintaxis de llamada normal, sin
 la necesidad de especificar argumentos de tipo. Esto se debe a que los tipos de argumentos se disciernen
 automáticamente, y los tipos de T y V se ajustan en consecuencia. Por ejemplo, en la primera llamada:

 if(igualArrays(nums, nums))
 el tipo de elemento del primer argumento es Integer, lo que hace que Integer se sustituya por T. El tipo de elemento
 del segundo argumento también es Integer, lo que hace que Integer también sea un sustituto de V. Por lo tanto, la
 llamada a igualArrays() es legal, y las dos matrices se pueden comparar.

 1.2. Delimitación de método genérico
 Ahora, observe el código comentado, que se muestra aquí:

 // if(igualArrays(nums,dvals))
 // System.out.println("nums es igual a dvals");
 Si elimina los comentarios y luego intenta compilar el programa, recibirá un error. La razón es que el parámetro
 tipo V está limitado por T en la cláusula extends en la declaración de V. Esto significa que V debe ser de tipo T o
 una subclase de T. En este caso, el primer argumento es de tipo Integer, lo que convierte a T en Integer, pero el
 segundo argumento es de tipo Double, que no es una subclase de Integer. Esto hace que llamar a igualArrays() sea
 ilegal y da como resultado un error de discrepancia de tipo en tiempo de compilación.

 La sintaxis utilizada para crear igualArrays() puede generalizarse. Aquí está la sintaxis de un método genérico:

 <lista-parametro-tipo> ret-tipo nombre-metodo(lista-parametros) { // ...
 En todos los casos, lista-parametro-tipo es una lista de parámetros de tipo separados por comas. Tenga en cuenta que
 para un método genérico, la lista de parámetros de tipo precede al tipo de devolución.

 */