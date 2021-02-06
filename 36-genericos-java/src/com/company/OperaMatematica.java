package com.company;

/**********************************************************************************************************************
 6. Tipos Limitados
 En los ejemplos anteriores, los parámetros de tipo podrían reemplazarse por cualquier tipo de clase. Esto está bien
 para muchos propósitos, pero a veces es útil limitar los tipos que se pueden pasar a un parámetro de tipo.

 Por ejemplo, suponga que desea crear una clase genérica que almacene un valor numérico y que sea capaz de
 realizar diversas funciones matemáticas, como calcular el recíproco u obtener la parte fraccionaria. Además,
 desea utilizar la clase para calcular estas cantidades para cualquier tipo de número, incluidos integers, floats, y
 doubles. Por lo tanto, desea especificar el tipo de los números genéricamente, utilizando un parámetro de tipo. Para
 crear una clase así, puedes intentar algo como esto:

 // OperaMat intenta (sin éxito) crear una clase genérica
 // que puede calcular varias funciones numéricas,
 // como el recíproco o parte fraccionaria, dado cualquier tipo de número. */

public class OperaMatematica<T> {

    T num;

    // Pase al constructor una referencia a un objeto numérico.
    OperaMatematica(T n) {
        this.num = n;
    }

    // Devuelve el reciproco
    /*double reciproco(){
        return 1/num.doubleValue(); // Error
    }*/

    // Devuelve la parte fraccionaria
    /*double fraccion(){
        return num.doubleValue() - num.intValue(); // Error!
    }*/

}

class generi {
    public static void main(String[] args) {

    }
}

/*
Desafortunadamente, OperaMate no se compilará como está escrito porque ambos métodos generarán errores en
tiempo de compilación.

Primero, examine el método reciproco(), que intenta devolver el recíproco de num. Para hacer esto, debe dividir 1 por
 el valor de num. El valor de num se obtiene llamando a doubleValue(), que obtiene la versión double del objeto
 numérico almacenado en num. Debido a que todas las clases numéricas, como Integer y Double, son subclases de
 Number, y Number define el método doubleValue(), este método está disponible para todas las clases wrapper numéricas.
El problema es que el compilador no tiene manera de saber que tiene la intención de crear objetos OperaMate utilizando
únicamente tipos numéricos. Por lo tanto, cuando intenta compilar OperaMate, se informa un error que indica que
el método doubleValue() es desconocido. El mismo tipo de error ocurre dos veces en fraccion(), que necesita llamar
tanto a doubleValue() como a intValue(). Ambas llamadas dan como resultado mensajes de error que indican que estos
métodos son desconocidos.
Para resolver este problema, necesita alguna manera de decirle al compilador que tiene la intención de pasar solo los
tipos numéricos a T. Además, necesita alguna forma de asegurarse de que solo se pasen los tipos numéricos.
*/
