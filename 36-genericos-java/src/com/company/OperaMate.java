package com.company;

/*****************************************************************************************************************
 6.1. Ejemplo de Tipos Limitados (bounded types)

 Para manejar tales situaciones, Java proporciona tipos limitados (bounded types). Al especificar un parámetro de
 tipo, puede crear un límite superior que declara la superclase de la cual se derivan todos los argumentos de
 tipo. Esto se logra mediante el uso de una cláusula extends al especificar el parámetro de tipo, como se muestra aquí:

 <T extends superclass>

 Esto especifica que T puede reemplazarse solo por superclase o subclases de superclase. Por lo tanto, la superclase
 define un límite superior inclusivo.

 Puede usar un límite superior para corregir la clase OperaMate mostrada anteriormente al especificar Number como un
 límite superior, como se muestra aquí:
 */

// OperaMat intenta (con éxito) crear una clase genérica
// que puede calcular varias funciones numéricas,
// como el recíproco o parte fraccionaria, dado cualquier tipo de número.
public class OperaMate<T extends Number> {

    T num;

    // Pase al constructor una referencia a un objeto numerico
    OperaMate(T n) {
        this.num = n;
    }

    // Devuelve el reciproco
    double reciproco() {
        return 1 / num.doubleValue();
    }

    // Devuelve parte fraccionaria
    double fraccion() {
        return num.doubleValue() - num.intValue();
    }
}

// Desmostrar la clase OperaMate
class DemoTipoLimite {

    public static void main(String[] args) {

        OperaMate<Integer> iOb = new OperaMate<>(5);

        System.out.println("El reciproco de 5 es: " + iOb.reciproco());
        System.out.println("La parte fraccionaria de 5 es: " + iOb.fraccion());
        System.out.println();

        OperaMate<Double> dOb = new OperaMate<>(15.25);

        System.out.println("El reciproco de 15.25 es: " + dOb.reciproco());
        System.out.println("La parte fraccionaria de 15.25 es: " + dOb.fraccion());

        // Esto no se compilará
        // Por que String no es una subclase de Number.
        // OperaMate<String> strOb = new OperaMate<>("Errror");
    }
}

/*********************************************************************************************************************
 class OperaMate <T extends Number>{

 Debido a que el tipo T ahora está limitado por Number, el compilador de Java sabe que todos los objetos de tipo T
 pueden llamar a doubleValue() porque es un método declarado por Number. Esto es, en sí mismo, una gran ventaja. Sin
 embargo, como una ventaja adicional, el límite de T también evita que se creen objetos OperaMate no numéricos. Por
 ejemplo, si elimina los comentarios de la línea al final del programa y luego intenta volver a compilar, recibirá
 errores en tiempo de compilación porque String no es una subclase de Number.
 */